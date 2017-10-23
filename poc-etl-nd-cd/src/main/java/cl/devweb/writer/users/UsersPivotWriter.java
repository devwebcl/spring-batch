package cl.devweb.writer.users;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.batch.item.ItemWriter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import cl.devweb.cache.CacheBean;
import cl.devweb.model.decorator.UserDecorator;

public class UsersPivotWriter implements ItemWriter<UserDecorator> {

    private JdbcTemplate jdbcTemplate;
    private CacheBean cacheBean;

    @Override
    public void write(List<? extends UserDecorator> usersDecorators) throws Exception {
        SimpleJdbcInsert userInsert = new SimpleJdbcInsert(jdbcTemplate)
                .withTableName("users_pivot")
                .usingColumns(
                        "n_country_id",
                        "email",
                        "uuid",
                        "n_company_id",
                        "cd_user_id",
                        "cd_appdomain_id",
                        "city_pivot_id",
                        "is_user_created"
                )
                .usingGeneratedKeyColumns("id");

        for (UserDecorator userDecorator : usersDecorators) {

            Number userId = (Number) cacheBean.getCustomCache().get(userDecorator.getUserCD().getU_email());

            if (userId == null) {
                Map<String, Object> insertParametersForUser = new HashMap<>(11);
                insertParametersForUser.put("n_country_id", userDecorator.getUserPivot().getCityPivot().getN_country_id());
                insertParametersForUser.put("email", userDecorator.getUserCD().getU_email());
                insertParametersForUser.put("uuid", userDecorator.getUserPivot().getUuid());
                insertParametersForUser.put("n_company_id", 0);
                insertParametersForUser.put("cd_user_id", userDecorator.getUserCD().getU_id());
                insertParametersForUser.put("cd_appdomain_id", userDecorator.getUserPivot().getCityPivot().getCd_appdomain_id());
                insertParametersForUser.put("city_pivot_id", userDecorator.getUserPivot().getCityPivot().getId());
                insertParametersForUser.put("is_user_created", 0);

                userId = userInsert.executeAndReturnKey(insertParametersForUser);

                cacheBean.getCustomCache().put(userDecorator.getUserCD().getU_email(), userId);
            }

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