package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

import connection.DbConnection;
import persistence.ItemGroup;
import utils.SqlUtils;

class GenericDao {
	
	final int BATCH_SIZE = 1000;

	final Connection conn;
	Statement st;
	PreparedStatement pst;
	CallableStatement cst;
	ResultSet rs;

	GenericDao() {
		conn = DbConnection.getConnection();
	}
	
	<E> List<E> getElementsAsList(String sql, Supplier<E> supplier) {
		return getElements(sql, supplier, ArrayList::new);
	}
	
	<E> Set<E> getElementsAsSet(String sql, Supplier<E> supplier) {
		return getElements(sql, supplier, HashSet::new);
	}
	
	/**
	 * Utility method to get collection of elements
	 * 
	 * @param supplier    use to return object represents for each record
	 * @param colSupplier use to receive collection type as return data type
	 */
	<E, R extends Collection<E>> R getElements(String sql, Supplier<E> supplier, Supplier<R>colSupplier) {
		R result = colSupplier.get();
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
	
	/**
	 * Utility method to get element
	 * 
	 * @param paramSetter use for setting sql params via 'pst'
	 * @param supplier    use to return object represents for each record
	 */
	<E> E getElement(String sql, Runnable paramSetter, Supplier<E> supplier) {
		E result = null;
		try {
			pst = conn.prepareStatement(sql);
			paramSetter.run(); // pst ....
			rs = pst.executeQuery(sql);
			if (rs.next()) {
				result = supplier.get();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, pst);
		}

		return result;
	}

}