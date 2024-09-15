package test01;

import bean.Student;
import bean.Student.Rank;

public class Ex01 {

	public static void main(String[] args) {
		
		Student[] students = {
				new Student(102, "Nam", Rank.C),
				new Student(103, "Bảo", Rank.F),
				new Student(104, "Hoàng", Rank.D),
				new Student(105, "Nguyên", Rank.B),
				new Student(107, "Vũ", Rank.F),
				new Student(109, "Lan", Rank.A),
				new Student(202, "Đạt", Rank.C),
				new Student(103, "Bảo", Rank.F),
				new Student(107, "Vũ", Rank.C),
				new Student(104, "Hoàng", Rank.B)
		};
		
		findRankA(students);
		findStudentRelearn(students);
		
	}
	
	private static void findRankA(Student[] students) {
		for (int i = 0; i < students.length; i++) {
			if (students[i].getRank() == Rank.A) {
				System.out.println("Danh sách sinh viên đạt loại A:\n" + students[i]);
			}
		}
	}
	
	private static void findStudentRelearn(Student[] students) {
		System.out.println("\nDanh sách sinh viên học lại:");
		for (int i = 0; i < students.length; i++) {
			if (students[i].getRank() == Rank.F) {
				System.out.println(students[i]);
			}
		}
	}
	
}
