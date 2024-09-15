package test01;

import bean.Student;
import bean.Student.Rank;

public class Ex01Demo {

	public static void main(String[] args) {
		Student[] students = {
				new Student(102, "Nam", Rank.F),
				new Student(103, "Tuấn", Rank.A),
		};
		
		System.out.println("Danh sách sinh viên xếp loại A:");
		findRankA(students);
		
		System.out.println("Danh sách sinh viên học lại:");
		findRankF(students);
	}
	
	private static void findRankA(Student[] students) {
		for (int i = 0; i < students.length; i++) {
			if (students[i].getRank() == Rank.A) {
				System.out.println(students[i]);
			}
		}
	}
	
	private static void findRankF(Student[] students) {
		for (int i = 0; i < students.length; i++) {
			if (students[i].getRank() == Rank.F) {
				System.out.println(students[i]);
			} 
		}
	}
	
}
