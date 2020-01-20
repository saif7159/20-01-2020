package com.javaconfig.datamodel;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CustomerMapper implements RowMapper<Customer> {

	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		Customer customer = new Customer();
		customer.setFirstname(rs.getString("cust_first"));
		customer.setLastname(rs.getString("cust_last"));
		customer.setEmail(rs.getString("cust_email"));
		return customer;
	}

}
