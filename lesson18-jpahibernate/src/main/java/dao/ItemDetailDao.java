package dao;

import java.util.List;

import persistence.ItemDetail;

public interface ItemDetailDao {

	/**
	 * Get all item details
	 */
	List<ItemDetail> getAll();

}