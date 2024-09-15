package view;

import java.util.Arrays;

import bean.Grade;
import bean.Student;

public class Ex01 {

	public static void main(String[] args) {
		Student[] student = { 
				new Student(102, "Nam", "C"), 
				new Student(103, "Bảo", "F"),
				new Student(104, "Hoàng", "D"),
				new Student(105, "Nguyên", "B"),
				new Student(107, "Vũ", "F"),
				new Student(109, "Lan", "A"),
				new Student(202, "Đạt", "C"),
				new Student(103, "Bảo", "F"),
				new Student(107, "Vũ", "C"),
				new Student(104, "Hoàng", "B") };
		System.out.println("Số học sinh phải học lại là" + printOutStudentsToLearnAgain(student));
	}

	private static void printStudents(Student... students) {
		for (Student student : students) {
			System.out.println(student);
		}
	}

	private static void printOutStudentsToLearnAgain(Student...students) {
		int count = 0;
		for(Student student : students) {
			if(student.getGrade()=="F");
			count++;
		}
		
	}
}

