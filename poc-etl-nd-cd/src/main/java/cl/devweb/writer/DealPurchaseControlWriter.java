package cl.devweb.writer;

import java.util.Date;
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


public class DealPurchaseControlWriter implements ItemWriter<CityDealsBaseDTO> {

	private Logger logger = Logger.getLogger(DealPurchaseControlWriter.class);

    private JdbcTemplate jdbcTemplate;
    private CacheBean cacheBean;

    @Override
    public void write(List<? extends CityDealsBaseDTO> items) throws Exception {

    	for (CityDealsBaseDTO item : items) {

	    	logger.debug("custom writer DealPurchaseControlWriter...");

			/*
			CREATE TABLE deal_purchase_control (
			    dpc_id integer NOT NULL,
			    dpc_created timestamp without time zone DEFAULT now() NOT NULL,
			    dpc_last_modified timestamp without time zone DEFAULT now() NOT NULL,
			    dpc_dtpc_id integer NOT NULL,   dtpc_id integer,     -- deal_template_purchase_control
			    dpc_participant_maximum integer,
			    dpc_buy_limit_per_user integer,
			    dpc_participant_current integer,
			    dpc_app_id smallint,
			    dpc_voucher_codes_per_unit smallint
			);
		 */

	    	// deal_limit_group

	    	final String id = "dpc_id"; // cache's name (+PK)

	        SimpleJdbcInsert dealPurchaseControlInsert = new SimpleJdbcInsert(jdbcTemplate)
	                .withSchemaName(MigrationConstants.STD_DATA_SCHEMA)
	                .withTableName(MigrationConstants.DEAL_PURCHASE_CONTROL)
	                .usingGeneratedKeyColumns(id);

	        Map<String, Object> insertParameters = new HashMap<>(12); // ( N / 0.75 ) + 1

	        // insertParameters.put("dpc_id", 1);  // this will be created by DB
	        //TODO: TBC:
	        insertParameters.put("dpc_created", item.getCitydeals().getCd_created());
	        insertParameters.put("dpc_last_modified", item.getCitydeals().getCd_last_modified());
	        insertParameters.put("dpc_dtpc_id", cacheBean.getCustomCache().get("dtpc_id"));           // from DealTemplatePurchaseControlWriter
	        insertParameters.put("dpc_participant_maximum", item.getCitydeals().getCd_participant_maximum());
	        insertParameters.put("dpc_buy_limit_per_user", item.getCitydeals().getCd_buy_limit_per_user());
	        insertParameters.put("dpc_participant_current", item.getCitydeals().getCd_participant_current());
	        insertParameters.put("dpc_app_id", item.getCitydeals().getCd_appdomain_id());
	        insertParameters.put("dpc_voucher_codes_per_unit", 1);


	        Number r_key = dealPurchaseControlInsert.executeAndReturnKey(insertParameters);
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

