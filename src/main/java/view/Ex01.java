package view;

import java.util.List;

import dao.jdbcStudentDao;
import persistence.student;
import service.StudentService;

public class Ex01 {
	private static StudentService service;
	
	static {
		service = (StudentService) new jdbcStudentDao();
			

	}
	public static void main(String[] args) {
		System.out.println("1.liet ke tat ca hoc sinh " + service.getAll()  );
	}
}
