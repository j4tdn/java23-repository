package dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

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
	
	private static final String PARAM_ITEM_GROUP_ID = "itemGroupId";
	private static final String PARAM_ITEM_GROUP_NAME = "itemGroupName";
	
	private static final String SQL_PARAM_ITEM_GROUP_ID = ":" + PARAM_ITEM_GROUP_ID;
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
	
	private static final String Q_DELETE_ITEM_GROUP_BY_ID = ""
			+ "DELETE FROM T04_ITEM_GROUP WHERE C04_ITEM_GROUP_ID = " + SQL_PARAM_ITEM_GROUP_ID;
	
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
	
	// Hibernate - Session        - save/update/delete/saveOrUpdate
	// JPA       - EntityManager  - persist/merge/remove
	
	@Override
	public void save(ItemGroup group) {
		execute(session -> session.persist(group)); 
	}

	@Override
	public void update(ItemGroup group) {
		execute(session -> session.merge(group)); // saveOrUpdate
	}

	@Override
	public void delete(int groupId) {
		execute(session -> 
			session.createNativeQuery(Q_DELETE_ITEM_GROUP_BY_ID)
				.setParameter(PARAM_ITEM_GROUP_ID, groupId)
				.executeUpdate()
		);
	}

	@Override
	public void delete(Set<Integer> groupIds) {
		var sql = "DELETE FROM T04_ITEM_GROUP WHERE C04_ITEM_GROUP_ID = ?";
		execute(session -> {
			session.doWork(connection -> {
				var batchCount = 0;
				try(var pst = connection.prepareStatement(sql)) {
					for (var groupId: groupIds) {
						pst.setInt(1, groupId);
						pst.addBatch();
						if (++batchCount % 1000 == 0) {
							pst.executeBatch();
						}
					}
					pst.executeBatch();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			});
		});
	}
	
	@Override
	public void testHibernateCache() {
		Session session1 = openSession();
		Session session2 = openSession();
		
		var group1 = session1.get(getEntityClass(), 8); // from database
		System.out.println("group1: " + group1);
		
		System.out.println("\n");
		
		var group2 = session1.get(getEntityClass(), 18); // from database
		System.out.println("group2: " + group2);
		
		System.out.println("\n");
		
		var group3 = session1.get(getEntityClass(), 8); // from cache of session1(1st)
		System.out.println("group3: " + group3);
		
		
		try {
			TimeUnit.SECONDS.sleep(4);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n");
		
		var group4 = session2.get(getEntityClass(), 18); // from cache of session1 (2nd)
		System.out.println("group4: " + group4);
	}

	@Override
	Class<ItemGroup> getEntityClass() {
		return ItemGroup.class;
	}
	
}
