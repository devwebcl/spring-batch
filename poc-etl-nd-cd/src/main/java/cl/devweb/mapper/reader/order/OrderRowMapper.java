package cl.devweb.mapper.reader.order;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import org.apache.log4j.Logger;
import org.springframework.jdbc.core.RowMapper;

import cl.devweb.model.devwebish.CityDealsPivot;
import cl.devweb.model.devwebish.Coupon;
import cl.devweb.model.devwebish.CouponInvalidationReason;
import cl.devweb.model.devwebish.Deal;
import cl.devweb.model.devwebish.DealExtraData;
import cl.devweb.model.devwebish.OrderND;
import cl.devweb.model.devwebish.Payment;
import cl.devweb.model.devwebish.PaymentIncentive;
import cl.devweb.model.devwebish.TrackingPayment;
import cl.devweb.model.devwebish.UserPivot;
import cl.devweb.model.devwebish.enums.CountryEnum;


// Reader

public class OrderRowMapper implements RowMapper<OrderND> {

    private final Logger logger = Logger.getLogger(OrderRowMapper.class);

    @Override
    public OrderND mapRow(ResultSet rs, int rowNum) throws SQLException {

        //logger.debug("reader (mapRow)..." + rowNum );
        OrderND order = new OrderND();

        Deal deal = new Deal();
        Payment payment = new Payment();
        CityDealsPivot dealPivot = new CityDealsPivot();
        UserPivot user = new UserPivot();
        DealExtraData dealextradata = new DealExtraData();
        PaymentIncentive paymentincentive = new PaymentIncentive();
        TrackingPayment trackingpayments = new TrackingPayment();
        Coupon coupon = new Coupon();
        CouponInvalidationReason couponInvalidationReason = new CouponInvalidationReason();

        // each row as ID, it may clash... it must be an unique identifier (uuid?)
        //Query from Facade of api-v3:
        //TODO: we could use Builder pattern... nah

        payment.setId(rs.getInt("payment.id"));
        payment.setUser_id(rs.getLong("payment.user_id"));
        payment.setDeal_id(rs.getLong("payment.deal_id"));
        payment.setStatus(rs.getString("payment.status"));
        payment.setCreated(rs.getDate("payment.created"));
        payment.setModified(rs.getDate("payment.modified"));
        payment.setDescription(rs.getString("payment.description"));
        payment.setExpires(rs.getDate("payment.expires"));
        payment.setCurrency_id(rs.getLong("payment.currency_id"));
        payment.setCurrency_code(rs.getString("payment.currency_code"));
        payment.setPayment_type(rs.getString("payment.payment_type"));
        payment.setStock_id(rs.getLong("payment.stock_id"));
        payment.setHash(rs.getString("payment.hash"));
        payment.setAmount(rs.getLong("payment.amount"));
        payment.setCredits(rs.getLong("payment.credits"));
        payment.setFinal_response(rs.getString("payment.final_response"));
        payment.setLast_status(rs.getString("payment.last_status"));
        payment.setEnded(rs.getLong("payment.ended"));
        payment.setServer(rs.getString("payment.server"));
        payment.setSource(rs.getString("payment.source"));
        payment.setAtrk(rs.getString("payment.atrk"));
        payment.setTbkinfo_imported(rs.getBoolean("payment.tbkinfo_imported"));
        payment.setLanpass_id(rs.getString("payment.lanpass_id"));
        payment.setIp_address(rs.getString("payment.ip_address"));

        user.setCdUserId(rs.getLong("userpivot.cd_user_id"));
        user.setNCompanyId(rs.getLong("userpivot.n_company_id"));
        
        dealPivot.setCd_id(rs.getLong("citydealpivot.cd_id"));

        deal.setId(rs.getLong("deal.id"));
        deal.setSalesforce_id(rs.getString("deal.salesforce_id"));
        deal.setShort_title(rs.getString("deal.short_title"));
        deal.setCoupon_title(rs.getString("deal.coupon_title"));
        deal.setPicture(rs.getString("deal.picture"));
        deal.setTipping_point(rs.getLong("deal.tipping_point"));
        deal.setCountry_id(rs.getLong("deal.country_id"));
        deal.setCompany_id(rs.getLong("deal.company_id"));
        deal.setCity_id(rs.getLong("deal.city_id"));
        deal.setCategory_id(rs.getLong("deal.category_id"));
        deal.setDate(rs.getDate("deal.date"));
        deal.setCommission_tax(rs.getDouble("deal.commission_tax"));
        deal.setDue_date(rs.getDate("deal.due_date"));
        deal.setExpiration_date(rs.getDate("deal.expiration_date"));
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
        deal.setType(rs.getString("deal.type"));
        deal.setType2(rs.getString("deal.type2"));
        deal.setShipping_courier(rs.getLong("deal.shipping_courier"));
        deal.setFinal_price(rs.getDouble("deal.final_price"));
        deal.setAdditional_info(rs.getBoolean("deal.additional_info"));
        deal.setNl_title(rs.getString("deal.nl_title"));
        //TODO: replace it with constructor or builder pattern.
        //quick dirty solution:
        //Deals could be null (corrupted data?)
        if (deal.getId()==0) {
                deal.setStatus("");
        }


        dealextradata.setId(rs.getLong("dealextradata.id"));
        dealextradata.setInit_coupon_date(rs.getDate("dealextradata.init_coupon_date"));
        dealextradata.setGender_code(rs.getLong("dealextradata.gender_code"));
        dealextradata.setTemplate_deal_id(rs.getLong("dealextradata.template_deal_id"));
        dealextradata.setSharing_stock(rs.getBoolean("dealextradata.sharing_stock"));
        dealextradata.setDealbank_status(rs.getString("dealextradata.dealbank_status"));
        dealextradata.setBusiness_unit(rs.getString("dealextradata.business_unit"));
        dealextradata.setCoupon_duration(rs.getLong("dealextradata.coupon_duration"));

        paymentincentive.setId(rs.getLong("paymentincentive.id"));
        paymentincentive.setPayment_id(rs.getLong("paymentincentive.payment_id"));
        paymentincentive.setCoupon_id(rs.getLong("paymentincentive.coupon_id"));
        paymentincentive.setAmount(rs.getLong("paymentincentive.amount"));
        paymentincentive.setIncentive_id(rs.getLong("paymentincentive.incentive_id"));

        trackingpayments.setId(rs.getLong("trackingpayments.id"));
        trackingpayments.setVersion(rs.getString("trackingpayments.version"));
        trackingpayments.setPayment_id(rs.getLong("trackingpayments.payment_id"));
        trackingpayments.setPayment_method(rs.getString("trackingpayments.payment_method"));
        trackingpayments.setPlatform(rs.getString("trackingpayments.platform"));
        trackingpayments.setApplication(rs.getString("trackingpayments.application"));
        trackingpayments.setUser_agent(rs.getString("trackingpayments.user_agent"));
        trackingpayments.setCookie_b(rs.getString("trackingpayments.cookie_b"));
        trackingpayments.setDate(rs.getDate("trackingpayments.date"));

        //TODO: replace it with constructor or builder pattern.
        //quick dirty solution:
        //TrackingPayments is a new table (from 2015), there are non-existing trackingpayments:
        if (trackingpayments.getId()==0) {
            //trackingpayments.setVersion("");
            //trackingpayments.setPayment_id(0);
            //trackingpayments.setPayment_method("");
            //trackingpayments.setPlatform("");
            trackingpayments.setApplication("");
            trackingpayments.setUser_agent("");
            //trackingpayments.setCookie_b("");
            trackingpayments.setDate(new Date());
        }

        coupon.setId(rs.getLong("coupon.id"));
        coupon.setCode(rs.getString("coupon.code"));
        coupon.setDeal_id(rs.getLong("coupon.deal_id"));
        coupon.setPayment_id(rs.getLong("coupon.payment_id"));
        coupon.setUser_id(rs.getLong("coupon.user_id"));
        coupon.setValidation_code(rs.getString("coupon.validation_code"));
        coupon.setCreated(rs.getDate("coupon.created"));
        coupon.setStatus(rs.getString("coupon.status"));
        coupon.setStatus2(rs.getString("coupon.status2"));
        coupon.setCheck_name(rs.getString("coupon.check_name"));
        coupon.setCheck_email(rs.getString("coupon.check_email"));
        coupon.setCheck_rut(rs.getString("coupon.check_rut"));
        coupon.setCheck_text(rs.getString("coupon.check_text"));
        coupon.setCheck_date(rs.getDate("coupon.check_date"));
        coupon.setGift_message(rs.getString("coupon.gift_message"));
        coupon.setGift_from(rs.getString("coupon.gift_from"));
        coupon.setGift_to(rs.getString("coupon.gift_to"));
        coupon.setGift_email(rs.getString("coupon.gift_email"));
        coupon.setSent_ok(rs.getBoolean("coupon.sent_ok"));
        coupon.setRefund_date(rs.getDate("coupon.refund_date"));

        //coupon-less :S
        if (coupon.getId()==0) {
            coupon.setStatus("");
        }

        couponInvalidationReason.setGlobal_code(rs.getString("couponinvalidationreason.global_code"));

        order.setCountry(CountryEnum.getCountryEnumById(rs.getInt("country.id")));
        order.setDeal(deal);
        order.setDealExtraData(dealextradata);
        order.setPayment(payment);
        order.setCitydealPivot(dealPivot);
        order.setUser(user);
        order.setPaymentIncentive(paymentincentive);
        order.setTrackingPayment(trackingpayments);
        order.setCoupon(coupon);
        order.setCouponInvalidationReason(couponInvalidationReason);

        return order;
    }

}

