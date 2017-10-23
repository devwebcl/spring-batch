package cl.devweb.mapper.reader.user;

import com.fasterxml.uuid.Generators;

import cl.devweb.model.devwebish.Account;
import cl.devweb.model.devwebish.CityPivot;
import cl.devweb.model.devwebish.User;
import cl.devweb.model.devwebish.UserAddress;
import cl.devweb.model.devwebish.UserPivot;
import cl.devweb.model.devwebish.enums.CountryEnum;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;
import org.apache.commons.lang3.StringUtils;
import org.springframework.jdbc.core.RowMapper;

public class AccountRowMapper implements RowMapper<Account> {

    @Override
    public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
        return this.getAccount(rs);
    }

    private Account getAccount(ResultSet rs) throws SQLException {
        Account account = new Account();
        account.setUsername(rs.getString("account.username"));
        account.setPassword(rs.getString("account.password"));
        account.setShipping_rut(rs.getString("account.shipping_rut"));
        account.setUser(this.getUser(rs));
        return account;
    }

    private User getUser(ResultSet rs) throws SQLException {
        User user = new User();

        user.setCity(this.getCity(rs));

        user.setId(rs.getInt("user.id"));
        user.setActive(rs.getBoolean("user.active"));
        user.setName(rs.getString("user.name"));
        user.setCompany_id(rs.getLong("user.company_id"));

        long cdUserId = rs.getLong("user_pivot.cd_user_id");

        if (cdUserId != 0) {
            UserPivot userPivot = new UserPivot();
            userPivot.setCdUserId(cdUserId);
            
            userPivot.setUuid(rs.getString("user_pivot.uuid"));

            user.setUserPivot(userPivot);
        }

        String strUUID = rs.getString("consumer.identifier");
        if (StringUtils.isEmpty(strUUID)) {
            if (user.getUserPivot() != null) {
                //if user pivot != null mean that exists an user created in city deal with an uuid for this row
                user.setUuid(UUID.fromString(user.getUserPivot().getUuid()));
            } else {
                user.setUuid(Generators.randomBasedGenerator().generate());
            }
        } else {
            try {
                user.setUuid(UUID.fromString(strUUID));
            } catch (IllegalArgumentException ex) {
                user.setUuid(Generators.randomBasedGenerator().generate());
            }
        }

        return user;
    }

    private CityPivot getCity(ResultSet rs) throws SQLException {
        //Only we need app domain id
        CityPivot cityPivot = new CityPivot(CountryEnum.getCountryEnumById(rs.getInt("city_pivot.n_country_id")));
        cityPivot.setId(rs.getInt("city_pivot.id"));
        return cityPivot;
    }

    private UserAddress getUserAddress(ResultSet rs) {
        return null;
    }

}

