package com.customer.dao;

import java.util.List;
import com.customer.model.Customer;
 
public interface CustomerDAO{
	
	void addCustomer(Customer customer);
	List<Customer> listCustomer();	
	
}