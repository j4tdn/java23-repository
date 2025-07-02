package dao;

import java.util.function.Consumer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import connection.DbConnection;

abstract class GenericDao<T> {
	
	private SessionFactory sessionFactory;
	
	GenericDao() {
		sessionFactory = DbConnection.getSessionFactory();
	}
	
	void execute(Consumer<Session> worker) {
		Session session = openSession();
		Transaction transaction = session.beginTransaction();
		try {
			worker.accept(session);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
	}
	
	Session openSession() {
		return sessionFactory.openSession();
	}
	
	Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	abstract Class<T> getEntityClass();
<<<<<<< HEAD
}
=======
}
>>>>>>> 5c1e4eb (lesson18-jpahibernate-testing 02.07.2025)
