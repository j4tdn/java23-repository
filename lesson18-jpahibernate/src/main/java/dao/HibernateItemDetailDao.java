package dao;

import java.util.List;

<<<<<<< HEAD
import persistence.ItemDetail;
=======
import persistence.dto.ItemDetail;
>>>>>>> 5c1e4eb (lesson18-jpahibernate-testing 02.07.2025)

public class HibernateItemDetailDao extends GenericDao<ItemDetail> implements ItemDetailDao {
	
	@Override
	public List<ItemDetail> getAll() {
		return openSession().createQuery("FROM ItemDetail", ItemDetail.class).getResultList();
	}
	
	@Override
	Class<ItemDetail> getEntityClass() {
		return ItemDetail.class;
	}
	
<<<<<<< HEAD
}
=======
}
>>>>>>> 5c1e4eb (lesson18-jpahibernate-testing 02.07.2025)
