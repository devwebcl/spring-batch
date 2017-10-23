package cl.devweb.model.citydeal;

public class DealCD {

	//using small names for query in XML keep readable :)
	Appdomains app;
	CdDealUuid cdid;
	CityDeals cd;
	DealLimitGroup dlg;
	DealMerchant dm;
	DealPurchaseControl dpc;
	DealRedirectType drdrt;
	DealRun dr;
	DealRunOption dro;
	DealRunStatus drs;
	DealRunType drt;
	DealTemplate dtp;
	DealTemplateOption dto;
	DealTemplatePurchaseControl dtpc;
	DealTemplateStatus dts;
	DealType dt;
	MerchantVoucherCodes mvc;
	ParticipantCities ptc;
	VoucherDeliveryEvent vde;

	String operation;


	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public Appdomains getApp() {
		return app;
	}
	public void setApp(Appdomains app) {
		this.app = app;
	}
	public CdDealUuid getCdid() {
		return cdid;
	}
	public void setCdid(CdDealUuid cdid) {
		this.cdid = cdid;
	}
	public CityDeals getCd() {
		return cd;
	}
	public void setCd(CityDeals cd) {
		this.cd = cd;
	}
	public DealLimitGroup getDlg() {
		return dlg;
	}
	public void setDlg(DealLimitGroup dlg) {
		this.dlg = dlg;
	}
	public DealMerchant getDm() {
		return dm;
	}
	public void setDm(DealMerchant dm) {
		this.dm = dm;
	}
	public DealPurchaseControl getDpc() {
		return dpc;
	}
	public void setDpc(DealPurchaseControl dpc) {
		this.dpc = dpc;
	}
	public DealRedirectType getDrdrt() {
		return drdrt;
	}
	public void setDrdrt(DealRedirectType drdrt) {
		this.drdrt = drdrt;
	}
	public DealRun getDr() {
		return dr;
	}
	public void setDr(DealRun dr) {
		this.dr = dr;
	}
	public DealRunOption getDro() {
		return dro;
	}
	public void setDro(DealRunOption dro) {
		this.dro = dro;
	}
	public DealRunStatus getDrs() {
		return drs;
	}
	public void setDrs(DealRunStatus drs) {
		this.drs = drs;
	}
	public DealRunType getDrt() {
		return drt;
	}
	public void setDrt(DealRunType drt) {
		this.drt = drt;
	}
	public DealTemplate getDtp() {
		return dtp;
	}
	public void setDtp(DealTemplate dtp) {
		this.dtp = dtp;
	}
	public DealTemplateOption getDto() {
		return dto;
	}
	public void setDto(DealTemplateOption dto) {
		this.dto = dto;
	}
	public DealTemplatePurchaseControl getDtpc() {
		return dtpc;
	}
	public void setDtpc(DealTemplatePurchaseControl dtpc) {
		this.dtpc = dtpc;
	}
	public DealTemplateStatus getDts() {
		return dts;
	}
	public void setDts(DealTemplateStatus dts) {
		this.dts = dts;
	}
	public DealType getDt() {
		return dt;
	}
	public void setDt(DealType dt) {
		this.dt = dt;
	}
	public MerchantVoucherCodes getMvc() {
		return mvc;
	}
	public void setMvc(MerchantVoucherCodes mvc) {
		this.mvc = mvc;
	}
	public ParticipantCities getPtc() {
		return ptc;
	}
	public void setPtc(ParticipantCities ptc) {
		this.ptc = ptc;
	}
	public VoucherDeliveryEvent getVde() {
		return vde;
	}
	public void setVde(VoucherDeliveryEvent vde) {
		this.vde = vde;
	}


}

