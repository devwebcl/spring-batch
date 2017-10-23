package cl.devweb.processor.order;

import com.fasterxml.uuid.Generators;

import cl.devweb.classifier.OrderClassifierEnum;
import cl.devweb.model.citydeal.Application;
import cl.devweb.model.citydeal.BillingAttribute;
import cl.devweb.model.citydeal.BillingAttributeAttr;
import cl.devweb.model.citydeal.BillingIncentive;
import cl.devweb.model.citydeal.BillingNotificationStatus;
import cl.devweb.model.citydeal.BillingTransactionState;
import cl.devweb.model.citydeal.JoinedDealStatus;
import cl.devweb.model.citydeal.OrderCD;
import cl.devweb.model.citydeal.PaymentProvider;
import cl.devweb.model.citydeal.RefundReason;
import cl.devweb.model.citydeal.RefundReasonId;
import cl.devweb.model.citydeal.UjdUsageState;
import cl.devweb.model.citydeal.UsersBillingHistory;
import cl.devweb.model.citydeal.UsersJoinedDeals;
import cl.devweb.model.devwebish.OrderND;
import cl.devweb.processor.CustomMapper;

import java.util.Date;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

public class SimpleOrderMapper implements CustomMapper {

    private static final Logger logger = Logger.getLogger(SimpleOrderMapper.class);

    @Override
    public Object map(Object item) throws Exception {

        //here we do the real TRANSFORMATION (into target):
        Object orderCD = null;

        //checking:
        if (item instanceof OrderND) {
            orderCD = doMapping((OrderND) item);
        } else {
            throw new Exception("An invalid item was received: " + item);
        }

        return orderCD;
    }

    //save last payment_id to check 1:n relationship
    private long last_payment_id = 0;
    private String value = "";

