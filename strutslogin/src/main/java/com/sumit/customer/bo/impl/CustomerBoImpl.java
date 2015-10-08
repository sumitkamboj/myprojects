package com.sumit.customer.bo.impl;

import java.util.List;

import com.sumit.customer.bo.CustomerBo;
import com.sumit.customer.dao.CustomerDAO;
import com.sumit.customer.dao.impl.CustomerDAOImpl;
import com.sumit.customer.model.Customer;

public class CustomerBoImpl implements CustomerBo{

	CustomerDAO customerDAO;
		
	public CustomerDAO getCustomerDAO() {
		return customerDAO;
	}

	public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}

	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerDAO.addCustomer(customer);
	}

	public List<Customer> listCustomer() {
		// TODO Auto-generated method stub
		return customerDAO.listCustomer();
	}

	
}
