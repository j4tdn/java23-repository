package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import persistence.ItemGroup;
import persistence.dto.ItemGroupDto;

public class HibernateItemGroupDao extends GenericDao<ItemGroup> implements ItemGroupDao {
	
	// private static final String Q_GET_ALL = ""
	//		+ "SELECT gr FROM ItemGroup gr WHERE gr.id < 5";

	// createQuery       --> sử dụng JPQL, truy vấn thông qua các Entity, Attribute name thay vì Table, Column name
	// createNativeQuery --> sử dụng native query
	
	// createNamedQuery  --> khai báo câu truy vấn và tên của câu truy vấn đó bên Entity
	//     dùng @NamedQuery hoặc @NamedNativeQuery
	
	// criteriaquery
	
	private static final String PARAM_ITEM_GROUP_NAME = "itemGroupName";
	
	private static final String SQL_PARAM_ITEM_GROUP_NAME = ":" + PARAM_ITEM_GROUP_NAME;
	
	private static final String Q_GET_ITEM_GROUP_BY_NAME = ""
			+ "SELECT *"
			+ "  FROM t04_item_group"
			+ " WHERE C04_ITEM_GROUP_NAME = " + SQL_PARAM_ITEM_GROUP_NAME;
	
	private static final String Q_STATISTIC_ITEMS_OF_EACH_GROUP = ""
			+ "SELECT t04.C04_ITEM_GROUP_ID " + ItemGroupDto.PROP_ID + ",\n"
			+ "       t04.C04_ITEM_GROUP_NAME " + ItemGroupDto.PROP_NAME + ",\n"
			+ "       COUNT(*) " + ItemGroupDto.PROP_AMOUNT_OF_ITEMS + "\n"
			+ "  FROM T01_ITEM t01\n"
			+ "  JOIN T04_ITEM_GROUP t04\n"
			+ "    ON t01.C01_ITEM_GROUP_ID = t04.C04_ITEM_GROUP_ID\n"
			+ "  GROUP BY t04.C04_ITEM_GROUP_ID";
	
	@Override
	public List<ItemGroup> getAll() {
		Session session = openSession();
		Query<ItemGroup> query = session.createNamedQuery(ItemGroup.Q_GET_ALL, getEntityClass());
		return query.getResultList();
	}
	
	@Override
	public ItemGroup get(int id) {
		return openSession().get(getEntityClass(), id);
	}
	
	// getSingleResult: throw NoResultException if result not found
	// uniqueResult   : return null if result not found
	
	@Override
	public ItemGroup get(String name) {
		return openSession().createNativeQuery(Q_GET_ITEM_GROUP_BY_NAME, getEntityClass())
					.setParameter(PARAM_ITEM_GROUP_NAME, name, StandardBasicTypes.STRING)
					.uniqueResult();
	}
	
	@SuppressWarnings({ "deprecation", "unchecked" })
	@Override
	public List<ItemGroupDto> statisticItemsOfEachGroup() {
		return openSession().createNativeQuery(Q_STATISTIC_ITEMS_OF_EACH_GROUP)
				.addScalar(ItemGroupDto.PROP_ID, StandardBasicTypes.INTEGER) // getter(alias)
				.addScalar(ItemGroupDto.PROP_NAME, StandardBasicTypes.STRING)
				.addScalar(ItemGroupDto.PROP_AMOUNT_OF_ITEMS, StandardBasicTypes.INTEGER)
				.setResultTransformer(Transformers.aliasToBean(ItemGroupDto.class)) // new object and setter
				.getResultList();
	}
	
	@Override
	Class<ItemGroup> getEntityClass() {
		return ItemGroup.class;
	}
	
<<<<<<< HEAD
}
=======
}
>>>>>>> 5c1e4eb (lesson18-jpahibernate-testing 02.07.2025)
