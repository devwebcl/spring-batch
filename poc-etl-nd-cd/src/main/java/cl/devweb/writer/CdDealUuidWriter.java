package cl.devweb.writer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.batch.item.ItemWriter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import com.fasterxml.uuid.Generators;

import cl.devweb.cache.CacheBean;
import cl.devweb.model.base.CityDealsBaseDTO;
import cl.devweb.util.MigrationConstants;


public class CdDealUuidWriter implements ItemWriter<CityDealsBaseDTO> {

	private Logger logger = Logger.getLogger(CdDealUuidWriter.class);

    private JdbcTemplate jdbcTemplate;
    private CacheBean cacheBean;

    @Override
    public void write(List<? extends CityDealsBaseDTO> items) throws Exception {

    	for (CityDealsBaseDTO item : items) {

	    	logger.debug("custom writer CdDealUuidWriter...");

			/*
			CREATE TABLE cd_deal_uuid (
				    cd_id integer NOT NULL,
				    cd_salesforce_id text,
				    cd_deal_uuid uuid NOT NULL
				);
			*/

	    	final String id = "cd_id"; // cache's name (+PK)

	        SimpleJdbcInsert dealMerchantInsert = new SimpleJdbcInsert(jdbcTemplate)
	                .withSchemaName(MigrationConstants.STD_DATA_SCHEMA)
	                .withTableName(MigrationConstants.CD_DEAL_UUID)
	                .usingGeneratedKeyColumns(id);

	        Map<String, Object> insertParameters = new HashMap<>(4); // ( N / 0.75 ) + 1

	        // insertParameters.put("cd_id", 1);  // this will be created by DB

			// `salesforce_id` varchar(20) DEFAULT NULL,      -- contrato
			// `so_salesforce_id` varchar(20) DEFAULT NULL,   -- planning record (deal mismo)
	        //TODO: TBC:
	        insertParameters.put("cd_salesforce_id", item.getCitydeals().getCd_salesforce_id() );
	        // faster UUID generator:
	        insertParameters.put("cd_deal_uuid", Generators.randomBasedGenerator().generate() );

	        Number r_key = dealMerchantInsert.executeAndReturnKey(insertParameters);
	        cacheBean.getCustomCache().put(id+"_uuid", r_key);

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

