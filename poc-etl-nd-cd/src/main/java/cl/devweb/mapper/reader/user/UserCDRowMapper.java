package cl.devweb.mapper.reader.user;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;
import org.springframework.jdbc.core.RowMapper;

import cl.devweb.model.citydeal.UserCD;

public class UserCDRowMapper implements RowMapper<UserCD> {

    @Override
    public UserCD mapRow(ResultSet rs, int rowNum) throws SQLException {
        UserCD userCD = new UserCD();
        userCD.setU_id(rs.getInt("u_id"));
        userCD.setU_uuid(UUID.fromString(rs.getString("u_uuid")));
        return userCD;
    }



}

