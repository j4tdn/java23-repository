package ex01;

import java.util.Scanner;

public class ZEx01ManagerStudent {

	public static void main(String[] args) {
		 Student student1 = new Student(1, "Le Van Liem", 9.0, 8.5);
	        Student student2 = new Student(2, "Le Van Duc", 8.0, 7.5);
	        Student student3 = new Student();
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter student ID for student3:");
	        student3.setStudentID(sc.nextInt());
	        sc.nextLine();  // Consume newline

	        System.out.println("Enter full name for student3:");
	        student3.setFullName(sc.nextLine());

	        System.out.println("Enter theory score for student3:");
	        student3.setTheoryScore(sc.nextDouble());

	        System.out.println("Enter practice score for student3:");
	        student3.setPracticeScore(sc.nextDouble());

	
	        Student[] studentList = {student1, student2, student3};
	        
	        findStudentsWithHighAverageScore(studentList);

	        findStudentsWithHigherTheoryScore(studentList);
	    }

	    public static void findStudentsWithHighAverageScore(Student[] students) {
	        System.out.println("Students with average score greater than 8.5:");
	        for (Student student : students) {
	            if (student.calculateAverageScore() > 8.5) {
	                System.out.println(student);
	            }
	        }
	    }

	    public static void findStudentsWithHigherTheoryScore(Student[] students) {
	        System.out.println("Students with theory score greater than practice score:");
	        for (Student student : students) {
	            if (student.getTheoryScore() > student.getPracticeScore()) {
	                System.out.println(student);
	            }
	        }
	}
}
