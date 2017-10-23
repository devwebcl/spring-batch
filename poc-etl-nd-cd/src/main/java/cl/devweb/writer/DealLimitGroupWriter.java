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


public class DealLimitGroupWriter implements ItemWriter<CityDealsBaseDTO> {

	private Logger logger = Logger.getLogger(DealLimitGroupWriter.class);

    private JdbcTemplate jdbcTemplate;
    private CacheBean cacheBean;

    @Override
    public void write(List<? extends CityDealsBaseDTO> items) throws Exception {

    	for (CityDealsBaseDTO item : items) {

	    	logger.debug("custom writer DealLimitGroupWriter...");

			/*
			CREATE TABLE deal_limit_group (
			    dlg_id integer NOT NULL,
			    dlg_limit_for_user integer DEFAULT 0 NOT NULL,
			    dlg_active boolean DEFAULT false NOT NULL,
			    dlg_created timestamp with time zone,
			    dlg_last_modified timestamp with time zone
			);
	 		*/

	    	// deal_limit_group

	    	final String id = "dlg_id"; // cache's name (+PK)

	        SimpleJdbcInsert dealLimitGroupInsert = new SimpleJdbcInsert(jdbcTemplate)
	                .withSchemaName(MigrationConstants.STD_DATA_SCHEMA)
	                .withTableName(MigrationConstants.DEAL_LIMIT_GROUP)
	                .usingGeneratedKeyColumns(id);

	        Map<String, Object> insertParameters = new HashMap<>(7); // ( N / 0.75 ) + 1

	        // insertParameters.put("dlg_id", 1);  // this will be created by DB
	        //TODO: TBC:
	        insertParameters.put("dlg_limit_for_user", 1);
	        insertParameters.put("dlg_active", true);
	        insertParameters.put("dlg_created", new Date());
	        insertParameters.put("dlg_last_modified", new Date());

	        Number r_key = dealLimitGroupInsert.executeAndReturnKey(insertParameters);
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

