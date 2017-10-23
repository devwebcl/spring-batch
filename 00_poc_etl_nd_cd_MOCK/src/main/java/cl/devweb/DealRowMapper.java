package cl.devweb;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;

import cl.devweb.model.Deal;




// Reader

public class DealRowMapper implements RowMapper<Deal> {

	private Logger logger = Logger.getLogger(DealRowMapper.class);
	
	@Override
	public Deal mapRow(ResultSet rs, int rowNum) throws SQLException {

		Deal deal;
		
		logger.debug("reader...");
		
		/*
		//mapping from ResultSet :S
		deal.setId(rowNum); // each row as ID, it may clash... it must be an unique identifier (uuid?)
		
		deal.setDate(rs.getString(1));
		deal.setBrand_id(rs.getString(2));
		deal.setStatus(rs.getString(3));
		deal.setType2(rs.getString(4));
		*/
		
		// faster coding :P
		BeanPropertyRowMapper<Deal> bprm = new BeanPropertyRowMapper<Deal>(Deal.class);
		deal =  (Deal) bprm.mapRow(rs, rowNum);
		
		//custom mapping:
		deal.setId(rowNum);
		
		return deal;
	}
	
	


	
}	

