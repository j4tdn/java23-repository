package dao;

import persistence.Customer;

public interface CustomerDao {

	/**
	 * Register new account in system
	 * 
	 * @param username username
	 * @param password password
	 */
	void signup(String username, String password);

	/**
	 * Check login
	 * 
	 * @param username username
	 * @param password password
	 * @return found {@link Customer}
	 */
	Customer signin(String username, String password);

}