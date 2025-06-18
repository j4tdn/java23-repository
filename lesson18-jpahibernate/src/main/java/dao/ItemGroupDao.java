package dao;

import java.util.List;

import persistence.ItemGroup;

public interface ItemGroupDao {
	
	/**
	 * Get all item groups
	 * 
	 * @return list of item groups
	 */
	List<ItemGroup> getAll();
	
}
