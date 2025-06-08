package dao;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Arrays;
import java.util.List;

import persistence.ItemGroup;
import persistence.ItemGroupDto;
import utils.SqlUtils;

public class JdbcItemGroupDao extends GenericDao implements ItemGroupDao {

	private static String Q_GET_ALL = ""
			+ "SELECT * FROM T04_ITEM_GROUP";

	private static String Q_STATISTIC_ITEM_GROUPS = "" 
			+ "SELECT t04.C04_ITEM_GROUP_ID " + ItemGroupDto.PROP_ID + ",\n"
			+ "       t04.C04_ITEM_GROUP_NAME " + ItemGroupDto.PROP_NAME + ",\n"
			+ "       COUNT(*) " + ItemGroupDto.PROP_AMOUNT_OF_ITEMS + "\n" 
			+ "  FROM T01_ITEM t01\n" 
			+ "  JOIN T04_ITEM_GROUP t04\n"
			+ "    ON t01.C01_ITEM_GROUP_ID = t04.C04_ITEM_GROUP_ID\n" 
			+ " GROUP BY t04.C04_ITEM_GROUP_ID";

	private static String Q_INSERT_NEW_GROUP = ""
			+ "INSERT INTO T04_ITEM_GROUP(C04_ITEM_GROUP_ID, C04_ITEM_GROUP_NAME)\n" 
			+ "VALUES(?, ?)";
	
	private static String Q_MERGE_GROUP = ""
			+ "CALL mergeItemGroup(?, ?)";
	
	@Override
	public List<ItemGroup> getAll() {
		return getElementsAsList(Q_GET_ALL, () -> {
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
		return getElementsAsList(Q_STATISTIC_ITEM_GROUPS, () -> {
			ItemGroupDto itemGroupDto = null;
			try {
				itemGroupDto = new ItemGroupDto(rs.getInt(ItemGroupDto.PROP_ID), rs.getString(ItemGroupDto.PROP_NAME),
						rs.getInt(ItemGroupDto.PROP_AMOUNT_OF_ITEMS));
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return itemGroupDto;
		});
	}

	@Override
	public ItemGroup get(int id) {
		return getElement("SELECT * FROM T04_ITEM_GROUP WHERE C04_ITEM_GROUP_ID = ?", () -> {
			try {
				pst.setInt(1, id);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}, () -> {
			try {
				return new ItemGroup(rs.getInt("C04_ITEM_GROUP_ID"), rs.getString("C04_ITEM_GROUP_NAME"));
			} catch (SQLException e) {
				e.printStackTrace();
				return null;
			}
		});
	}

	@Override
	public ItemGroup get(String name) {
		return getElement(
				"SELECT * FROM T04_ITEM_GROUP WHERE C04_ITEM_GROUP_NAME = ?", 
				() -> {
					try {
						pst.setString(1, name);
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}, 
				() ->  {
					try {
						return new ItemGroup(rs.getInt("C04_ITEM_GROUP_ID"), rs.getString("C04_ITEM_GROUP_NAME"));
					} catch (SQLException e) {
						e.printStackTrace();
						return null;
					}
				});
	}

	@Override
	public void save(ItemGroup group) {
		try {
			pst = conn.prepareStatement(Q_INSERT_NEW_GROUP);
			pst.setInt(1, group.getId());
			pst.setString(2, group.getName());
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(pst);
		}

	}

	@Override
	public void save(List<ItemGroup> groups) {
		try {
			int COUNT = 0;
			pst = conn.prepareStatement(Q_INSERT_NEW_GROUP);
			for (ItemGroup group: groups) {
				pst.setInt(1, group.getId());
				pst.setString(2, group.getName());
				pst.addBatch();
				if (++COUNT % BATCH_SIZE == 0) {
					pst.executeBatch();
				}
			}
			int[] affectedRows = pst.executeBatch();
			System.out.println("affectedRows: " + Arrays.toString(affectedRows));
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(pst);
		}
	}
	
	@Override
	public void merge(ItemGroup group) {
		try {
			cst = conn.prepareCall(Q_MERGE_GROUP);
			cst.setInt(1, group.getId());
			cst.setString(2, group.getName());
			cst.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(cst);
		}
	}

}
