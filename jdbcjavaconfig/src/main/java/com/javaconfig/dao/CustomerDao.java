package com.javaconfig.dao;
import com.javaconfig.datamodel.Customer;
import java.util.List;

public interface CustomerDao {
public Customer createCustomer(Customer customer);
public List<Customer> getAllCustomer();
public int updateCustomer(String email, int id);
public int deleteCustomer(int id);
}
