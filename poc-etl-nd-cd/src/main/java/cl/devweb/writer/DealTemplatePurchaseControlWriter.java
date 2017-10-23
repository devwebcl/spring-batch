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


public class DealTemplatePurchaseControlWriter implements ItemWriter<CityDealsBaseDTO> {

	private Logger logger = Logger.getLogger(DealTemplatePurchaseControlWriter.class);

    private JdbcTemplate jdbcTemplate;
    private CacheBean cacheBean;

    @Override
    public void write(List<? extends CityDealsBaseDTO> items) throws Exception {

    	for (CityDealsBaseDTO item : items) {

	    	logger.debug("custom writer DealTemplatePurchaseControlWriter...");

			/*
			CREATE TABLE std_data.deal_template_purchase_control
			(
			  dtpc_id integer NOT NULL DEFAULT nextval('std_data.deal_template_purchase_control_dtpc_id_seq1'::regclass),
			  dtpc_created timestamp with time zone NOT NULL DEFAULT now(),
			  dtpc_last_modified timestamp with time zone NOT NULL DEFAULT now(),
			  dtpc_participant_maximum integer,
			  dtpc_buy_limit_per_user integer,
			  dtpc_app_id smallint,
			  dtpc_voucher_codes_per_unit smallint,
			  CONSTRAINT deal_template_purchase_control_pkey PRIMARY KEY (dtpc_id)
			)
		 */

	    	// deal_limit_group

	    	final String id = "dtpc_id"; // cache's name (+PK)

	        SimpleJdbcInsert dealTemplatePurchaseControlInsert = new SimpleJdbcInsert(jdbcTemplate)
	                .withSchemaName(MigrationConstants.STD_DATA_SCHEMA)
	                .withTableName(MigrationConstants.DEAL_TEMPLATE_PURCHASE_CONTROL)
	                .usingGeneratedKeyColumns(id);

	        Map<String, Object> insertParameters = new HashMap<>(7); // ( N / 0.75 ) + 1

	        // insertParameters.put("dtpc_id", 1);  // this will be created by DB
	        //TODO: TBC:
	      //getDeal() has some null's
	        insertParameters.put("dtpc_created", item.getCitydeals().getCd_created()); //  item.getDealextradata().getCreated()
	        insertParameters.put("dtpc_last_modified", item.getCitydeals().getCd_last_modified());
	        insertParameters.put("dtpc_participant_maximum", item.getCitydeals().getCd_participant_maximum());
	        insertParameters.put("dtpc_buy_limit_per_user", item.getCitydeals().getCd_buy_limit_per_user());
	        insertParameters.put("dtpc_app_id", item.getCitydeals().getCd_appdomain_id());
	        insertParameters.put("dtpc_voucher_codes_per_unit", 1);


	        Number r_key = dealTemplatePurchaseControlInsert.executeAndReturnKey(insertParameters);
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

