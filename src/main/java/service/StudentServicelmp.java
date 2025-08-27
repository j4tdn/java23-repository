package service;

import java.util.List;

import dao.jdbcStudentDao;
import dao.studentDao;
import persistence.student;

public class StudentServicelmp implements studentDao {
	
		private studentDao studentDao;
		public  StudentServicelmp(){
			studentDao = new jdbcStudentDao();
		}
	@Override
	public List<student> getAll() {
		
		return studentDao.getAll();
	}

}
