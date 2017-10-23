package cl.devweb.mapper.reader.location;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;
import org.springframework.jdbc.core.RowMapper;

import cl.devweb.model.citydeal.ParticipantCities;

public class ParticipantCityRowMapper implements RowMapper<ParticipantCities> {

    @Override
    public ParticipantCities mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new ParticipantCities(rs.getInt("ptc_id"), UUID.fromString(rs.getString("ptc_guid")));
    }


}

