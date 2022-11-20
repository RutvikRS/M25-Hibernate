package org.tnsindia.client;

import java.util.Scanner;

import org.tnsindia.entities.Customer;
import org.tnsindia.service.CustomerService;
import org.tnsindia.service.CustomerServiceImpl;

public class Client {

	public static void main(String[] args) {
		CustomerService service=new CustomerServiceImpl();
		Customer customer=new Customer();
		Scanner s=new Scanner(System.in);
		
		//create operation
		/*customer.setCust_ID(1025);
		customer.setName("Rutvik");
		customer.setProduct_price(678.60);
		service.addCustomer(customer);
		System.out.println("Customer added successfully");*/
		
		//retrieve operation
		/*customer=service.getCustomerById(1023);
		System.out.println("Customer ID: "+customer.getCust_ID());
		System.out.println("Customer Name: "+customer.getName());
		System.out.println("Customer Product-Price: "+customer.getProduct_price());*/
		
		//Updation Operation
		/*System.out.println("Enter the Customer ID for the updation: ");
		customer=service.getCustomerById(s.nextInt());
		customer.setName("");
		service.updateCustomer(customer);
		System.out.println("Customer updated successfuly");*/
		
		//deletion operation
		System.out.println("Enter the Customer ID for the deletion: ");
		customer=service.getCustomerById(s.nextInt());
		service.deleteCustomer(customer);
		System.out.println("Customer deleted successfuly");
		
		
	}

}