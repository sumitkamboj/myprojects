package com.sumit.customer.bo;

import java.util.List;

import com.sumit.customer.model.Customer;

public interface CustomerBo {
		void addCustomer(Customer customer);
		List<Customer> listCustomer();
}
