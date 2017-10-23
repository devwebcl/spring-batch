package cl.devweb.model;


public class SimpleDealMapper implements DealMapper {

	@Override
	public Users_billing_history map(Deal deal) {
		
		//here we do the real TRANSFORMATION:
		
		Users_billing_history ubh = new Users_billing_history();
		
		ubh.setUbh_id(deal.getId());
		ubh.setUbh_created(deal.getDate());
		ubh.setUbh_user_id(deal.getBrand_id());
		ubh.setUbh_payment_provider_id(deal.getStatus());
		ubh.setUbh_chargeback_reason(deal.getType2());
		
		return ubh;
	}
	
}

