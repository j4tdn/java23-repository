package view;

import java.util.Arrays;

import bean.Student;

public class Ex01StudentManagement {

	public static void main(String[] args) {
		
		Student[] students = {
				new Student(102, "Nam", "C"),
				new Student(103, "Bảo", "F"),
				new Student(104, "Hoàng", "D"),
				new Student(105, "Nguyên", "B"),
				new Student(107, "Vũ", "F"),
				new Student(109, "Lan", "A"),
				new Student(202, "Đạt", "C"),
				new Student(103, "Bảo", "F"),
				new Student(107, "Vũ", "C"),
				new Student(104, "Hoàng", "B")
		};
		
		printfToFormat("1. Danh sach sinh vien tung dat loai A: ", getStudentsWithRating(students));
		printfToFormat("2. Danh sach sinh vien da tham gia hoc lai: ", getStudentsLearnAgain(students));
	}
	
	private static Student[] getStudentsWithRating(Student[] students) {
		Student[] result = new Student[students.length];
		int count = 0;
		for(Student student: students)
			if(student.getRating() == "A")
				result[count++] = student;
		return Arrays.copyOfRange(result, 0, count);
	}
	
	private static Student[] getStudentsLearnAgain(Student[] students) {
		Student[] result = new Student[students.length];
		int count = 0;
		for(Student student: students)
			if(student.getRating() == "F")
				result[count++] = student;
		return Arrays.copyOfRange(result, 0, count);
	}
	
	private static void printfToFormat(String format, Student[] students) {
		System.out.println(format + "{");
		for(Student student: students)
			System.out.println(" " + student);
		System.out.println("}\n");
	}
	
}
