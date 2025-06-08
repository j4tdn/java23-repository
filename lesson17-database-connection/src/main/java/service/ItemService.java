package service;

import java.util.List;

import persistence.Item;

public interface ItemService {
	
	/**
	 * Get list of all items
	 * 
	 * @return list of {@link Item}
	 */
	List<Item> getAll();
	
}