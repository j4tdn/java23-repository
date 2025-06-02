package dao;

import java.sql.SQLException;
import java.util.List;

import persistence.ItemGroup;
import persistence.ItemGroupDto;
import utils.SqlUtils;

public class JdbcItemGroupDao extends GenericDao implements ItemGroupDao {

	private static String Q_GET_ALL = "SELECT * FROM T04_ITEM_GROUP";
	
	private static String Q_STATISTIC_ITEM_GROUPS = ""
			+ "SELECT t04.C04_ITEM_GROUP_ID " + ItemGroupDto.PROP_ID + ",\n"
			+ "       t04.C04_ITEM_GROUP_NAME " + ItemGroupDto.PROP_NAME + ",\n"
			+ "       COUNT(*) " + ItemGroupDto.PROP_AMOUNT_OF_ITEMS + "\n"
			+ "  FROM T01_ITEM t01\n"
			+ "  JOIN T04_ITEM_GROUP t04\n"
			+ "    ON t01.C01_ITEM_GROUP_ID = t04.C04_ITEM_GROUP_ID\n"
			+ "  GROUP BY t04.C04_ITEM_GROUP_ID";
	
	@Override
	public List<ItemGroup> getAll() {
		return getElements(Q_GET_ALL, () -> {
			ItemGroup group = null;
			try {
				group = new ItemGroup(rs.getInt("C04_ITEM_GROUP_ID"), rs.getString("C04_ITEM_GROUP_NAME"));
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return group;
		});
	}
	
	@Override
	public List<ItemGroupDto> statisticItemGroups() {
		return getElements(Q_STATISTIC_ITEM_GROUPS, () -> {
			ItemGroupDto itemGroupDto = null;
			try {
				itemGroupDto = new ItemGroupDto(
						rs.getInt(ItemGroupDto.PROP_ID), 
						rs.getString(ItemGroupDto.PROP_NAME),
						rs.getInt(ItemGroupDto.PROP_AMOUNT_OF_ITEMS));
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return itemGroupDto;
		});
	}
	
	@Override
	public ItemGroup get(int id) {
		ItemGroup result = null;
		
		String sql = "SELECT * FROM T04_ITEM_GROUP WHERE C04_ITEM_GROUP_ID = " + id;
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			if(rs.next()) {
				result = new ItemGroup(rs.getInt("C04_ITEM_GROUP_ID"), rs.getString("C04_ITEM_GROUP_NAME"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		
		return result;
	}
	
	@Override
	public ItemGroup get(String name) {
		ItemGroup result = null;
		String sql = "SELECT * FROM T04_ITEM_GROUP WHERE C04_ITEM_GROUP_NAME = ?";
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, name);
			rs = pst.executeQuery();
			if(rs.next()) {
				result = new ItemGroup(rs.getInt("C04_ITEM_GROUP_ID"), rs.getString("C04_ITEM_GROUP_NAME"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, pst);
		}
		
		return result;
	}
	
	@Override
	public void save(ItemGroup group) {
		String sql = "INSERT INTO T04_ITEM_GROUP(C04_ITEM_GROUP_ID, C04_ITEM_GROUP_NAME)\n"
				   + "VALUES(?, ?)";
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, group.getId());
			pst.setString(2, group.getName());
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(pst);
		}
		
	}
	
}
