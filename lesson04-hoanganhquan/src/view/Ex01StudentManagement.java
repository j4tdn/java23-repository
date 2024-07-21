package view;

import java.util.Scanner;

import bean.Student;

public class Ex01StudentManagement {
	public static void main(String[] args) {
		Student sv1 = new Student(123200077, "Hoang Anh Quan", 9.0, 9.5);
	    Student sv2 = new Student(123456789, "Ho Tuan Phong", 9.0, 8.0);
	    Student sv3 = new Student();
	    
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter student ID for sv3: ");
	    sv3.setStudentId(scanner.nextInt());
	    scanner.nextLine();

	    System.out.print("Enter name for sv3: ");
	    sv3.setName(scanner.nextLine());

	    System.out.print("Enter theory score for sv3: ");
	    sv3.setTheoryScore(scanner.nextDouble());

	    System.out.print("Enter practice score for sv3: ");
	    sv3.setPracticeScore(scanner.nextDouble());

	    Student[] students = {sv1, sv2, sv3};

	    System.out.println("Students with average score greater than 8.5:");
	    for (Student student : students) {
	        if (student.calculateAverageScore() > 8.5) {
	            System.out.println(student);
	        }
	    }

	    System.out.println("Students with theory score greater than practice score:");
	    for (Student student : students) {
	        if (student.getTheoryScore() > student.getPracticeScore()) {
	            System.out.println(student);
	        }
	    }

	    scanner.close();
	}
}


