package dao;

import java.sql.SQLException;

import utils.SqlUtils;

public class JdbcItemDetailDao extends GenericDao implements ItemDetailDao {
	
	private static String Q_ADD_AMOUNT = ""
			+ "UPDATE T03_ITEM_DETAIL SET C03_AMOUNT = C03_AMOUNT + ? WHERE C03_ITEM_DETAIL_ID = ?";
	
	private static String Q_SUBTRACT_AMOUNT = ""
			+ "UPDATE T03_ITEM_DETAIL SET C03_AMOUNT = C03_AMOUNT - ? WHERE C03_ITEM_DETAIL_ID = ?";
	
	@Override
	public void updateAmounts(int itemDetailIdForAdd, int itemDetailIdForSubtract, int value) {
		try {
			conn.setAutoCommit(false);
			
			// statement 1
			pst = conn.prepareStatement(Q_ADD_AMOUNT);
			pst.setInt(1, value);
			pst.setInt(2, itemDetailIdForAdd);
			pst.executeUpdate();
			
			System.out.println("try exception -->" + 1/0);
			
			// statement 2
			pst = conn.prepareStatement(Q_SUBTRACT_AMOUNT);
			pst.setInt(1, value);
			pst.setInt(2, itemDetailIdForSubtract);
			pst.executeUpdate();
			
			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			SqlUtils.close(rs, pst);
		}
	}

}
