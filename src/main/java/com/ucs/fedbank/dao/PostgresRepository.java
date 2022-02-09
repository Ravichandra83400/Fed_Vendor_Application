package com.ucs.fedbank.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ucs.fedbank.model.PincodeData;

@Repository
public class PostgresRepository  {
    
	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<PincodeData> findByPincode(String pincode) {
		 List<PincodeData> list = jdbcTemplate.query("select  * from pincodemaster p where pincode= ? ", BeanPropertyRowMapper.newInstance(PincodeData.class),
				pincode);
		return list;
	}

}
