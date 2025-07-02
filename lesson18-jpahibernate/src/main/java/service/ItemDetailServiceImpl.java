package service;

import java.util.List;

import dao.HibernateItemDetailDao;
import dao.ItemDetailDao;
import persistence.ItemDetail;

public class ItemDetailServiceImpl implements ItemDetailService {

	private ItemDetailDao itemDetailDao;

	public ItemDetailServiceImpl() {
		itemDetailDao = new HibernateItemDetailDao();
	}

	@Override
	public List<ItemDetail> getAll() {
		return itemDetailDao.getAll();
	}

<<<<<<< HEAD
}
=======
}
>>>>>>> 5c1e4eb (lesson18-jpahibernate-testing 02.07.2025)
