package service;

import java.util.List;

import dao.ClassDao;
import dao.HibernateClassDao;
import persistence.dto.ClassStudentCountDTO;


public class ClassServiceImpl implements ClassService{

private ClassDao classDao;
	
	public ClassServiceImpl() {
		classDao = new HibernateClassDao();
	}
	@Override
	public List<ClassStudentCountDTO> getClassNameAndStudentCount() {
		return classDao.getClassNameAndStudentCount();
	}

}
