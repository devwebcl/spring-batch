package cl.devweb.processor.deal;

import java.util.Date;

import org.apache.log4j.Logger;
import org.postgresql.util.PGInterval;

import cl.devweb.model.base.CityDealsBaseDTO;
import cl.devweb.model.citydeal.CityDeals;
import cl.devweb.model.citydeal.DealEmailType;
import cl.devweb.model.citydeal.DealRedirectType;
import cl.devweb.model.citydeal.DealState;
import cl.devweb.model.citydeal.DealType;
import cl.devweb.model.devwebish.CityDealsPivot;
import cl.devweb.model.devwebish.Deal;
import cl.devweb.model.devwebish.DealND;
import cl.devweb.processor.CustomMapper;
import cl.devweb.processor.deal.util.DealUtil;


public class SimpleCityDealsMapper implements CustomMapper {

	private Logger logger = Logger.getLogger(SimpleCityDealsMapper.class);


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
	public CityDealsBaseDTO doMapping(DealND item) {

		logger.debug("CityDealsBaseDTO doMapping()...");


		CityDealsBaseDTO cdb = new CityDealsBaseDTO();
		CityDeals cd = new CityDeals();
		CityDealsPivot cdp = new CityDealsPivot();



		// ------------------------------------------------------------------
		//populating CityDealsPivot
		cdp.setNd_deals_id(item.getDeal().getId());
		cdp.setCd_id(0); // resolved after Insert at CD
		cdp.setCd_mulligan_enabled(item.getDeal().getMulligan());
		cdp.setCd_mulligan_parent(0 /*item.getDeal().getShort_title()*/ );  //TODO: unknown value
		cdp.setCd_appdomain_id(item.getCitypivot().getCd_appdomain_id());


		// ------------------------------------------------------------------
		//populating CityDeals

		//cd.setCd_id(0); //this will be created by sequence

		cd.setCd_ptc_city_id(item.getCitypivot().getCd_city_id());  // participant_cities

		//TODO: TBC
		cd.setCd_meta_title(item.getDeal().getTitle());

		cd.setCd_meta_description(item.getDeal().getDescription());

		//TODO: TBC: all empty strings are unknown values:
		cd.setCd_meta_keywords("");

		cd.setCd_title(item.getDeal().getTitle());
		cd.setCd_short_description(item.getDeal().getShort_title());

		cd.setCd_short_highlights("");

		cd.setCd_long_description(item.getDeal().getDescription());

		//TODO: TBC:
		cd.setCd_image_big(item.getDeal().getPicture());  // ie: "/00/00/large0000.jpg" //TODO: how is it impl at devwebish ?

		//TODO: TBC:
		// N/A
		cd.setCd_image_small("");  // ie: "/00/00/large0000.jpg" //TODO: how is it impl at devwebish ?

		cd.setCd_merchant_id(item.getDeal().getCompany_id());   // merchant?

		//TODO: TBC
		cd.setCd_original_price_gross((double)item.getDeal().getPartner_original_price());
		//TODO: TBC
		cd.setCd_special_price_gross((double)item.getDeal().getPartner_special_price());
		//TODO: TBC
		cd.setCd_special_price_tax(item.getDeal().getCommission_tax() );

		//TODO: TBC
		cd.setCd_participant_minimum(1);
		//TODO: TBC
		cd.setCd_participant_maximum(item.getDeal().getMax_coupons());

		//TODO: TBC
		cd.setCd_deal_start_time(item.getDealextradata().getCreated());

		//TODO: TBC
		cd.setCd_deal_end_time(item.getDeal().getExpiration_date());

		//TODO: TBC:
        int code = 0;
        switch (item.getDeal().getStatus()) {
            case "ACTIVE":
                code = DealState.DEAL_PUBLISHED.getValue();
                break;
            case "CANCELLED":
                code = DealState.DEAL_CLOSED_WITHOUT_SUCCESS.getValue();
                break;
            case "COMING":
                code = DealState.DEAL_CREATED.getValue();
                break;
            case "DELETED":
                code = DealState.DEAL_DELETED.getValue();
                break;
            case "INREVIEW":
                code = DealState.DEAL_CREATED.getValue();
                break;
            case "INVALID":
                code = DealState.DEAL_CLOSED_WITHOUT_SUCCESS.getValue();
                break;
            case "NEW":
                code = DealState.DEAL_CREATED.getValue();
                break;
            case "NODATE":
                code = DealState.DEAL_CREATED.getValue();
                break;
            case "NOIMAGE":
                code = DealState.DEAL_CREATED.getValue();
                break;
            case "SENT":
                code = DealState.DEAL_PUBLISHED.getValue();
                break;

            default:
                code = DealState.DEAL_CREATED.getValue();
                break;
        }
		cd.setCd_deal_status(code);  //  deal_state

		//TODO: TBC
		// N/A
		cd.setCd_newsletter_subject("");
		cd.setCd_newsletter_textblock("");

		//TODO: TBC
		// N/A
		cd.setCd_participant_current(3);

		//TODO: TBC
		// N/A
		cd.setCd_image_newsletter("");

		cd.setCd_title_for_url_permalink(item.getDeal().getPermalink());  // NULL in devwebish Prod.

		//TODO: TBC:
        code = 0;
        switch (item.getDeal().getStatus()) {
            case "ACTIVE":
                code = DealEmailType.ONLINE_VOUCHER.getValue();
                break;
            case "CANCELLED":
                code = DealEmailType.OFFLINE_VOUCHER.getValue();
                break;

            default:
                code = DealEmailType.GENERATED.getValue();
                break;
        }
		cd.setCd_deal_email_type(code);  //  deal_email_type


		cd.setCd_coupon_valid_from(item.getDeal().getCreated());
		cd.setCd_coupon_valid_until(item.getDeal().getExpiration_date());


		//resolved in custom writer
		cd.setCd_dlg_id(1);  // deal_limit_group


		if(item.getDeal().getModified()!=null) {
			cd.setCd_last_modified(item.getDeal().getModified());
		} else {
			cd.setCd_last_modified(new Date());
		}

		//TODO: TBC: en general los Deals no tiene relacion con newsletter en tabla Deals de devwebish ???
		cd.setCd_scheduled_for_newsletter(true);

		//TODO: TBC
		cd.setCd_customer_index_max(1);

		//TODO: TBC:
        code = 0;
        switch (item.getDeal().getType()) {
        case "MAIN":
        	code = DealType.MAIN_DEAL.getValue();
            break;
        case "SIDE":
        	code = DealType.SIDE_DEAL.getValue();
            break;
        case "WELCOME":
        	code = DealType.LANDINGPAGE_DEAL.getValue();
            break;

        default:
            code = DealType.NOW_DEAL.getValue();
            break;
        }
		cd.setCd_deal_type_id(code);  //  deal_type


		//it will be created in custom writer
		// `salesforce_id` varchar(20) DEFAULT NULL,      -- contrato
		// `so_salesforce_id` varchar(20) DEFAULT NULL,   -- planning record (deal mismo)
		//TODO: TBC: or is "so_salesforce_id" the right field ?
		cd.setCd_salesforce_id(item.getDeal().getSalesforce_id()); // cd_deal_uuid


		cd.setCd_deal_title_coupon(item.getDeal().getCoupon_title());

		//TODO: TBC
		// N/A
		cd.setCd_coupon_how_it_works(1);

		cd.setCd_appdomain_id(item.getCitypivot().getCd_appdomain_id());  // appdomain

		//TODO: TBC
		// N/A
		cd.setCd_sidedeal_image("");

		//TODO: TBC
		cd.setCd_deal_priority(1);

		//TODO: TBC
		// N/A
		cd.setCd_newsletter_title("");

		//TODO: TBC
		// N/A
		cd.setCd_newsletter_side_deal_title("");

		// COMMENT ON COLUMN city_deals.cd_multideal_type IS 'SINGLE, CHILD, CONTAINER';  DEFAULT 'SINGLE'::text NOT NULL,
		// parent
		if (DealUtil.isParentDeal(item.getDeal())) {
			cd.setCd_multideal_type("CONTAINER");
		}
		// child
		else if (DealUtil.isChildDeal(item.getDeal())) {
			cd.setCd_multideal_type("CHILD");
		}
		// single
		else if (DealUtil.isSingleDeal(item.getDeal())) {
			cd.setCd_multideal_type("SINGLE");
		}
		// multideal
		//else if(isMultiDeal(item.getDeal())){
		//	cd.setCd_multideal_type("");
		//}

		cd.setCd_multideal_parent(item.getDeal().getParent_deal_id());

		//TODO: TBC
		// N/A
		cd.setCd_voucher_send_by_sms(false);  //  DEFAULT false


		//TODO: TBC
		// N/A
		cd.setCd_voucher_delivery_event("DEAL_CLOSED");  // DEFAULT 'DEAL_CLOSED'::text NOT NULL,   --  ['DEAL_CLOSED'::text, 'PAYMENT_SUCCESS'::text]

		//TODO: TBC
		// N/A
		cd.setCd_sms_prefix("");

		//TODO: TBC
		// N/A
		cd.setCd_mobile_description("");

		//TODO: TBC
		// @deprecated (it is not going to be migrated)
		cd.setCd_mvc_pool_id("31415926-5358-9793-2384-626433832795");  // merchant_voucher_codes

		cd.setCd_mulligan_enabled(item.getDeal().getMulligan());

		//TODO: TBC
		// N/A
		cd.setCd_mulligan_parent(1);

		//TODO: TBC:
		//OOS: canonical tag - used by the CanonicalTagFilter, which sets an attribute "useCanonicalTag" to the request.
		//If present the layout.jsp includes a canonical link for the value of that attribute
		cd.setCd_canonical_tag("NA");

		//TODO: TBC
		// N/A
		cd.setCd_salesforce_scheduling_detail_id("");  // in city_deals & deal_run_option:  -- most empty at uat

		// this is resolved later with a custom writer
		cd.setCd_dpc_id(1);     // deal_purchase_control

		//TODO: TBC
		cd.setCd_buy_limit_per_user(item.getDeal().getMax_coupons_per_buy());

		//TODO
		// N/A
		cd.setCd_salesforce_feature_id("");   // ?

		//getDeal() has some null's
		cd.setCd_created(item.getDealextradata().getCreated());

		cd.setCd_blacklisted(false);

		//TODO: TBC:
        code = 0;
        switch (item.getDeal().getType()) {
        case "MAIN":
        	code = DealRedirectType.OFF.getValue();
            break;
        case "SIDE":
        	code = DealRedirectType.CITY.getValue();
            break;
        case "WELCOME":
        	code = DealRedirectType.URL.getValue();
            break;

        default:
            code = DealType.NOW_DEAL.getValue();
            break;
        }
        // most 0 in UAT
		cd.setCd_drdrt_id(code);  //   deal_redirect_type

		//TODO: unknown
		cd.setCd_redirect_url("");

		int years = 0;
		int months = 0;
		int days =30;
		int hours = 0;
		int minutes = 0;
		double seconds = 0;
		cd.setCd_expiration_period( new PGInterval( years, months, days, hours, minutes, seconds) );



		//final DTO
		cdb.setCitydeals(cd);
		cdb.setCitydealspivot(cdp);



		return cdb;

	}




}

