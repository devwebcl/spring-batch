package cl.devweb.model.citydeal;

import java.util.UUID;

public class CdDealUuid {

	private int cd_id;
    private String cd_salesforce_id;
    private UUID cd_deal_uuid;


	public int getCd_id() {
		return cd_id;
	}
	public void setCd_id(int cd_id) {
		this.cd_id = cd_id;
	}
	public String getCd_salesforce_id() {
		return cd_salesforce_id;
	}
	public void setCd_salesforce_id(String cd_salesforce_id) {
		this.cd_salesforce_id = cd_salesforce_id;
	}
	public UUID getCd_deal_uuid() {
		return cd_deal_uuid;
	}
	public void setCd_deal_uuid(UUID cd_deal_uuid) {
		this.cd_deal_uuid = cd_deal_uuid;
	}


}


