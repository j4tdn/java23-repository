package view;

import java.util.ArrayList;
import java.util.List;

enum HL { 
	A,B,C,D,E,F;
}

public class Ex01FindStudents {
	
	public static void main(String[] args) {
		
		Student[] students = {
		new Student(102, "Nam", HL.C),
		new Student(103, "Bảo", HL.F),
		new Student(104, "Hoàng", HL.D),
		new Student(105, "Nguyên", HL.B),
		new Student(107, "Vũ", HL.F),
		new Student(109, "Lan", HL.A),
		new Student(202, "Đạt", HL.C),
		new Student(103, "Bảo", HL.F),
		new Student(107, "Vũ", HL.C),
		new Student(104, "Hoàng", HL.B)
		
	};
	List <Student> studentsgetA = findStudentgetA (students);
	System.out.println("List students get A");
	for (Student student : studentsgetA) {
		System.out.println(student.getName() + " Id: " + student.getId());
	}
	List <Student> studentsReStudy = findStudentReStudy (students);
	System.out.println("List students restudy");
	for (Student student : studentsReStudy) {
		System.out.println(student.getName() + " Id: " + student.getId());
	}
	}
	
	public static List <Student> findStudentgetA(Student [] students) {
		List<Student> getA = new ArrayList<>();
		for (Student student : students) {
			if (student.getHL() == HL.A) {
				getA.add(student);
			}
		}
		return getA;
	}
	public static List <Student> findStudentReStudy(Student [] students) {
		List<Student> reStudy = new ArrayList<>();
		for (Student student : students) {
			if (student.getHL() == HL.F) {
				reStudy.add(student);
			}
		}
		return reStudy;
	}
}
