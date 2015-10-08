package com.sumit.customer.dao;

import java.util.List;

import com.sumit.customer.model.Customer;

public interface CustomerDAO {

	void addCustomer(Customer customer);
	List<Customer> listCustomer();
}
