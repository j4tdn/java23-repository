package dao;

import java.sql.SQLException;

import persistence.Customer;
import utils.SqlUtils;

public class JdbcCustomerDao extends GenericDao implements CustomerDao {
	
	private static final String Q_SIGN_UP = ""
			+ "INSERT INTO T07_CUSTOMER(C07_CUSTOMER_NAME, C07_USERNAME, C07_PASSWORD, C07_ACCOUNT_STATUS)\n"
			+ "VALUE(?, ?, ?, ?)";
	
	private static final String Q_SIGN_IN = ""
			+ "SELECT *\n"
			+ "  FROM T07_CUSTOMER\n"
			+ " WHERE C07_USERNAME = ?\n"
			+ "   AND C07_PASSWORD = ?";
	
	@Override
	public void signup(String username, String password) {
		try {
			pst = conn.prepareStatement(Q_SIGN_UP);
			pst.setString(1, "USER_" + String.valueOf(username.charAt(0)).toUpperCase());
			pst.setString(2, username);
			pst.setString(3, SqlUtils.md5(password));
			pst.setInt(4, 1);
			pst.executeUpdate();
			System.out.println(">> Account " + username + " is registered successful");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public Customer signin(String username, String password) {
		return getElement(Q_SIGN_IN, 
				() -> {
					try {
						pst.setString(1, username);
						pst.setString(2, SqlUtils.md5(password));
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}, 
				() ->  {
					try {
						Customer customer = new Customer();
						customer.setId(rs.getInt("C07_CUSTOMER_ID"));
						customer.setName(rs.getString("C07_CUSTOMER_NAME"));
						customer.setUsername(rs.getString("C07_USERNAME"));
						customer.setPassword(rs.getString("C07_PASSWORD"));
						customer.setStatus(rs.getBoolean("C07_ACCOUNT_STATUS"));
						return customer;
					} catch (SQLException e) {
						e.printStackTrace();
						return null;
					}
				});
	}
}