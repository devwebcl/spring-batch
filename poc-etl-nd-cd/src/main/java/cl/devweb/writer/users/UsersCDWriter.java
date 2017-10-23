package cl.devweb.writer.users;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.batch.item.ItemWriter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import cl.devweb.cache.CacheBean;
import cl.devweb.classifier.WriterRouterClassifierUser;
import cl.devweb.model.decorator.UserDecorator;
import cl.devweb.util.MigrationConstants;

public class UsersCDWriter implements ItemWriter<UserDecorator> {

    private JdbcTemplate jdbcTemplate;
    private CacheBean cacheBean;

    @Override
    public void write(List<? extends UserDecorator> usersDecorators) throws Exception {

        SimpleJdbcInsert userInsert = new SimpleJdbcInsert(jdbcTemplate)
                .withSchemaName(MigrationConstants.STD_DATA_SCHEMA)
                .withTableName("users")
                .usingColumns(
                        "u_email",
                        "u_appdomain_id",
                        "u_recurring",
                        "u_ut_id",
                        "u_state_id",
                        "u_uuid"
                )
                .usingGeneratedKeyColumns("u_id");

        for (UserDecorator userDecorator : usersDecorators) {
            Number userId = (Number) cacheBean.getCustomCache().get(userDecorator.getUserCD().getU_email());

            if (userId == null) {

                Map<String, Object> insertParametersForUser = new HashMap<>(9);
                insertParametersForUser.put("u_email", userDecorator.getUserCD().getU_email());
                insertParametersForUser.put("u_appdomain_id", userDecorator.getUserCD().getU_appdomain_id());
                insertParametersForUser.put("u_recurring", "t");
                insertParametersForUser.put("u_ut_id", 1);
                insertParametersForUser.put("u_state_id", 0);
                insertParametersForUser.put("u_uuid", userDecorator.getUserCD().getU_uuid());

                if (WriterRouterClassifierUser.INSERT_USERS_PIVOT_CITY_DEAL_USER.equals(userDecorator.getOperation())) {

                }

                userId = userInsert.executeAndReturnKey(insertParametersForUser);

            }

            userDecorator.getUserCD().setU_id(userId.longValue());
            userDecorator.getUserPivot().setCdUserId(userId.longValue());

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