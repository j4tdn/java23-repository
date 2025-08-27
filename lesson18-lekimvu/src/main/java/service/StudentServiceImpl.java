package service;

import java.util.List;

import dao.HibernateStudentDao;
import dao.StudentDao;

import persistance.Student;

public class StudentServiceImpl implements StudentService {
	
	private StudentDao StudentDao;
	
	public StudentServiceImpl() {
		StudentDao = new HibernateStudentDao();
	}
	
	
	@Override
	public List<Student> getAll() {
		return StudentDao.getAll();
	}

}
