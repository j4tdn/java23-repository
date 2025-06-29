package dao;

import java.util.List;

import persistence.ItemGroup;
import persistence.dto.ItemGroupDto;

public interface ItemGroupDao {

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

}
