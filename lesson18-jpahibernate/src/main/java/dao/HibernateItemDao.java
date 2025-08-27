package dao;

import java.util.List;

import persistence.Item;

public class HibernateItemDao extends GenericDao<Item> implements ItemDao {
	
	private static final String Q_GET_ALL = ""
			+ "SELECT * FROM t01_item WHERE C01_ITEM_ID";
	
	@Override
	public List<Item> getAll() {
		return openSession().createNativeQuery(Q_GET_ALL, getEntityClass()).getResultList();
	}
	
	@Override
	Class<Item> getEntityClass() {
		return Item.class;
	}
}
