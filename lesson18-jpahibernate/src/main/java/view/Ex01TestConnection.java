package view;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import connection.DbConnection;

public class Ex01TestConnection {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = DbConnection.getSessionFactory();
		System.out.println("sessionFactory: " + sessionFactory);
		
		Session s1 = sessionFactory.openSession();
		Session s2 = sessionFactory.openSession();
		
		System.out.println("open session s1: " + s1);
		System.out.println("open session s2: " + s2);
		
		Session s3 = sessionFactory.getCurrentSession();
		Session s4 = sessionFactory.getCurrentSession();
		
		System.out.println("open session s3: " + s3);
		System.out.println("open session s4: " + s4);
		
	}
	
<<<<<<< HEAD
}
=======
}
>>>>>>> 5c1e4eb (lesson18-jpahibernate-testing 02.07.2025)
