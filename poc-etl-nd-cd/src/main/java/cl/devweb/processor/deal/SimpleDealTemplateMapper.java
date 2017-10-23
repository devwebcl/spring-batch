package cl.devweb.processor.deal;

import java.util.Date;

import org.apache.log4j.Logger;

import com.fasterxml.uuid.Generators;

import cl.devweb.model.base.DealTemplateBaseDTO;
import cl.devweb.model.citydeal.DealTemplate;
import cl.devweb.model.citydeal.DealTemplateStatus;
import cl.devweb.model.devwebish.DealND;
import cl.devweb.model.devwebish.DealsPivot;
import cl.devweb.model.devwebish.enums.DealPivotType;
import cl.devweb.processor.CustomMapper;
import cl.devweb.processor.deal.util.DealUtil;


public class SimpleDealTemplateMapper implements CustomMapper {

	private Logger logger = Logger.getLogger(SimpleDealTemplateMapper.class);

	@Override
	public Object map(Object item) throws Exception {

		//here we do the real TRANSFORMATION (into target):
		Object value = null;


		//checking:
        if(item instanceof DealND) {
        	value = doMapping((DealND)item);
        }  else {
            throw new Exception("An invalid item was received: " + item);
        }


		return value;
	}




	//Real mapping:
	public DealTemplateBaseDTO doMapping(DealND item) {

		logger.debug("DealTemplateBaseDTO - debugging.......");

		DealTemplateBaseDTO dtb = new DealTemplateBaseDTO();
		DealsPivot dp = new DealsPivot();
		DealTemplate dt = new DealTemplate();


		// ------------------------------------------------------------------
		//populating DealsPivot
		dp.setId(0); // this will modify with INSERT.

		dp.setType(DealPivotType.DEAL_TEMPLATE);
		dp.setNd_deals_id(item.getDeal().getId());
		dp.setCd_gen_id(0); // generic id that will created after INSERT at deal_template  ********************


		// ------------------------------------------------------------------
		//populating DealTemplate

		//dt.setDtp_id(0); //this will be created by sequence

		//getDeal() has some null's
		dt.setDtp_created(item.getDealextradata().getCreated());

		if(item.getDeal().getModified()!=null) {
			dt.setDtp_last_modified(item.getDeal().getModified());
		} else {
			dt.setDtp_last_modified(new Date());
		}



		//TODO: TBC:
        int code = 0;
        switch (item.getDeal().getStatus()) {
            case "ACTIVE":
                code = DealTemplateStatus.IN_USE.getValue();
                break;
            case "CANCELLED":
                code = DealTemplateStatus.CREATED.getValue();
                break;
            case "COMING":
                code = DealTemplateStatus.CREATED.getValue();
                break;
            case "DELETED":
                code = DealTemplateStatus.CREATED.getValue();
                break;
            case "INREVIEW":
                code = DealTemplateStatus.CREATED.getValue();
                break;
            case "INVALID":
                code = DealTemplateStatus.CREATED.getValue();
                break;
            case "NEW":
                code = DealTemplateStatus.CREATED.getValue();
                break;
            case "NODATE":
                code = DealTemplateStatus.IN_USE.getValue();
                break;
            case "NOIMAGE":
                code = DealTemplateStatus.IN_USE.getValue();
                break;
            case "SENT":
                code = DealTemplateStatus.IN_USE.getValue();
                break;

            default:
                code = DealTemplateStatus.CREATED.getValue();
                break;
        }
		dt.setDtp_status_id(code);


        // appdomains
		dt.setDtp_app_id(item.getCitypivot().getCd_appdomain_id());

		// dtp_dtpc_id integer,     -- deal_template_purchase_control
		//TODO: is it the same value used at DealPurchaseControl ???
		// DealTemplatePurchaseControlWriter ???
		//TODO: analysis to b done: https://jira.devwebdev.com/browse/NM-83
		dt.setDtp_dtpc_id(1); //TODO: I think we must use the same generated in DealPurchaseControl.

		//it will be created in custom writer
		// `salesforce_id` varchar(20) DEFAULT NULL,      -- contrato
		// `so_salesforce_id` varchar(20) DEFAULT NULL,   -- planning record (deal mismo)
		//TODO: TBC: or is "so_salesforce_id" the right field ?
		dt.setDtp_salesforce_id(item.getDeal().getSalesforce_id()); // cd_deal_uuid

        // dr_dm_id integer,   -- deal_merchant
        dt.setDtp_dm_id(item.getMerchantcd().getDm().getDm_id());

        // //we are not migrating merchant_voucher_codes, @deprecated
        dt.setDtp_voucher_pool_id("");  // merchant_voucher_codes

        //deal_class - MULTI/SINGLE
		if (DealUtil.isParentDeal(item.getDeal()) || DealUtil.isChildDeal(item.getDeal()) || DealUtil.isMultiDeal(item.getDeal())) {
			dt.setDtp_deal_class("MULTI");
		}
		else if (DealUtil.isSingleDeal(item.getDeal())) {
			dt.setDtp_deal_class("SINGLE");
		}

		//TODO: TBC
		dt.setDtp_participant_minimum(1);

		//TODO: TBC
		dt.setDtp_participant_maximum(item.getDeal().getMax_coupons());

		//TODO: TBC
		dt.setDtp_buy_limit_per_user(item.getDeal().getMax_coupons_per_buy());

		//TODO: num_migrated_images : image original_path !!!!
		//		- deal_images !!!!
		//		- deal.picture         getCdDeal().getPicture()  (principal)
		//TODO: analysis to be done: https://jira.devwebdev.com/browse/NM-82
		dt.setDtp_image_large(item.getDeal().getPicture());
		dt.setDtp_image_medium(item.getImage().getOriginal_path());
		dt.setDtp_image_small(item.getImage().getOriginal_path());
		dt.setDtp_image_extra_small(item.getImage().getOriginal_path());

		// TODO: TBC: N/A ?
		dt.setDtp_dealbank_runtime_days(10);

		dt.setDtp_guid(Generators.randomBasedGenerator().generate());

		dt.setDtp_mulligan_enabled(item.getDeal().getMulligan());

		//TODO: DSC == Deal Supply Chain ?
		dt.setDtp_is_dsc(false);



		//final DTO
		dtb.setDealspivot(dp);
		dtb.setDt(dt);

		return dtb;

	}



}

