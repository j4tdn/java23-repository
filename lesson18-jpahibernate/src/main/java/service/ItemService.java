package service;

import java.util.List;

import persistence.Item;

public interface ItemService {
	
	/**
	 * Get all items
	 * 
	 * @return list of items
	 */
	List<Item> getAll();
}