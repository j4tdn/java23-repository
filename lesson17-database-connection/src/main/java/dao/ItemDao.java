package dao;

import java.util.List;

import persistence.Item;

public interface ItemDao {
	
	/**
	 * Get list of all items
	 * 
	 * @return list of {@link Item}
	 */
	List<Item> getAll();
	
}