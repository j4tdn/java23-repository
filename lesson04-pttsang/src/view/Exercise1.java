package view;

import java.util.Scanner;

import bean.Student;

public class Exercise1 {
	
	private static Student[] SV;
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		Student sv1 = new Student("1", "Phạm Minh Thiện", 7.5f, 9f);
		Student sv2 = new Student("2", "Đoàn Văn Sinh", 9.0f, 8.5f);
		Student sv3 = new Student();
		sv3.input(ip);
		
		SV = new Student[]{sv1, sv2, sv3};
		findStudent(8.5f);
		find();
	}
	
	public static void findStudent(float point) {
		System.out.println("\nThông tin sinh viên có điểm trung bình lớn hơn "+ point +": ");
		for(Student student : SV) {
			if(student.calculateDTB()>point) {
				System.out.println(student);
			}
		}
		
	}
	
	public static void find() {
		System.out.println("\nThông tin sinh viên có điểm lý thuyết lớn hơn điểm thực hành: ");
		for(Student student : SV) {
			if(student.getTheoreticalPoints() > student.getPracticePoints()) {
				System.out.println(student);
			}
		}
		
	}
	
}
