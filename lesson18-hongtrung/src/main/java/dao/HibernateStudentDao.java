package dao;

import java.util.List;

import persistence.Student;

public class HibernateStudentDao extends GenericDao<Student> implements StudentDao{

    private static final String PARAM_CLASS_ID   = "classId";

    private static final String SQL_PARAM_CLASS_ID   = ":" + PARAM_CLASS_ID;

	private static final String Q_GET_BY_CLASS_ID = ""
            + "SELECT * "
            + "  FROM T02_STUDENT "
            + " WHERE C02_CLASS_ID = " + SQL_PARAM_CLASS_ID;
	@Override
	public List<Student> getByClassId(int classId) {
		return openSession().createNativeQuery(Q_GET_BY_CLASS_ID, getEntityClass())
                .setParameter(PARAM_CLASS_ID, classId)
                .getResultList();
	}

	@Override
	Class<Student> getEntityClass() {
		return Student.class;
	}

}
