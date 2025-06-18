package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import persistence.ItemGroup;

public class HibernateItemGroupDao extends GenericDao implements ItemGroupDao {
	
	private static final String Q_GET_ALL = ""
			+ "SELECT gr FROM ItemGroup gr WHERE gr.id < 5";

	@Override
	public List<ItemGroup> getAll() {
		Session session = openSession();
		Query<ItemGroup> query = session.createQuery(Q_GET_ALL, getEntityClass());
		return query.getResultList();
	}
	
	private Class<ItemGroup> getEntityClass() {
		return ItemGroup.class;
	}
	
}
