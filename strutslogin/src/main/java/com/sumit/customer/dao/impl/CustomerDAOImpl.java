package com.sumit.customer.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.sumit.customer.dao.CustomerDAO;
import com.sumit.customer.model.Customer;

public class CustomerDAOImpl extends HibernateDaoSupport implements CustomerDAO{
	
	
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(customer);
		
	}

	public List<Customer> listCustomer() {
		// TODO Auto-generated method stub
				return getHibernateTemplate().find("from Customer");
	}

}
