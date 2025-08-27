package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import persistence.Student;

public class HibernateStudentDao extends GenericDao implements StudentDao{

	private static String Q_GET_ALL_BY_CLASS_ID = ""
				  		+ "SELECT * \n"
				  		+ "  FROM t02_Student\n"
				  		+ " WHERE C02_CLASS_ID = :classId\n";
	
	private static String Q_GET_GOOD_STUDENTS = ""
			+ "SELECT t01.C01_CLASS_NAME AS CLASS_NAME,\n"
			+ "	   t03.C03_SUBJECT AS SUBJECT,\n"
			+ " COUNT(DISTINCT T02.C02_STUDENT_ID) AS GOOD_STUDEMT_COUNT\n"
			+ "  FROM T03_RESULT t03\n"
			+ "  JOIN T02_STUDENT t02 ON t03.C03_STUDENT_ID = t02.C02_STUDENT_ID\n"
			+ "  JOIN T01_CLASS t01 ON t02.C02_CLASS_ID = t01.C01_CLASS_ID\n"
			+ " WHERE t03.C03_SUBJECT IN ('Math', 'Literature') AND t03.C03_SCORE >= 8\n"
			+ " GROUP BY t01.C01_CLASS_NAME, t03.C03_SUBJECT;";
	
	@Override
	public List<Student> getByClassId(int classId) {
		Session session = getCurrentSession();
        Transaction tx = session.beginTransaction();

        List<Student> students = getCurrentSession()
            .createQuery(Q_GET_ALL_BY_CLASS_ID, Student.class)
            .setParameter("classId", classId)
            .getResultList();

        tx.commit();
        return students;
	}

	@Override
	public List<Object[]> getExcellentStudentsWithClassInfo() {
		Session session = getCurrentSession();
        Transaction tx = session.beginTransaction();

        @SuppressWarnings("deprecation")
		List<Object[]> result = session
            .createQuery(Q_GET_GOOD_STUDENTS)
            .getResultList();

        tx.commit();
        return result;
	}

}
