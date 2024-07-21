package view;

import java.util.Scanner;
import bean.Student;

public class st1 {

	public static void main(String[] args) {
		Student sv1 = new Student(834543543,"truong quang anh ",7,7);
		Student sv2 = new Student(345438345,"huỳnh trọng tuấn ",7,7);
		Student sv3 = new Student();
		
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter student code : ");
	    sv3.setId(sc.nextInt());
	    sc.nextLine();
	    System.out.print("Enter student name : ");
	    sv3.setname(sc.nextLine());

	    System.out.print("Enter student theory score : ");
	    sv3.setTheoreticalPoints(sc.nextFloat());

	    System.out.print("Enter student practice score : ");
	    sv3.setPracticePoints(sc.nextFloat());

	    Student[] students = {sv1, sv2, sv3};

	    System.out.println("Students with average scores greater than 8.5:");
	    for (Student student : students) {
	        if (student.mediumScore() > 8.5) {
	            System.out.println(student);
	        }
	    }

	    System.out.println("Students have higher theoretical scores than practical scores:");
	    for (Student student : students) {
	        if (student.getTheoreticalPoints() > student.getPracticePoints()) {
	            System.out.println(student);
	        }
	    }

     

 
        
    }
	
}
