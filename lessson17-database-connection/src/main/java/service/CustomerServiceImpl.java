package service;

import java.util.Objects;

import dao.CustomerDao;
import dao.JdbcCustomerDao;
import persistence.Customer;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerDao customerDao;
	
	public CustomerServiceImpl() {
		customerDao = new JdbcCustomerDao();
	}
	
	@Override
	public void signup(String username, String password) {
		Objects.requireNonNull(username, "username should not be null");
		Objects.requireNonNull(password, "password should not be null");
		customerDao.signup(username, password);
	}
	
	@Override
	public Customer signin(String username, String password) {
		Objects.requireNonNull(username, "username should not be null");
		Objects.requireNonNull(password, "password should not be null");
		return customerDao.signin(username, password);
	}
	
}
