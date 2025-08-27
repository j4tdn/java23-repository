package view;

import static utils.PrintUtils.generate;

import service.ClassService;
import service.ClassServiceImpl;
import service.StudentService;
import service.StudentServiceImpl;

public class Ex02ListClassNameAndNumberOfStudents {

private static ClassService classService;
	
	static {
		classService = new ClassServiceImpl();
	}
	
	public static void main(String[] args) {
		
		generate("1. Liệt kê lớp và số lượng học sinh", classService.getClassNameAndStudentCount());
		
	}
}
