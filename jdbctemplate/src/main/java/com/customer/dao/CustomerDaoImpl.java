package com.customer.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.customer.datamodel.Customer;
import com.customer.datamodel.CustomerMapper;
@Component("dao")
public class CustomerDaoImpl implements CustomerDao {
	private JdbcTemplate jdbcTemplate = null;
	@Autowired
	public CustomerDaoImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Customer createCustomer(Customer customer) {
		String sql = "insert into Customer(CUST_FIRST, CUST_LAST, CUST_EMAIL) VALUES (?,?,?);";
		jdbcTemplate.update(sql, new Object[] {customer.getFirstname(),customer.getLastname(),customer.getEmail()});
		return customer;
	}

	@Override
	public List<Customer> getAllCustomer() {
		String sql = "Select CUST_FIRST, CUST_LAST, CUST_EMAIL from Customer;";
		return jdbcTemplate.query(sql, new CustomerMapper());
	}

	@Override
	public int updateCustomer(String email, int id) {
		String sql = "Update Customer set CUST_EMAIL = ? where CUST_ID = ?;";
		int i = jdbcTemplate.update(sql, email,id);
		return i;
	}

	@Override
	public int deleteCustomer(int id) {
		String sql = "Delete from Customer where CUST_ID = ?;";
		int i = jdbcTemplate.update(sql,id);
		return i;
	}

}
