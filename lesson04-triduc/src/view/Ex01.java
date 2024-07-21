package view;

import java.util.Arrays;
import java.util.Scanner;
import bean.*;

public class Ex01 {
	public static void main(String[] args) {
		Student student1 = new Student(205053121,"Nguyen Tri Duc", 5d,5d);
		Student student2 = new Student(23231233,"Nguyen Ban Than", 10d,10d);
		Student student3 = new Student();
		student3 = inputInformation();
		
		Student[] students = {student1, student2, student3};
		
		for(Student s : students) {
			System.out.println(s.toString());
		}
		
		System.out.println("List students with higher 8,5 avg scores: ");
		for(Student s : findStudentsWithHighPoint(students)) {
			System.out.println(s.toString());
		}
		
		System.out.println("List students with theoratical point higher than practical one:  ");
		for(Student s : findStudentsWithTheoraticalPointHigher(students)) {
			System.out.println(s.toString());
		}
	}
	
	public static Student inputInformation() {
		Scanner sc = new Scanner(System.in);
		Integer id = IoUtils.inputInteger("Id student");
		System.out.print("Enter name: ");
		String name = sc.nextLine();
		Double p1 = IoUtils.inputDouble("theoretical point", 0, 10);
		Double p2 = IoUtils.inputDouble("practical point", 0, 10);
		
		Student sv = new Student();
		sv.setId(id);
		sv.setName(name);
		sv.setTheoreticalPoint(p1);
		sv.setPracticalPoint(p2);
		
		return sv;
	}
	
	public static Student[] findStudentsWithHighPoint(Student[] students) {
		Student[] result = new Student[students.length];
		int count = 0;
		for(Student s : students) {
			if(s.getAvgPoint() > 8.5d) {
				result[count++] = s;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	public static Student[] findStudentsWithTheoraticalPointHigher(Student[] students) {
		Student[] result = new Student[students.length];
		int count = 0;
		for(Student s : students) {
			if(s.getTheoreticalPoint() > s.getPracticalPoint()) {
				result[count++] = s;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
}
