package dao;

import java.util.List;
import persistence.Student;

public class HibernateStudentDao extends GenericDao<Student> implements StudentDao {

 
    private static final String Q_GET_BY_CLASS_ID = ""
            + "";

    @Override
    public List<Student> get(int classId) {
        return openSession()
                .createNativeQuery(Q_GET_BY_CLASS_ID, getEntityClass())
                .setParameter("classId", classId)
                .getResultList();
    }

    @Override
    Class<Student> getEntityClass() {
        return Student.class;
    }
}