    //Real mapping:
    public OrderCD doMapping(OrderND item) {

        OrderCD ocd = new OrderCD();

        //we check last_payment_id one, if it s the same then we don't insert it again :)
        if (last_payment_id != item.getPayment().getId()) {
            if (item.getTrackingPayment() != null) {
                if (item.getPaymentIncentive() != null) {
                    if (item.getCouponInvalidationReason() != null && item.getCoupon().getStatus().equals("REFUNDED")) {
                        ocd.setOperation(OrderClassifierEnum.INSERT_UBH_UJD_BA_BI_RR.name());
                    } else {
                        ocd.setOperation(OrderClassifierEnum.INSERT_UBH_UJD_BA_BI.name());
                    }
                } else {
                    if (item.getCouponInvalidationReason() != null && item.getCoupon().getStatus().equals("REFUNDED")) {
                        ocd.setOperation(OrderClassifierEnum.INSERT_UBH_UJD_BA_RR.name());
                    } else {
                        ocd.setOperation(OrderClassifierEnum.INSERT_UBH_UJD_BA.name());
                    }
                }
            } else {
                if (item.getPaymentIncentive() != null) {
                    if (item.getCouponInvalidationReason() != null && item.getCoupon().getStatus().equals("REFUNDED")) {
                        ocd.setOperation(OrderClassifierEnum.INSERT_UBH_UJD_BI_RR.name());
                    } else {
                        ocd.setOperation(OrderClassifierEnum.INSERT_UBH_UJD_BI.name());
                    }
                } else {
                    if (item.getCouponInvalidationReason() != null && item.getCoupon().getStatus().equals("REFUNDED")) {
                        ocd.setOperation(OrderClassifierEnum.INSERT_UBH_UJD_RR.name());
                    } else {
                        ocd.setOperation(OrderClassifierEnum.INSERT_UBH_UJD.name());
                    }
                }
            }
        } else {
            if (item.getTrackingPayment() != null) {
                if (item.getPaymentIncentive() != null) {
                    if (item.getCouponInvalidationReason() != null && item.getCoupon().getStatus().equals("REFUNDED")) {
                        ocd.setOperation(OrderClassifierEnum.INSERT_UJD_BA_BI_RR.name());
                    } else {
                        ocd.setOperation(OrderClassifierEnum.INSERT_UJD_BA_BI.name());
                    }
                } else {
                    if (item.getCouponInvalidationReason() != null && item.getCoupon().getStatus().equals("REFUNDED")) {
                        ocd.setOperation(OrderClassifierEnum.INSERT_UJD_BA_RR.name());
                    } else {
                        ocd.setOperation(OrderClassifierEnum.INSERT_UJD_BA.name());
                    }
                }
            } else {
                if (item.getPaymentIncentive() != null && item.getCoupon().getStatus().equals("REFUNDED")) {
                    if (item.getCouponInvalidationReason() != null) {
                        ocd.setOperation(OrderClassifierEnum.INSERT_UJD_BI_RR.name());
                    } else {
                        ocd.setOperation(OrderClassifierEnum.INSERT_UJD_BI.name());
                    }
                } else {
                    if (item.getCouponInvalidationReason() != null && item.getCoupon().getStatus().equals("REFUNDED")) {
                        ocd.setOperation(OrderClassifierEnum.INSERT_UJD_RR.name());
                    } else {
                        ocd.setOperation(OrderClassifierEnum.INSERT_UJD.name());
                    }
                }
            }
        }

        last_payment_id = item.getPayment().getId();

        //UsersBillingHistory
        UsersBillingHistory ubh = new UsersBillingHistory();

        //ubh.setUbh_id(); // auto-generated from nextval
        ubh.setUbh_created(item.getPayment().getCreated());
        ubh.setUbh_user_id(item.getUser().getCdUserId());
        ubh.setUbh_uuid(Generators.randomBasedGenerator().generate());
        /* TODO:
         * clandescuento.payments_service_providers
         * does not meet values for
         * std_data.payment_provider
         *
         * we must add devwebish values to CD for payments_providers
         * for now using dummy values in enum
         */
        ubh.setUbh_payment_provider_id(PaymentProvider.getDummyPaymentProviderFromCountryId(item.getDeal().getCountry_id()).getPaymentProviderId());

        //TODO: Mapping Payment status: TBC.
        int code = 0;
        switch (item.getPayment().getStatus()) {
            case "FAILED":
                code = BillingTransactionState.CAPTURE_FAILED.getValue();
                break;
            case "FUNDS_CAPTURED":
                code = BillingTransactionState.CAPTURE_SENT.getValue();
                break;
            case "PENDING":
                code = BillingTransactionState.INITIATED.getValue();
                break;
            case "REJECTED":
                code = BillingTransactionState.REFUSED.getValue();
                break;
            case "SENT":
                code = BillingTransactionState.CAPTURE_SENT.getValue();
                break;
            default:
                code = BillingTransactionState.CANCELLED.getValue();
                break;
        }
        ubh.setUbh_transaction_state_id(code);

        //TODO: TBC !
        //price_amount_gross	priceAmountMinorUnits.
        //the complete amount the user pays (dealPrice * dealQuantity + shippingPrice) not reduced by Incentives or rewards
        //FA: As I can see in the migration to devwebish, payments.amount = ubh.ubh_price_amount_gross - (ubh.ubh_used_reward_units / 100)
        ubh.setUbh_price_amount_gross(item.getPayment().getAmount() + item.getPayment().getCredits());

        //tax_amount	taxAmountMinorUnits:	currently **broken**, its calculated dealTax * dealQuantity, shippingCosts are currently not added
        //Deal.applicable_tax, Deal.commission_tax = 0.19
        //FA: Shouldn't this be a fixed integer by country?
        ubh.setUbh_tax_amount(item.getDeal().getCommission_tax()); //TODO: only in Production,

        //TODO: from std_data.city_deals
        //std_data.city_deals cd ON cd_id = ubh_citydeal_id
        //Deals... we need to migrate first Deals (based in our DUO).
        ubh.setUbh_citydeal_id(item.getCitydealPivot().getCd_id());

        //basket_items	basketItems	quantity of deals to buy
        //devwebish does not have basket :S
        ubh.setUbh_basket_items(1);

        //paymentprovider_reference	pspReference	the unique id given by the psp for this billing
        //TODO: TBC
        //payments_tbkinfo ?
        //FA: looks like this field wasn't migrated from CityDeal
        ubh.setUbh_paymentprovider_reference(item.getPayment().getFinal_response());

        ubh.setUbh_last_modfied(item.getPayment().getModified());

        //chargeback_reason	info	any information submitted by the PSP is recorded here
        //TODO: TBC.  payments_tbkinfo ? any other PSP ?
        //ubh.setUbh_chargeback_reason(item.getPayment().getDescription());
        //FA: looks like this field wasn't migrated from CityDeal
        ubh.setUbh_chargeback_reason(StringUtils.EMPTY);

        //used_reward_units	rewardUnitsUsed. The amount of used rewards in minor units default 0
        //FA: payments.credits = ubh.ubh_used_reward_units / 100
        ubh.setUbh_used_reward_units(Double.doubleToLongBits(item.getPayment().getCredits() * 100));

        //modification_reason .Additional information regarding data changes made by the database team is recorded here
        //ND: N/A
        //FA: looks like this field wasn't migrated from CityDeal
        ubh.setUbh_modification_reason("");

        //TODO: ver detalle de direcciones entre ND y CD. (poblar tabla antes?)
        //ocd_id	orderContactDetailId	the id of the matching orderContactDetail
        //(the frozen UserAddress when the user bought a deliveryAddress enabled deal)
        //clandescuento.user_addresses, coupon.shipping_address ?
        //FA: looks like this field wasn't migrated from CityDeal
        ubh.setUbh_ocd_id(1L);

        //notification_status	billingNotificationStateId
        //additional state declaring if the voucher was already sent to the customer or not
        //TODO: Mapping coupon status: TBC.
        //FA: CAREFUL! FUNDS_CAPTURED != INITIATED...look at coupons.status
        code = 0;
        switch (item.getCoupon().getStatus()) {
            case "ERROR":
            case "EXPIRED":
            case "FAILED":
            case "FRAUD":
            case "HIDDEN":
            case "HOLD":
            case "INVALID":
            case "REJECTED":
                code = BillingNotificationStatus.SENT_PAYMENT_FAILED.getValue();
                break;
            case "SENT":
            case "USED":
            case "VALID":
                code = BillingNotificationStatus.SENT_VOUCHER.getValue();
                break;
            case "NEW":
            case "PENDING":
            case "REFUNDED":
            default:
                code = BillingNotificationStatus.INITIATED.getValue();
                break;
        }
        ubh.setUbh_notification_status(code);

        // the no of installments to pay in selected by the user, default 1
        //ND: N/A
        ubh.setUbh_installment_no(1);

        // the amount of added interest by us when the user selected to pay in installments
        //ND: N/A
        ubh.setUbh_interest_amount(0);




        // ---------------------------------------------
        //BillingAttribute
        BillingAttribute ba = new BillingAttribute();

        if (item.getTrackingPayment() != null) {
            //ba.setBa_id(item.getPayment().getId()); //getting from sequence
            //ba.setBa_ubh_id(ubh.getUbh_id()); // auto-generated from currval()
            ba.setBa_created(item.getTrackingPayment().getDate());
            ba.setBa_last_modified(item.getTrackingPayment().getDate());

            //guarda doble !
            //user-agent:
            ba.setBa_attribute_useragent(BillingAttributeAttr.USERAGENT.getValue());
            ba.setBa_value_useragent(item.getTrackingPayment().getUser_agent());

            //TODO: check for a better mapping
            //client-type:
            ba.setBa_attribute_clienttype(BillingAttributeAttr.CLIENTTYPE.getValue());
            switch (item.getTrackingPayment().getApplication()) {
                case "Checkout":
                    value = BillingAttributeAttr.WEB.getValue();
                    break;
                case "iPhone":
                    value = BillingAttributeAttr.IPHONE.getValue();
                    break;
                case "Android":
                    value = BillingAttributeAttr.BLACKBERRY.getValue();
                    break;
                default:
                    value = BillingAttributeAttr.UNKNOWN.getValue();
                    break;
            }
            ba.setBa_value_clienttype(value);
        }





        // ------------------------------------------------------------------
        //UsersJoinedDeals (vouchers)
        UsersJoinedDeals ujd = new UsersJoinedDeals();
        //ujd.setUjd_id(item.getDeal().getId()); // auto-generated

        //FA: get user_id from privot table
        ujd.setUjd_user_id(item.getUser().getCdUserId());
        //resolved above:
        ujd.setUjd_city_deal_id(ubh.getUbh_citydeal_id());
        ujd.setUjd_created(item.getCoupon().getCreated());
        //ujd.setUjd_billing_history_id(ujd_billing_history_id); //// auto-generated FA: join with users_billing_history?

        //Join Status: TODO: TBC !
        code = 0;
        boolean suspended = true;

        logger.debug("coupon********" + item.getCoupon().getId());
        logger.debug("paymnt********" + item.getPayment().getId());

        switch (item.getCoupon().getStatus()) {
            case "SENT":
            case "USED":
            case "VALID":
                code = JoinedDealStatus.DEAL_ACCESS_GRANTED.getValue();
                suspended = false;
                break;
            case "DELETED":
                code = JoinedDealStatus.DEAL_DELETED.getValue();
                break;
            case "NEW":
            case "NEW2":
            case "PENDING":
            case "OK":
            case "HIDDEN":
            case "HOLD":
                code = JoinedDealStatus.DEAL_ACCESS_INITATED.getValue();
                break;
            case "CANCELLED":
            case "ERROR":
            case "EXPIRED":
            case "FAILED":
            case "FRAUD":
            case "FRAUD_GC_A":
            case "INVALID":
            case "REFUNDED":
            case "REJECTED":
            case "VOID":
            default:
                code = JoinedDealStatus.DEAL_ACCESS_DENIED.getValue();
                break;
        }
        ujd.setUjd_join_status(code);

        //TODO: check against table UAT CD:
        //is it amount of payments of a basket? (TBD)
        ujd.setUjd_amount(1);

        //TODO: TBD:
        //FA: ujd_part1_provider_only is admindevweb.coupons.validation_code on devwebish
        //FA: part2_provider_customer doesn't seem to be migrated, could be coupon.validation_code
        //FA: TODO:remove substring!
        String couponCode = item.getCoupon().getCode();
        ujd.setUjd_part1_provider_only(couponCode.substring(Math.max(couponCode.length() - 10, 0)));
        ujd.setUjd_part2_provider_customer(item.getCoupon().getValidation_code());

        ujd.setUjd_last_modified(item.getCoupon().getCreated());
        ujd.setUjd_usage_date(item.getCoupon().getCheck_date());

        value = "";
        switch (item.getCoupon().getStatus()) {
            case "USED":
                value = UjdUsageState.REDEEMED.getValue();
                break;
            default:
                value = UjdUsageState.UNUSED.getValue();
                break;
        }
        ujd.setUjd_usage_state(value);

        //FA: this is according to the UAT data, this is not a date and is almost always empty
        ujd.setUjd_redeem_origin("");

        //TODO: TBC
        ujd.setUjd_suspended(suspended);

        // applications referenced from Applications table:
        ujd.setUjd_app_id(Application.de_citydeal_web_frontend.getValue());

        ujd.setUjd_valid_from(item.getDeal().getDate());
        ujd.setUjd_valid_until(item.getDeal().getDue_date());

        //TODO: ND N/A... workaround:
        ujd.setUjd_guid(Generators.randomBasedGenerator().generate());

        BillingIncentive bi = new BillingIncentive();
        if (item.getPaymentIncentive() != null) {
            //bi.setBi_id(); sequence
            bi.setBi_created(item.getPayment().getCreated());
            bi.setBi_last_modified(item.getPayment().getModified());
            //bi.setBi_ubh_id(ubh.getUbh_id()); auto-generated from currval
            bi.setBi_incentive_id(String.valueOf(item.getPaymentIncentive().getIncentive_id()));
            bi.setBi_amount((int)Math.round(item.getPaymentIncentive().getAmount()));
        }

        RefundReason rr = new RefundReason();
        if (item.getCouponInvalidationReason() != null && item.getCoupon().getStatus().equals("REFUNDED")) {
            Date refundDate = item.getCoupon().getRefund_date() != null ? item.getCoupon().getRefund_date() : item.getCoupon().getCreated();
            rr.setRre_created(refundDate);
            rr.setRre_last_modified(refundDate);
            rr.setRre_reason_id(RefundReasonId.getIdFromGlobalCode(item.getCouponInvalidationReason().getGlobal_code()));
            rr.setRre_process_violation(false);
            rr.setRre_tool_user_id(code);
            rr.setRre_violation_explanation(null);
        }


        // -------------------------------------------------------------
        //TODO: cashback ?
        //TODO: merchant_voucher_codes ?
        //TODO: order_contact_details
        //there are 3 tables related, with no much information inserted.
        //deprecated ???
        //select * from std_data.cashback
        //select * from std_data.cashback_provider
        //select * from std_data.cashback_state

        //from the devwebish side we don't have enough data to populate these tables
        //we are not migrating merchant_voucher_codes, since this won't give us any
        //added value after the migration is done

        // -------------------------------------------------------------

        //setting inner objects
        ocd.setBa(ba);
        ocd.setUbh(ubh);
        ocd.setUjd(ujd);
        ocd.setBi(bi);
        ocd.setRr(rr);

        return ocd;
    }

}
