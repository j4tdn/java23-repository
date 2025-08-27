package view;

import static utils.PrintUtils.generate;

import service.StudentService;
import service.StudentServiceImpl;

public class Answer {
	
	private static StudentService studentService;
	static {
		studentService = new StudentServiceImpl();
	}
	
	public static void main(String[] args) {
		
		generate(
				"1. List all student by class id", 
				studentService.getByClassId());
	}

}
