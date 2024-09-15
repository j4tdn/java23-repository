package view;

import java.util.Arrays;

import bean.Rating;
import bean.Student;

public class Ex01 {

	public static void main(String[] args) {
		Student[] students = mockData();
		System.out.println(students);
		
		Student[] studentsRank = findStudents(students, Rating.A);
		System.out.println("students who have achieved grade A: " + Arrays.toString(studentsRank));
		
		
		System.out.println("====================");
	}
	
	private static Student[] mockData() {
		return new Student[] {
				new Student(102, "Nam", Rating.C),
				new Student(103, "Bảo", Rating.F),
				new Student(104, "Hoàng", Rating.D),
				new Student(105, "Nguyên", Rating.B),
				new Student(107, "Vũ", Rating.F),
				new Student(109, "Lan", Rating.A),
				new Student(202, "Đạt", Rating.C),
				new Student(103, "Bảo", Rating.F),
				new Student(107, "Vũ", Rating.C),
				new Student(104, "Hoàng", Rating.B)	
		};
	}
	
	private static Student[] findStudents(Student[] students, Rating rating) {
		Student[] result = new Student[students.length];
		
		int running = 0;
		
		for (Student student : students) {
			if (student.getRating() == rating) {
				result[running++] = student;
			}
		}
		return Arrays.copyOfRange(result, 0, running);
	}
	
}
