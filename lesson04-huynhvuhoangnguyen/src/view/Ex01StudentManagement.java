package view;

import bean.Student;

public class Ex01StudentManagement {

	public static void main(String[] args) {
		Student student1 = new Student(1, "Huynh Vu Hoang Nguyen", 7.5, 8.0);
		Student student2 = new Student(2, "Truong Duc Phi Hung", 6.9, 9.25);
		Student student3 = new Student();
		System.out.println("Enter student's infomation: ");
		student3.inputInfomation();
		
		Student[] students = {student1, student2, student3};
		System.out.println("Student with avarage point greater than 8.5 is: ");
		studentWithHighAvarage(students);
		
		System.out.println("Student with theoretical point higher than practice point: ");
		studentWithHigherTPoint(students);
		
	}
	
	public static void studentWithHighAvarage(Student[] students) {
		boolean found = false;
		for(Student student: students) {
			if(student.avgPoint() > 8.5) {
				System.out.println(student.getStudentName());
				found = true;
			} 
		}
		if(!found) {
			System.out.println("There are no student with avarage point greater than 8.5.");
		}
	}
	
	public static void studentWithHigherTPoint(Student[] students) {
		boolean found = false;
		for(Student student: students) {
			if(student.getTheoreticalPoint() > student.getPracticePoint()) {
				System.out.println(student.getStudentName());
				found = true;
			}
		}
		if(!found) {
			System.out.println("There are no student with theoretical point greater than practicle point.");
		}
	}
	
}
