package service;

import java.util.List;

import persistence.ItemGroup;

public interface ItemGroupService {
	
	/**
	 * Get all item groups
	 * 
	 * @return list of item groups
	 */
	List<ItemGroup> getAll();
	
}