package com.customer.service;

import java.util.List;

import com.customer.datamodel.Customer;

public interface Service {
	public Customer createCustomer(Customer customer);
	public List<Customer> getAllCustomer();
	public int updateCustomer(String email, int id);
	public int deleteCustomer(int id);
}
