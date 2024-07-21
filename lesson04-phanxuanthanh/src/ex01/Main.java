package ex01;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Student s1 = new Student(102210220, "Nghia", 7.8f, 5.8f);
		Student s2 = new Student(102210255, "Hai", 7.5f, 6f);
		Student s3 = new Student();
		enterStudent(s3);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println("================");
		
		Student [] students = {s1, s2, s3};
		
		System.out.println("Students with an average score less than 8.5");
		findAverage(students);
		
		System.out.println("Students with TheoreticalPoint > PracticePoint:");
		findSv(students);
	}
	
	static void enterStudent(Student s) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student:");
		int id = Integer.parseInt(sc.nextLine());
		s.setId(id);
		
		System.out.println("Enter Name:");
		String name = sc.nextLine();
		s.setName(name);
		
		System.out.println("Enter theoreticalPoint:");
		float theoreticalPoint = Float.parseFloat(sc.nextLine());
		s.setPracticePoint(theoreticalPoint);
		
		System.out.println("Enter practicePoint:");
		float practicePoint = Float.parseFloat(sc.nextLine());
		s.setTheoreticalPoint(practicePoint);
		
		sc.close();
	}
	
	static void findAverage(Student[] students) {
		boolean find = false;
		for (Student student : students) {
			if (student.getAverage() > 8.5) {
				System.out.println("\t" + student);
				find = true;
			}
		}
		if (!find) {
			System.out.println("There are no students with an average score less than 8.5:");
		}
	}
	
	static void findSv(Student[] students) {
		boolean find = false;
		for (Student student : students) {
			if (student.getTheoreticalPoint() > student.getPracticePoint()) {
				System.out.println("\t" + student);
				find = true;
			}
		}
		if (!find) {
			System.out.println("There are no students with TheoreticalPoint > PracticePoint");
		}
	}
}
