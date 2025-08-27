package dao;

import java.util.List;

import persistence.ItemDetail;

public class HibernateItemDetailDao extends GenericDao<ItemDetail> implements ItemDetailDao {
	
	@Override
	public List<ItemDetail> getAll() {
		return openSession().createQuery("FROM ItemDetail", ItemDetail.class).getResultList();
	}
	
	@Override
	Class<ItemDetail> getEntityClass() {
		return ItemDetail.class;
	}
	
}