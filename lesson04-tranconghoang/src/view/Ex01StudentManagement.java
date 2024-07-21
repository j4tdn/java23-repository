package view;

import java.util.Arrays;
import java.util.Scanner;

import bean.Student;

public class Ex01StudentManagement {

	public static void main(String[] args) {
		Student s1 = new Student(19, "Trần Công Hoàng", 7.2d, 6.8d);
		Student s2 = new Student(20, "Lê Kim Vũ", 9.4d, 5.9d);
		Student s3 = new Student();
		
		input(s3);
		
		System.out.println("\n-----------------Thông tin sinh viên-----------------\n");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		Student[] students = {s1, s2, s3};
		
		System.out.println();
		generate("\n----Tìm thông tin sinh viên có điểm trung bình lớn hơn 8.5----\n", findStudentsByAvg(students));
		generate("\n----Tìm thông tin sinh viên có điểm lý thuyết lớn hơn thực hành----\n",findStudentsByTheoPoint(students));
		
	}
	private static void input(Student students) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập thông tin sinh viên 3:");
		System.out.print("Nhập mã sinh viên: ");
		students.setId(Integer.parseInt(ip.nextLine()));
		System.out.print("Nhập họ tên sinh viên: ");
		students.setName(ip.nextLine());
		System.out.print("Nhập điểm lý thuyết: ");
		students.setTheoPoint(ip.nextDouble());
		System.out.print("Nhập điểm thực hành: ");
		students.setPracPoint(ip.nextDouble());	
	}
	
	private static Student[] findStudentsByAvg(Student[] students) {
		Student[] result = new Student[students.length];
		int count = 0;
		for(Student student: students)
			if(student.avgPoint() > 8.5)
				result[count++] = student;
		return Arrays.copyOfRange(result, 0, count);
	}
	private static void generate(String prefix, Student[] students) {
		System.out.println(prefix + "\n{");
		for(Student student: students)
			System.out.println("  + " + student);
		System.out.println("}\n");
	}
	private static Student[] findStudentsByTheoPoint(Student[] students) {
		Student[] result = new Student[students.length];
		int count = 0;
		for(Student student: students)
			if(student.getTheoPoint() > student.getPracPoint())
				result[count++] = student;
		return Arrays.copyOfRange(result, 0, count);
	}
}
