package dao;

import java.util.List;

import persistence.Student;
import persistence.dto.ClassStudentCountDTO;

public class HibernateClassDao extends GenericDao<Class> implements ClassDao{

	private static final String Q_GET_CLASS_STUDENT_COUNT = "";
			

	
	@Override
	public List<ClassStudentCountDTO> getClassNameAndStudentCount() {
	    return openSession()
	            .createQuery(Q_GET_CLASS_STUDENT_COUNT, ClassStudentCountDTO.class)
	            .getResultList();
	}

	@Override
	Class<Class> getEntityClass() {
		return Class.class;
	}

}
