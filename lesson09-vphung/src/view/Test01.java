package view;

import bean.Student;

public class Test01 {

	public static void main(String[] args) {
		
		Student[] students = {
				new Student(102, "Nam", 'C'),
				new Student(103, "Bảo", 'F'),
				new Student(104, "Hoàng", 'D'),
				new Student(105, "Nguyên", 'B'),
				new Student(107, "Vũ", 'F'),
				new Student(109, "Lan", 'A'),
				new Student(202, "Đạt", 'C'),
				new Student(103, "Bảo", 'F'),
				new Student(107, "Vũ", 'C'),
				new Student(104, "Hoàng", 'B')
		};
		
		System.out.println("Danh sách sinh viên từng đạt loại A:");
		findRankA(students);
		
		System.out.println("\n===========================================\n");
		
		System.out.println("Danh sách sinh viên đã tham gia học lại môn cấu trúc dữ liệu năm 2024:");
		findStudentsRelearn(students);
	}
	
	private static void findRankA(Student[] students) {
		for (int i = 0; i < students.length; i++) {
			if (students[i].getRank() == 'A') {
				System.out.println(students[i]);
			}
		}
	}
	
	private static void findStudentsRelearn(Student[] students) {
		for (int i = 0; i < students.length; i++) {
			if (students[i].getRank() == 'F') {
				System.out.println(students[i]);
			}
		}
	}
	
}
