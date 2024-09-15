package view;

import bean.Student;
import static bean.Score.*;

import java.util.Arrays;

import bean.Score;

public class Ex01Student {

	public static void main(String[] args) {
		Student[] students =
		{
		new Student(102, "Nam", C),
		new Student(103, "Bảo", F),
		new Student(104, "Hoàng", D),
		new Student(105, "Nguyên", B),
		new Student(107, "Vũ", F),
		new Student(109, "Lan", A),
		new Student(202, "Đạt", C),
		new Student(103, "Bảo", F),
		new Student(107, "Vũ", C),
		new Student(104, "Hoàng", B),
		new Student(107, "Vũ", F)
		};
		System.out.println("Danh sách học sinh được điểm A : " + Arrays.toString(getStudents(A, students)));
		System.out.println("Danh sách học sinh được học lại (nhiều hơn 1 lần) : " + Arrays.toString(getFailStudent(getStudents(F, students))));

	}
	private static Student[] getStudents(Score score, Student[] students) {
		Student[] result = new Student[students.length];
		int count = 0;
		for (Student student : students) {
			if (student.getScore() == score) {
				result[count++] = student;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	private static Student[] getFailStudent(Student[] failStudents) {
		int count = 0;
		Student[] result = new Student[failStudents.length];
		for (int i = 0; i < failStudents.length; i++) {
			for (int j = i+1; j < failStudents.length; j++) {
				if (failStudents[i].equals(failStudents[j])) {
					result[count++] = failStudents[i];
				}
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
}
//Student[] result = new Student[students.length];
//int count = 0;
//for (Student student : students) {
//	if (student.getScore() == F) {
//		for (Student failStudent : result) {
//			if ()
//		}
//		result[count++] = student;
//		
//	}
//}
//Student[] failStudent = 