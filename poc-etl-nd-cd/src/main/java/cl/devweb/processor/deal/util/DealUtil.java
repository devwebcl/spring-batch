package cl.devweb.processor.deal.util;

import cl.devweb.model.devwebish.Deal;

public class DealUtil {

    public static Boolean isParentDeal(Deal deal) {
        return deal.getParent_deal_id() != null && deal.getParent_deal_id() == 0 &&
        	   deal.getDeal_type_id() != null && deal.getDeal_type_id() == 2 && isMultiDeal(deal);
    }

    public static Boolean isChildDeal(Deal deal) {
        return deal.getParent_deal_id() != null && deal.getParent_deal_id() != 0 &&
        	   deal.getDeal_type_id() != null && deal.getDeal_type_id() == 1 && isSingleDeal(deal);
    }

    public static Boolean isMultiDeal(Deal deal) {
        return deal.getDeal_type_id() != null && deal.getDeal_type_id() == 2;
    }

    public static Boolean isSingleDeal(Deal deal) {
        return deal.getDeal_type_id() != null && deal.getDeal_type_id() == 1;
    }


}
