package view;

import persistence.Customer;
import service.CustomerService;
import service.CustomerServiceImpl;

public class Ex05CustomerView {
	
	private static CustomerService customerService;
	
	static {
		customerService = new CustomerServiceImpl();
	}
	
	public static void main(String[] args) {
		// customerService.signup("tEle@27oo", "AA11Bb@@");
		
		Customer customer = customerService.signin("tEle@27oo", "AA11Bb@@");
		
		if (customer == null) {
			System.out.println("Username or Password is incorrect");
		} else {
			System.out.println("Login successful");
			System.out.println(customer);
		}
	}
	
}