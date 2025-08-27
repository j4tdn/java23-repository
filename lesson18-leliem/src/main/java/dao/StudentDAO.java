package dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import persistence.StudentEntity;
import connection.JpaUtil;

import java.util.List;

public class StudentDAO {

    public List<StudentEntity> getStudentsByClassId(int classId) {
        EntityManager em = JpaUtil.getEntityManager();
        TypedQuery<StudentEntity> query = em.createQuery(
            "SELECT s FROM Student s WHERE s.classEntity.id = :classId", StudentEntity.class);
        query.setParameter("classId", classId);
        return query.getResultList();
    }

    public List<Object[]> getStudentsWithHighScores() {
        EntityManager em = JpaUtil.getEntityManager();
        return em.createQuery(
            "SELECT s.classEntity.name, COUNT(s), s.name " +
            "FROM Student s JOIN s.results r " +
            "GROUP BY s.classEntity.name, s.name " +
            "HAVING SUM(CASE WHEN r.subject = 'Math' THEN r.score ELSE 0 END) >= 8 " +
            "AND SUM(CASE WHEN r.subject = 'Literature' THEN r.score ELSE 0 END) >= 8",
            Object[].class
        ).getResultList();
    }

    public List<Object[]> countStudentsPerClass() {
        EntityManager em = JpaUtil.getEntityManager();
        return em.createQuery(
            "SELECT s.classEntity.name, COUNT(s) FROM Student s GROUP BY s.classEntity.name",
            Object[].class
        ).getResultList();
    }

    public List<StudentEntity> findStudentsWithAvgAbove(double threshold) {
        EntityManager em = JpaUtil.getEntityManager();
        return em.createQuery(
            "SELECT s FROM Student s JOIN s.results r GROUP BY s HAVING AVG(r.score) >= :threshold",
            StudentEntity.class
        ).setParameter("threshold", threshold).getResultList();
    }

    public List<Object[]> findTopAvgStudentsInClass() {
        EntityManager em = JpaUtil.getEntityManager();
        return em.createQuery(
            "SELECT s.classEntity.name, s.name, AVG(r.score) FROM Student s JOIN s.results r " +
            "GROUP BY s.classEntity.name, s.id HAVING AVG(r.score) = (" +
            "SELECT MAX(AVG(r2.score)) FROM Student s2 JOIN s2.results r2 " +
            "WHERE s2.classEntity = s.classEntity GROUP BY s2.id)",
            Object[].class
        ).getResultList();
    }
}
