package com.javaconfig.service;
import com.javaconfig.dao.*;
import com.javaconfig.datamodel.*;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("service")
public class ServiceImpl implements Service {
	CustomerDaoImpl dao = null;
	@Autowired
	public ServiceImpl(CustomerDaoImpl dao) {
		super();
		this.dao = dao;
	}

	@Override
	public Customer createCustomer(Customer customer) {
		
		return dao.createCustomer(customer);
	}

	@Override
	public List<Customer> getAllCustomer() {
		
		return dao.getAllCustomer();
	}

	@Override
	public int updateCustomer(String email, int id) {
		return dao.updateCustomer(email, id);
	}

	@Override
	public int deleteCustomer(int id) {
		return dao.deleteCustomer(id);
	}

}
