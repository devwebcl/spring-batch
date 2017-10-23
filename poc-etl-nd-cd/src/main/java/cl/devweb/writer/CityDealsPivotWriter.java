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


public class CityDealsPivotWriter implements ItemWriter<CityDealsBaseDTO> {

	private Logger logger = Logger.getLogger(CityDealsWriter.class);

    private JdbcTemplate jdbcTemplate;
    private CacheBean cacheBean;

    @Override
    public void write(List<? extends CityDealsBaseDTO> items) throws Exception {

        for (CityDealsBaseDTO item : items) {

        	logger.debug("custom writer CityDealsPivotWriter...");

            SimpleJdbcInsert cityDealsPivotInsert = new SimpleJdbcInsert(jdbcTemplate)
                    .withTableName(MigrationConstants.CITY_DEALS_PIVOT);

            Map<String, Object> insertParameters = new HashMap<>(8);

            insertParameters.put("nd_deals_id", item.getCitydealspivot().getNd_deals_id());
            insertParameters.put("cd_id", cacheBean.getCustomCache().get("cd_id"));  // from CityDealsWriter
            insertParameters.put("cd_mulligan_enabled", item.getCitydealspivot().isCd_mulligan_enabled());
            insertParameters.put("cd_mulligan_parent", item.getCitydealspivot().getCd_mulligan_parent());
            insertParameters.put("cd_appdomain_id", item.getCitydealspivot().getCd_appdomain_id());

            cityDealsPivotInsert.execute(insertParameters);

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
