package dao;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Set;

public class JdbcOrderDao extends GenericDao implements OrderDao {
	
	private static final String Q_GET_SALE_DATE = ""
			+ "SELECT DISTINCT cast(C06_ORDER_TIME AS DATE) ORDER_DATE FROM T06_ORDER";

	@Override
	public Set<LocalDate> getSalesDate() {
		return getElementsAsSet(Q_GET_SALE_DATE, () -> {
			try {
				return rs.getDate("ORDER_DATE").toLocalDate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return null;
		});
	}

}
