package cl.devweb.processor.deal;


import org.apache.log4j.Logger;

import com.fasterxml.uuid.Generators;

import cl.devweb.model.citydeal.DealCD;
import cl.devweb.model.citydeal.DealRun;
import cl.devweb.model.citydeal.DealRunStatus;
import cl.devweb.model.citydeal.DealRunType;
import cl.devweb.model.citydeal.DealType;
import cl.devweb.model.devwebish.DealND;
import cl.devweb.processor.CustomMapper;


public class SimpleDealRunMapper implements CustomMapper {

	private Logger logger = Logger.getLogger(SimpleDealRunMapper.class);

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
	public DealCD doMapping(DealND item) {

		logger.debug("deal run ...");


		DealCD dcd = new DealCD();


		// Classifier operation:
		//TODO: hardcoded by now, maybe it won't be necessary
		dcd.setOperation("2");





		// ------------------------------------------------------------------
		//DealRun
		DealRun dr = new DealRun();

		//impl NEXTVAL at ItemWriter
		//dr.setDr_id(); // auto-generated from nextval

		//TODO: TBC: init_coupon_date? or getCreated? or deal.setDate ?
		dr.setDr_created(item.getDealextradata().getCreated());

		//TODO: TBC:
		dr.setDr_last_modified(item.getDealextradata().getModified());

		//  -- deal_template    *************************************************************
		// TODO: this must be ID from CD template ID !!!!!
		dr.setDr_dtp_id(item.getDealextradata().getTemplate_deal_id());

		//  -- CityDeals
		dr.setDr_cd_id(item.getCitydealspivot().getCd_id());

		//TODO: TBC:
		dr.setDr_start_time(item.getDealextradata().getInit_coupon_date());

		//TODO: TBC:
		dr.setDr_end_time(item.getDeal().getExpiration_date());  // NOT NULL
		dr.setDr_participant_minimum(item.getDeal().getInit_coupons());
		dr.setDr_participant_maximum(item.getDeal().getMax_coupons());
		dr.setDr_buy_limit_per_user(item.getDeal().getMax_coupons_per_buy());

		// dr.setDr_feature_id(); // this is deprecated at City Deals (GDS-8042)
		// https://confluence..com/display/ITDEV/PurchaseControlDataManagement
		// https://confluence..com/display/ITDEV/FeatureID+Deals
		// points to: N/A
		dr.setDr_feature_id("");  // (uat only with empty strings and "24 hours")


		//TODO: TBC:
        int code = 0;
        switch (item.getDeal().getStatus()) {
            case "ACTIVE":
                code = DealRunStatus.ACTIVE.getValue();
                break;
            case "CANCELLED":
                code = DealRunStatus.CLOSED.getValue();
                break;
            case "COMING":
                code = DealRunStatus.SCHEDULED.getValue();
                break;
            case "DELETED":
                code = DealRunStatus.DELETED.getValue();
                break;
            case "INREVIEW":
                code = DealRunStatus.DEAL_CREATED.getValue();
                break;
            case "INVALID":
                code = DealRunStatus.INACTIVE.getValue();
                break;
            case "NEW":
                code = DealRunStatus.SCHEDULED.getValue();
                break;
            case "NODATE":
                code = DealRunStatus.DEAL_CREATED.getValue();
                break;
            case "NOIMAGE":
                code = DealRunStatus.DEAL_CREATED.getValue();
                break;
            case "SENT":
                code = DealRunStatus.ACTIVE.getValue();
                break;

            default:
                code = DealRunStatus.DEAL_CREATED.getValue();
                break;
        }
        dr.setDr_status_id(code);



        //  -- deal_run_type

        //TODO: featured?
        // code = DealRunType.PREFEATURED.getValue();

        //default:
        code = DealRunType.NORMAL.getValue();

        if (item.getDeal().getMulligan()) {
        	code = DealRunType.MULLIGAN.getValue();
        }

        if(item.getDeal().getType().equals("DEALBANK")) {
	        switch (item.getDealextradata().
	        		getDealbank_status()) {
	            case "ACTIVE":
	            	 code = DealRunType.DEALBANK.getValue();
	                break;
	            case "ONHOLD":
	            	 code = DealRunType.DEALBANK.getValue();
	                break;

	            default:
	                code = DealRunType.NORMAL.getValue();
	                break;
	        }
        }
        dr.setDr_type_id(code);


        dr.setDr_mulligan_parent_cd_id(item.getCitydealspivot().getCd_mulligan_parent());

        // -- participant_cities
        dr.setDr_ptc_id(item.getCitypivot().getCd_city_id());  // city_pivot.n_city_id

        // dr_dm_id integer,   -- deal_merchant
        dr.setDr_dm_id(item.getMerchantcd().getDm().getDm_id());


        // dr_deal_type_id smallint, -- deal_type
        /* enum: cl.devweb.model.devwebish.enums.DealTypesND
	    	MAIN
	    	SIDE
	    	HIDDEN
	    	WELCOME
	    	FLASH
	    	TEASER
	    	NULL
	    	DEAL_TEMPLATE
	    	DEALBANK
         */
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
        dr.setDr_deal_type_id(code);



        // N/A
        dr.setDr_deal_priority(0);  // DEFAULT 0 NOT NULL,

        // dr_app_id smallint,   -- appdomains
        dr.setDr_app_id(item.getCitypivot().getCd_appdomain_id());

        // TODO: dr_salesforce_scheduling_detail_id text,  --- ?  in city_deals & deal_run_option:  -- most empty at UAT
        dr.setDr_salesforce_scheduling_detail_id("");


        //dr_guid uuid
        dr.setDr_guid(Generators.randomBasedGenerator().generate());





        //final DTO
		dcd.setDr(dr);


		return dcd;

	}




}

