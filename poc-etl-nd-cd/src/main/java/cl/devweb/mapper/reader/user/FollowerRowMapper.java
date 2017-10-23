package cl.devweb.mapper.reader.user;

import com.fasterxml.uuid.Generators;

import cl.devweb.model.devwebish.Account;
import cl.devweb.model.devwebish.CityPivot;
import cl.devweb.model.devwebish.User;
import cl.devweb.model.devwebish.enums.CountryEnum;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class FollowerRowMapper implements RowMapper<Account> {

    @Override
    public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
        return this.getAccount(rs);
    }

    private Account getAccount(ResultSet rs) throws SQLException {
        Account account = new Account();
        account.setUsername(rs.getString("follower.email"));
        account.setUser(this.getUser(rs));
        return account;
    }

    private User getUser(ResultSet rs) throws SQLException {
        User user = new User();
        user.setCity(this.getCity(rs));
        user.setCreated(rs.getDate("follower.created"));
        user.setUuid(Generators.randomBasedGenerator().generate());
        return user;
    }

    private CityPivot getCity(ResultSet rs) throws SQLException {
        CityPivot cityPivot = new CityPivot(CountryEnum.getCountryEnumById(rs.getInt("cp.n_country_id")));
        cityPivot.setCd_city_id(rs.getInt("cp.cd_city_id"));
        cityPivot.setId(rs.getInt("cp.id"));
        return cityPivot;
    }

}

