package cl.devweb.mapper.reader.deal;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.RowMapper;

import cl.devweb.model.citydeal.DealMerchant;
import cl.devweb.model.citydeal.MerchantCD;
import cl.devweb.model.devwebish.CityDealsPivot;
import cl.devweb.model.devwebish.CityPivot;
import cl.devweb.model.devwebish.Deal;
import cl.devweb.model.devwebish.DealExtraData;
import cl.devweb.model.devwebish.DealND;


// Reader

public class DealRunRowMapper implements RowMapper<DealND> {

	private Logger logger = Logger.getLogger(DealRunRowMapper.class);

	@Override
	public DealND mapRow(ResultSet rs, int rowNum) throws SQLException {

		//logger.debug("reader (mapRow)..." + rowNum );

		DealND dealnd = new DealND();

		Deal deal = new Deal();
		DealExtraData dealextradata = new DealExtraData();
		CityPivot citypivot = new CityPivot();
		CityDealsPivot citydealspivot = new CityDealsPivot();
		MerchantCD merchantcd = new MerchantCD();


		deal.setId(rs.getLong("deal.id"));
		deal.setTitle(rs.getString("deal.title"));
		deal.setSalesforce_id(rs.getString("deal.salesforce_id"));
		deal.setShort_title(rs.getString("deal.short_title"));
		deal.setCoupon_title(rs.getString("deal.coupon_title"));
		deal.setPicture(rs.getString("deal.picture"));
		deal.setSlug(rs.getString("deal.slug"));
		deal.setTipping_point(rs.getLong("deal.tipping_point"));
		deal.setCountry_id(rs.getLong("deal.country_id"));
		deal.setCompany_id(rs.getLong("deal.company_id"));
		deal.setCity_id(rs.getLong("deal.city_id"));
		deal.setCategory_id(rs.getLong("deal.category_id"));
		deal.setDate(rs.getDate("deal.date"));
		deal.setDue_date(rs.getDate("deal.due_date"));

		deal.setExpiration_date(rs.getDate("deal.expiration_date"));
		if(deal.getExpiration_date()==null) {
			deal.setExpiration_date(new Date());
		}

		deal.setDiscount(rs.getLong("deal.discount"));
		deal.setPartner_original_price(rs.getLong("deal.partner_original_price"));
		deal.setPartner_special_price(rs.getLong("deal.partner_special_price"));
		deal.setParent_deal_id(rs.getLong("deal.parent_deal_id"));
		deal.setMax_coupons(rs.getLong("deal.max_coupons"));
		deal.setMax_coupons_per_buy(rs.getLong("deal.max_coupons_per_buy"));
		deal.setSold_qty(rs.getLong("deal.sold_qty"));
		deal.setInit_coupons(rs.getLong("deal.init_coupons"));
		deal.setStock_management(rs.getBoolean("deal.stock_management"));
		deal.setDeal_type_id(rs.getLong("deal.deal_type_id"));
		deal.setStatus(rs.getString("deal.status"));
		deal.setDeal_type_id(rs.getLong("deal.deal_type_id"));
		deal.setDetails(rs.getString("deal.details"));
		deal.setType(rs.getString("deal.type"));
		deal.setType2(rs.getString("deal.type2"));
		deal.setShipping_courier(rs.getLong("deal.shipping_courier"));
		deal.setShipping(rs.getLong("deal.shipping"));
		deal.setHighlights(rs.getString("deal.highlights"));
		deal.setFinal_price(rs.getDouble("deal.final_price"));
		deal.setValue(rs.getDouble("deal.value"));
		deal.setDescription(rs.getString("deal.description"));
		deal.setAdditional_info(rs.getBoolean("deal.additional_info"));
		deal.setCommission(rs.getLong("deal.commission"));
		deal.setNl_title(rs.getString("deal.nl_title"));
		deal.setMulligan(rs.getBoolean("deal.mulligan"));
		deal.setMulligan_days(rs.getLong("deal.mulligan_days"));
		dealextradata.setId(rs.getLong("dealextradata.id"));

		dealextradata.setInit_coupon_date(rs.getDate("dealextradata.init_coupon_date"));
		if(dealextradata.getInit_coupon_date()==null) {
			dealextradata.setInit_coupon_date(new Date());
		}

		dealextradata.setGender_code(rs.getLong("dealextradata.gender_code"));
		dealextradata.setTemplate_deal_id(rs.getLong("dealextradata.template_deal_id"));
		dealextradata.setSharing_stock(rs.getBoolean("dealextradata.sharing_stock"));

		//TODO: can we use a different default value ? ("ACTIVE" for instance)
		dealextradata.setDealbank_status(rs.getString("dealextradata.dealbank_status"));
		if(dealextradata.getDealbank_status()==null) {
			dealextradata.setDealbank_status("");
		}

		dealextradata.setBusiness_unit(rs.getString("dealextradata.business_unit"));
		dealextradata.setCoupon_duration(rs.getLong("dealextradata.coupon_duration"));
		dealextradata.setPayment_offline(rs.getBoolean("dealextradata.payment_offline"));

		dealextradata.setModified(rs.getDate("dealextradata.modified"));
		if(dealextradata.getModified()==null) {
			dealextradata.setModified(new Date());
		}

		dealextradata.setCreated(rs.getDate("dealextradata.created"));
		if(dealextradata.getCreated()==null) {
			dealextradata.setCreated(new Date());
		}

		citypivot.setN_city_id(rs.getInt("city_pivot.n_city_id"));
		citypivot.setCd_city_id(rs.getInt("city_pivot.cd_city_id"));
		citypivot.setCd_appdomain_id(rs.getInt("city_pivot.cd_appdomain_id"));

		citydealspivot.setCd_id(rs.getInt("city_deals_pivot.cd_id"));
		citydealspivot.setCd_mulligan_parent(rs.getInt("city_deals_pivot.cd_mulligan_parent"));

		DealMerchant dm = new DealMerchant();
		dm.setDm_id(rs.getInt("merchants_pivot.cd_dm_merchant_id"));
		merchantcd.setDm(dm);



		dealnd.setDeal(deal);
		dealnd.setDealextradata(dealextradata);
		dealnd.setCitypivot(citypivot);
		dealnd.setCitydealspivot(citydealspivot);

		dealnd.setMerchantcd(merchantcd);


		return dealnd;
	}



}

