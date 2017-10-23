package cl.devweb.writer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.batch.item.ItemWriter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import cl.devweb.cache.CacheBean;
import cl.devweb.model.base.CityDealsBaseDTO;
import cl.devweb.util.MigrationConstants;


public class CityDealsWriter implements ItemWriter<CityDealsBaseDTO> {

	private Logger logger = Logger.getLogger(CityDealsWriter.class);

    private JdbcTemplate jdbcTemplate;
    private CacheBean cacheBean;

    @Override
    public void write(List<? extends CityDealsBaseDTO> items) throws Exception {

    	for (CityDealsBaseDTO item : items) {

	    	logger.debug("custom writer CityDealsWriter...");

			/*
				CREATE TABLE city_deals (
				    cd_id integer NOT NULL,
				    cd_ptc_city_id integer NOT NULL,
				    cd_meta_title text,
				    cd_meta_description text,
				    cd_meta_keywords text,
				    cd_title text,
				    cd_short_description text,
				    cd_short_highlights text,
				    cd_long_description text,
				    ...
				    ...
			*/

	    	final String id = "cd_id"; // cache's name (+PK)

	        SimpleJdbcInsert cityDealsInsert = new SimpleJdbcInsert(jdbcTemplate)
	                .withSchemaName(MigrationConstants.STD_DATA_SCHEMA)
	                .withTableName(MigrationConstants.CITY_DEALS)
	                .usingGeneratedKeyColumns(id);


	        Map<String, Object> insertParameters = new HashMap<>(81); // ( N / 0.75 ) + 1

			//insertParameters.put("cd_id", item.getCitydeals().getCd_id());  // this will be created by DB
			insertParameters.put("cd_ptc_city_id", item.getCitydeals().getCd_ptc_city_id());
			insertParameters.put("cd_meta_title", item.getCitydeals().getCd_meta_title());
			insertParameters.put("cd_meta_description", item.getCitydeals().getCd_meta_description());
			insertParameters.put("cd_meta_keywords", item.getCitydeals().getCd_meta_keywords());
			insertParameters.put("cd_title", item.getCitydeals().getCd_title());
			insertParameters.put("cd_short_description", item.getCitydeals().getCd_short_description());
			insertParameters.put("cd_short_highlights", item.getCitydeals().getCd_short_highlights());
			insertParameters.put("cd_long_description", item.getCitydeals().getCd_long_description());
			insertParameters.put("cd_image_big", item.getCitydeals().getCd_image_big());
			insertParameters.put("cd_image_small", item.getCitydeals().getCd_image_small());
			insertParameters.put("cd_merchant_id", item.getCitydeals().getCd_merchant_id());
			insertParameters.put("cd_original_price_gross", item.getCitydeals().getCd_original_price_gross());
			insertParameters.put("cd_special_price_gross", item.getCitydeals().getCd_special_price_gross());
			insertParameters.put("cd_special_price_tax", item.getCitydeals().getCd_special_price_tax());
			insertParameters.put("cd_participant_minimum", item.getCitydeals().getCd_participant_minimum());
			insertParameters.put("cd_participant_maximum", item.getCitydeals().getCd_participant_maximum());
			insertParameters.put("cd_deal_start_time", item.getCitydeals().getCd_deal_start_time());
			insertParameters.put("cd_deal_end_time", item.getCitydeals().getCd_deal_end_time());
			insertParameters.put("cd_deal_status", item.getCitydeals().getCd_deal_status());
			insertParameters.put("cd_newsletter_subject", item.getCitydeals().getCd_newsletter_subject());
			insertParameters.put("cd_newsletter_textblock", item.getCitydeals().getCd_newsletter_textblock());
			insertParameters.put("cd_participant_current", item.getCitydeals().getCd_participant_current());
			insertParameters.put("cd_image_newsletter", item.getCitydeals().getCd_image_newsletter());
			insertParameters.put("cd_title_for_url_permalink", item.getCitydeals().getCd_title_for_url_permalink());
			insertParameters.put("cd_deal_email_type", item.getCitydeals().getCd_deal_email_type());
			insertParameters.put("cd_coupon_valid_from", item.getCitydeals().getCd_coupon_valid_from());
			insertParameters.put("cd_coupon_valid_until", item.getCitydeals().getCd_coupon_valid_until());

			//insertParameters.put("cd_dlg_id", item.getCitydeals().getCd_dlg_id());  // from DealLimitGroupWriter
			insertParameters.put("cd_dlg_id", cacheBean.getCustomCache().get("dlg_id"));

			insertParameters.put("cd_last_modified", item.getCitydeals().getCd_last_modified());
			insertParameters.put("cd_scheduled_for_newsletter", item.getCitydeals().isCd_scheduled_for_newsletter());
			insertParameters.put("cd_customer_index_max", item.getCitydeals().getCd_customer_index_max());
			insertParameters.put("cd_deal_type_id", item.getCitydeals().getCd_deal_type_id());

			//insertParameters.put("cd_salesforce_id", item.getCitydeals().getCd_salesforce_id()); // from CdDealUuidWriter
			insertParameters.put("cd_salesforce_id", cacheBean.getCustomCache().get("cd_id_uuid"));

			insertParameters.put("cd_deal_title_coupon", item.getCitydeals().getCd_deal_title_coupon());
			insertParameters.put("cd_coupon_how_it_works", item.getCitydeals().getCd_coupon_how_it_works());
			insertParameters.put("cd_appdomain_id", item.getCitydeals().getCd_appdomain_id());
			insertParameters.put("cd_sidedeal_image", item.getCitydeals().getCd_sidedeal_image());
			insertParameters.put("cd_deal_priority", item.getCitydeals().getCd_deal_priority());
			insertParameters.put("cd_newsletter_title", item.getCitydeals().getCd_newsletter_title());
			insertParameters.put("cd_newsletter_side_deal_title", item.getCitydeals().getCd_newsletter_side_deal_title());
			insertParameters.put("cd_multideal_type", item.getCitydeals().getCd_multideal_type());
			insertParameters.put("cd_multideal_parent", item.getCitydeals().getCd_multideal_parent());
			insertParameters.put("cd_voucher_send_by_sms", item.getCitydeals().isCd_voucher_send_by_sms());
			insertParameters.put("cd_voucher_delivery_event", item.getCitydeals().getCd_voucher_delivery_event());
			insertParameters.put("cd_sms_prefix", item.getCitydeals().getCd_sms_prefix());
			insertParameters.put("cd_mobile_description", item.getCitydeals().getCd_mobile_description());
			insertParameters.put("cd_mvc_pool_id", item.getCitydeals().getCd_mvc_pool_id());
			insertParameters.put("cd_mulligan_enabled", item.getCitydeals().isCd_mulligan_enabled());
			insertParameters.put("cd_mulligan_parent", item.getCitydeals().getCd_mulligan_parent());
			insertParameters.put("cd_canonical_tag", item.getCitydeals().getCd_canonical_tag());
			insertParameters.put("cd_salesforce_scheduling_detail_id", item.getCitydeals().getCd_salesforce_scheduling_detail_id());

			//insertParameters.put("cd_dpc_id", item.getCitydeals().getCd_dpc_id());
			insertParameters.put("cd_dpc_id", cacheBean.getCustomCache().get("dpc_id")); // from DealPurchaseControlWriter

			insertParameters.put("cd_buy_limit_per_user", item.getCitydeals().getCd_buy_limit_per_user());
			insertParameters.put("cd_salesforce_feature_id", item.getCitydeals().getCd_salesforce_feature_id());
			insertParameters.put("cd_created", item.getCitydeals().getCd_created());
			insertParameters.put("cd_blacklisted", item.getCitydeals().isCd_blacklisted());
			insertParameters.put("cd_drdrt_id", item.getCitydeals().getCd_drdrt_id());
			insertParameters.put("cd_redirect_url", item.getCitydeals().getCd_redirect_url());
			insertParameters.put("cd_expiration_period", item.getCitydeals().getCd_expiration_period());


	        Number r_key = cityDealsInsert.executeAndReturnKey(insertParameters);
	        cacheBean.getCustomCache().put(id, r_key);

    	}

    }

    public void setCacheBean(CacheBean cacheBean) {
        this.cacheBean = cacheBean;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

}

