package view;

import java.util.Scanner;

import bean.Student;

public abstract class Ex01Student {
	
	public static void main(String[] args) {
		Student s1 = new Student(16, "Duong Van Tai", 6.4, 7.5);
		Student s2 = new Student(15, "Le Van Tuan", 6.0, 7.1);
		Student s3 = new Student();
		Scanner s = new Scanner(System.in);
		System.out.println(" id sv3: ");
		s3.setId(s.nextInt());
		s.nextLine();
		System.out.println(" name sv3: ");
		s3.setName(s.nextLine());
		System.out.println(" theoretical_point sv3: ");
		s3.setTheoretical_point(s.nextDouble());
		System.out.println(" practice_points sv3: ");
		s3.setPractice_points(s.nextDouble());
		
		Student[] student = {s1,s2,s3};
		
		for(Student mang : student) {
			if(mang.Medium_score() > 8.5) {
				System.out.println(mang);
			}
		}
		for(Student mang : student) {
			if(mang.getTheoretical_point() > mang.getPractice_points()) {
				System.out.println(mang);
			}
		}
		
	}

}
