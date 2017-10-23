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

public class DealMerchantWriter implements ItemWriter<MerchantCD> {
    
    private JdbcTemplate jdbcTemplate;
    private CacheBean cacheBean;    

    @Override
    public void write(List<? extends MerchantCD> list) throws Exception {
        
        for (MerchantCD merchant : list) {
            SimpleJdbcInsert dealMerchantInsert = new SimpleJdbcInsert(jdbcTemplate)
                    .withSchemaName(MigrationConstants.STD_DATA_SCHEMA)
                    .withTableName(MigrationConstants.DEAL_MERCHANT_TABLE_NAME)
                    .usingGeneratedKeyColumns("dm_id");
            
            Map<String, Object> insertParameters = new HashMap<>(15);
            
            insertParameters.put("dm_merchant_company_name", merchant.getDm().getDm_merchant_company_name());
            insertParameters.put("dm_merchant_homepage", merchant.getDm().getDm_merchant_homepage());
            insertParameters.put("dm_merchant_logo", merchant.getDm().getDm_merchant_logo());
            insertParameters.put("dm_merchant_opening_hours", merchant.getDm().getDm_merchant_opening_hours());
            insertParameters.put("dm_appdomain_id", merchant.getDm().getDm_appdomain_id());
            insertParameters.put("dm_guid", merchant.getDm().getDm_guid());
            insertParameters.put("dm_status", merchant.getDm().getDm_status());
            insertParameters.put("dm_mulligan_enabled", merchant.getDm().getDm_mulligan_enabled());
            insertParameters.put("dm_created", merchant.getDm().getDm_created());
            insertParameters.put("dm_last_modified", merchant.getDm().getDm_last_modified());

            Number dmId = dealMerchantInsert.executeAndReturnKey(insertParameters);
            cacheBean.getCustomCache().put("dm_id", dmId);
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