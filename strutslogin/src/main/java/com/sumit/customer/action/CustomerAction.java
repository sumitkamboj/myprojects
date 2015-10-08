package com.sumit.customer.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.opensymphony.xwork2.ModelDriven;
import com.sumit.customer.bo.CustomerBo;
import com.sumit.customer.model.Customer;

public class CustomerAction implements ModelDriven{
	
	Customer customer = new Customer();
	List<Customer> customerList = new ArrayList<Customer>();
	CustomerBo customerBo;
	
	
	public CustomerBo getCustomerBo() {
		return customerBo;
	}


	public void setCustomerBo(CustomerBo customerBo) {
		this.customerBo = customerBo;
	}


	public List<Customer> getCustomerList() {
		return customerList;
	}


	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
	}


	public Object getModel() {
		// TODO Auto-generated method stub
		return customer;
	}
	
	public String addCustomer() throws Exception{
		customer.setCreatedDate(new Date());
		customerBo.addCustomer(customer);
		customerList=null;
		customerList=customerBo.listCustomer();
		return "success";
		
	}
	
	public String listCustomer() throws Exception{
		customerList=customerBo.listCustomer();
		return "success";
	}
}
