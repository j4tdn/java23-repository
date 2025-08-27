package service;

import dao.ItemDetailDao;
import dao.JdbcItemDetailDao;

public class ItemDetailServiceImpl implements ItemDetailService {

	private ItemDetailDao itemDetailDao;
	
	public ItemDetailServiceImpl() {
		itemDetailDao = new JdbcItemDetailDao();
	}
	
	@Override
	public void updateAmounts(int itemDetailIdForAdd, int itemDetailIdForSubtract, int value) {
		itemDetailDao.updateAmounts(itemDetailIdForAdd, itemDetailIdForSubtract, value);
	}
	
	
	
}