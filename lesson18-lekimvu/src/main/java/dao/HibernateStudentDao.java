package dao;

import java.util.List;

import persistance.Student;

public class HibernateStudentDao extends GenericDao<Student> implements StudentDao{
	
	private static final String Q_GET_ALL = ""
			+ "SELECT * FROM t01_Student WHERE T01_Student_ID";
	
	
	
	
	@Override
	public List<Student> getAll() {
		return openSession().createNativeQuery(Q_GET_ALL, getEntityClass()).getResultList();

	}

	@Override
	Class<Student> getEntityClass() {
		// TODO Auto-generated method stub
		return Student.class;
	}
	
	

	
	
}
