package service;

import java.util.List;
import java.util.Set;

import persistence.ItemGroup;
import persistence.dto.ItemGroupDto;

public interface ItemGroupService {
	
	/**
	 * Get all item groups
	 * 
	 * @return list of item groups
	 */
	List<ItemGroup> getAll();
	
	/**
	 * Get item group by id
	 * 
	 * @param id the given id
	 * @return {@link ItemGroup}
	 */
	ItemGroup get(int id);
	
	/**
	 * Get item group by name
	 * 
	 * @param id the given name
	 * @return {@link ItemGroup}
	 */
	ItemGroup get(String name);
	
	/**
	 * Count number of items in each group
	 * 
	 * @return list of item group dto
	 */
	List<ItemGroupDto> statisticItemsOfEachGroup();
	
	/**
	 * Save the new item group
	 * 
	 * @param group the group
	 */
	void save(ItemGroup group);
	
	/**
	 * Update the existing item group
	 * 
	 * @param group the group
	 */
	void update(ItemGroup group);
	
	/**
	 * Delete group by given groupId
	 * 
	 * @param groupId the group id
	 */
	void delete(int groupId);
	
	/**
	 * Delete group by given groupId
	 * 
	 * @param groupId the group id
	 */
	void delete(Set<Integer> groupIds);
	/**
	 * Testing 1st and 2nd level cache
	 */
	void testHibernateCache();
}