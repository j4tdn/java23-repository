package service;

import java.util.List;

import persistence.ItemDetail;

public interface ItemDetailService {

	/**
	 * Get all item details
	 */
	List<ItemDetail> getAll();

}