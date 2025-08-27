package view;

import connection.DbConnection;
import service.StudentService;
import service.StudentServiceImpl;
import static utils.PrintUtils.*;

public class Ex01FindStudentsByClassId {
	
	private static StudentService studentService;
	
	static {
		studentService = new StudentServiceImpl();
	}
	
	public static void main(String[] args) {
		
		generate("1. Liệt kê học sinh theo mã lớp", studentService.getByClassId(1));
		
	}
	
}
