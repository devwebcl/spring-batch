package cl.devweb.writer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.batch.item.ItemWriter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import cl.devweb.cache.CacheBean;
import cl.devweb.model.citydeal.MerchantCD;
import cl.devweb.util.MigrationConstants;

public class MerchantsPivotWriter implements ItemWriter<MerchantCD> {
    
    private JdbcTemplate jdbcTemplate;
    private CacheBean cacheBean;

    @Override
    public void write(List<? extends MerchantCD> list) throws Exception {
        for (MerchantCD merchant : list) {
            SimpleJdbcInsert merchantsPivotInsert = new SimpleJdbcInsert(jdbcTemplate)
                    .withTableName(MigrationConstants.MERCHANTS_PIVOT_TABLE_NAME);
            
            Map<String, Object> insertParameters = new HashMap<>(5);
            
            insertParameters.put("n_company_id", merchant.getN_company_id());
            insertParameters.put("n_company_name", merchant.getDm().getDm_merchant_company_name());
            insertParameters.put("cd_dm_merchant_id", cacheBean.getCustomCache().get("dm_id"));

            merchantsPivotInsert.execute(insertParameters);
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
