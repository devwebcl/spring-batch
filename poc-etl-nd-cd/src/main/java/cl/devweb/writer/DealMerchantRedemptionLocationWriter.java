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

public class DealMerchantRedemptionLocationWriter implements ItemWriter<MerchantCD> {
    
    private JdbcTemplate jdbcTemplate;
    private CacheBean cacheBean;

    @Override
    public void write(List<? extends MerchantCD> list) throws Exception {
        
        for (MerchantCD merchant : list) {
            SimpleJdbcInsert dealMerchantRedemptionLocationInsert = new SimpleJdbcInsert(jdbcTemplate)
                    .withSchemaName(MigrationConstants.STD_DATA_SCHEMA)
                    .withTableName(MigrationConstants.DEAL_MERCHANT_REDEMPTION_LOCATION_TABLE_NAME)
                    .usingGeneratedKeyColumns("dmrl_id");
            
            Map<String, Object> insertParameters = new HashMap<>(12);
                        
            insertParameters.put("dmrl_address", merchant.getDmrl().getDmrl_address());
            insertParameters.put("dmrl_latitude", merchant.getDmrl().getDmrl_latitude());
            insertParameters.put("dmrl_longitude", merchant.getDmrl().getDmrl_longitude());
            insertParameters.put("dmrl_status", merchant.getDmrl().getDmrl_status());
            insertParameters.put("dmrl_guid", merchant.getDmrl().getDmrl_guid());
            insertParameters.put("dmrl_created", merchant.getDmrl().getDmrl_created());
            insertParameters.put("dmrl_last_modified", merchant.getDmrl().getDmrl_last_modified());
            insertParameters.put("dmrl_dm_id", cacheBean.getCustomCache().get("dm_id"));

            dealMerchantRedemptionLocationInsert.execute(insertParameters);
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
