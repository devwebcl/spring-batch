package cl.devweb.mapper.reader.location;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import cl.devweb.model.devwebish.CityPivot;

public class CityPivotRowMapper implements RowMapper<CityPivot> {

    @Override
    public CityPivot mapRow(ResultSet rs, int rowNum) throws SQLException {

        return new CityPivot(
                rs.getInt("n_city_id"),
                0,
                rs.getFloat("n_latitude"),
                rs.getFloat("n_longitude"),
                rs.getString("n_slug"),
                rs.getString("n_name"),
                rs.getInt("n_country_id"),
                rs.getInt("cd_appdomain_id"),
                rs.getInt("cd_city_id"),
                rs.getString("cd_city_uuid")
        );
    }


}

