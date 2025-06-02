package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import connection.DbConnection;
import utils.SqlUtils;

class GenericDao {

	final Connection conn;
	Statement st;
	PreparedStatement pst;
	ResultSet rs;

	GenericDao() {
		conn = DbConnection.getConnection();
	}
	
	<E> List<E> getElements(String sql, Supplier<E> supplier) {
		List<E> result = new ArrayList<>();
		try {
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			while(rs.next()) {
				result.add(supplier.get());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, pst);
		}
		return result;
	}

}
