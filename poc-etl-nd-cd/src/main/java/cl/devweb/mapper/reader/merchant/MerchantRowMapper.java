package cl.devweb.mapper.reader.merchant;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import cl.devweb.model.devwebish.Company;
import cl.devweb.model.devwebish.Deal;
import cl.devweb.model.devwebish.DealAddress;
import cl.devweb.model.devwebish.MerchantND;

public class MerchantRowMapper implements RowMapper<MerchantND> {
    
    @Override
    public MerchantND mapRow(ResultSet rs, int rowNum) throws SQLException {
        MerchantND merchant = new MerchantND();
        
        Company company = new Company();
        DealAddress dealAddress = new DealAddress();
        Deal deal = new Deal();
        
        company.setId(rs.getLong("Company.id"));
        company.setName(rs.getString("Company.name"));
        company.setDescription(rs.getString("Company.description"));
        company.setWebsite(rs.getString("Company.website"));
        company.setLogo_url(rs.getString("Company.logo_url"));
        company.setCreated(rs.getDate("Company.created"));
        company.setModified(rs.getDate("Company.modified"));
        
        dealAddress.setAddress(rs.getString("DealAddress.address"));
        dealAddress.setLat(rs.getDouble("DealAddress.lat"));
        dealAddress.setLng(rs.getDouble("DealAddress.lng"));
        
        deal.setCountry_id(rs.getInt("Deal.country_id"));
        
        merchant.setCompany(company);
        merchant.setDealAddress(dealAddress);
        merchant.setDeal(deal);
        
        return merchant;
    }
    
}
