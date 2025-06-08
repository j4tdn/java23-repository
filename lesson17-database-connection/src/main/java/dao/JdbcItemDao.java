package dao;

import java.sql.SQLException;
import java.util.List;

import persistence.Item;
import persistence.ItemGroup;

public class JdbcItemDao extends GenericDao implements ItemDao {

	private static final String Q_GET_ALL = ""
			+ "SELECT t01.C01_ITEM_ID AS ITEM_ID,\n"
			+ "	      t01.C01_ITEM_NAME AS ITEM_NAME,\n"
			+ "       t01.C01_ITEM_GROUP_ID AS ITEM_GROUP_ID,\n"
			+ "       t04.C04_ITEM_GROUP_NAME AS ITEM_GROUP_NAME\n"
			+ "  FROM T01_ITEM t01\n"
			+ "  JOIN T04_ITEM_GROUP t04\n"
			+ "    ON t01.C01_ITEM_GROUP_ID = t04.C04_ITEM_GROUP_ID";
	
	@Override
	public List<Item> getAll() {
		return getElementsAsList(Q_GET_ALL, () -> {
			Item item = null;
			try {
				item = new Item(rs.getInt("ITEM_ID"),rs.getString("ITEM_NAME"),
						new ItemGroup(rs.getInt("ITEM_GROUP_ID"), rs.getString("ITEM_GROUP_NAME")));
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return item;
		});
		
	}

}
