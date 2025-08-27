package view;

import service.StudentService;
import service.StudentServiceImpl;
import static utils.PrintUtils.generate;

public class Ex02StudentView {

	private static StudentService studentService;
	
	static {
		studentService = new StudentServiceImpl();
	}
	
	public static void main(String[] args) {
		System.out.println("==== Bắt đầu chương trình ====\n");
		
		final var students = studentService.getAll();
		
		generate("1. Liệt kê tất cả các mặt hàng", students);
	
}
}
