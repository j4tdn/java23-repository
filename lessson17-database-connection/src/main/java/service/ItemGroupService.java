package service;

import java.util.List;

import persistence.ItemGroup;
import persistence.ItemGroupDto;

public interface ItemGroupService {
	
	/**
	 * Get list of all item groups
	 *
	 * @return list of {@link ItemGroup}
	 */
	List<ItemGroup> getAll();
	
	/**
	 * Statistic amount of items in each group
	 * 
	 * @return list of {@link ItemGroupDto}
	 */
	List<ItemGroupDto> statisticItemGroups();
	
	/**
	 * Get item group by given id
	 * 
	 * @param id the id
	 * @return found {@link ItemGroup} of null if not exists
	 */
	ItemGroup get(int id);
	
	/**
	 * Get item group by given name
	 * 
	 * @param name the name
	 * @return found {@link ItemGroup} of null if not exists
	 */
	ItemGroup get(String name);

	/**
	 * Save new item group if not exists
	 * 
	 * @param group the group
	 */
	void save(ItemGroup group);
	
	/**
	 * Save new item groups if not exists
	 * 
	 * @param groups the groups
	 */
	void save(List<ItemGroup> groups);
	
	/**
	 * Merge new item group
	 * 
	 * @param group the group
	 */
	void merge(ItemGroup group);
	
	
}
