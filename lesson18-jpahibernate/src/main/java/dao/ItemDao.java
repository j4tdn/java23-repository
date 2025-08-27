package dao;

import java.util.List;

import persistence.Item;

public interface ItemDao {

	/**
	 * Get all items
	 * 
	 * @return list of items
	 */
	List<Item> getAll();

}