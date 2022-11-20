package org.tnsindia.service;

import org.tnsindia.dao.CustomerDao;
import org.tnsindia.dao.CustomerDaoImpl;
import org.tnsindia.entities.Customer;

public class CustomerServiceImpl implements CustomerService{

	private CustomerDao dao;
	
	
	public CustomerServiceImpl() {
		super();
		dao=new CustomerDaoImpl();
	}


	@Override
	public void addCustomer(Customer customer) {
		dao.beginTranscation();
		dao.addCustomer(customer);
		dao.commitTranscation();
	}


	@Override
	public void updateCustomer(Customer customer) {
		dao.beginTranscation();
		dao.updateCustomer(customer);
		dao.commitTranscation();
		
	}


	@Override
	public void deleteCustomer(Customer customer) {
		dao.beginTranscation();
		dao.deleteCustomer(customer);
		dao.commitTranscation();
		
	}


	
	@Override
	public Customer getCustomerById(int cust_ID) {
		Customer customer=dao.getCustomerById(cust_ID);
		return customer;
	}

	
}