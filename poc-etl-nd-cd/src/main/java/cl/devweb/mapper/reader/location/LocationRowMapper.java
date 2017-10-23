package cl.devweb.mapper.reader.location;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import cl.devweb.model.devwebish.City;
import cl.devweb.model.devwebish.Location;

public class LocationRowMapper implements RowMapper<Location> {

    @Override
    public Location mapRow(ResultSet rs, int rowNum) throws SQLException {

        Location location = new Location();
        location.setId(rs.getInt("location.id"));
        location.setSlug(rs.getString("location.slug"));
        location.setName(rs.getString("location.name"));
        location.setLat(rs.getFloat("location.lat"));
        location.setLng(rs.getFloat("location.lng"));
        location.setCity(this.getCity(rs));
        return location;
    }

    private City getCity(ResultSet rs) throws SQLException {
        City city = new City(rs.getInt("city.country_id"));
        city.setId(rs.getInt("city.id"));
        city.setSlug(rs.getString("city.slug"));
        city.setName(rs.getString("city.name"));
        city.setLat(rs.getFloat("city.lat"));
        city.setLng(rs.getFloat("city.lng"));
        return city;
    }

}

