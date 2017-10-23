package cl.devweb.mapper.reader.user;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import cl.devweb.model.devwebish.CityPivot;
import cl.devweb.model.devwebish.UserAddress;
import cl.devweb.model.devwebish.UserPivot;
import cl.devweb.model.devwebish.enums.CountryEnum;

public class UserAddressRowMapper implements RowMapper<UserAddress> {

    @Override
    public UserAddress mapRow(ResultSet rs, int rowNum) throws SQLException {
        UserAddress userAddress = new UserAddress();
        userAddress.setUserPivot(this.getUserPivot(rs));
        userAddress.setRecipientName(rs.getString("ua.recipient_name"));
        userAddress.setStreetName(rs.getString("ua.street_name"));
        userAddress.setStreetNumber(rs.getString("ua.street_number"));
        userAddress.setZipCode(rs.getString("ua.zip_code"));
        userAddress.setPhoneNumber(rs.getString("ua.phone_number"));
        userAddress.setRecipientId(rs.getString("ua.recipient_id"));
        userAddress.setResidenceNumber(rs.getString("ua.residence_number"));
        userAddress.setReference(rs.getString("ua.reference"));
        return userAddress;
    }

    private UserPivot getUserPivot(ResultSet rs) throws SQLException {
        UserPivot userPivot = new UserPivot();
        userPivot.setCdUserId(rs.getLong("up.cd_user_id"));
        userPivot.setCityPivot(this.getCityPivot(rs));
        return userPivot;
    }

    private CityPivot getCityPivot(ResultSet rs) throws SQLException {
        CityPivot cityPivot = new CityPivot(CountryEnum.getCountryEnumById(rs.getInt("cp.n_country_id")));
        cityPivot.setN_name(rs.getString("cp.n_name"));
        return cityPivot;
    }


}

