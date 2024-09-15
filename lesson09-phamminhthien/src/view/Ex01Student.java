package view;

import java.util.Arrays;

import bean.Student;

public class Ex01Student {
	
	public static void main(String[] args) {
		Student[] students=
		{
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
		
		System.out.println("Danh sách sinh viên từng đoạt loại A là:");
		Student[] gradeAStudents = getStudentsWithGradeA(students);
		for(Student student:gradeAStudents) {
			System.out.println("-> " +student);
		}
		
		System.out.println("\nDanh sách sinh viên đã tham gia học lại: ");
		Student[] rankingStudents = getStudentsRetakingCourse(students);
		for(Student student:rankingStudents) {
			System.out.println("-> "+student);
		}
		
	}
	
	private static Student[] getStudentsWithGradeA(Student[] students) {
		int count = 0;
		for(Student student:students) {
			if(student.getGrade()=="A") {
				count++;
			}
		}
		
		Student[] result = new Student[count];
		int index = 0;
		for(Student student:students) {
			if(student.getGrade()=="A") {
				result[index++] = student;
			}
		}
		return result;
	}
	
	private static Student[] getStudentsRetakingCourse(Student[] students) {
		int count = 0;
		for(Student student:students) {
			if(student.getGrade()=="F") {
				count++;
			}
		}
		
		Student[] result = new Student[count];
		int index = 0;
		for(Student student:students) {
			if(student.getGrade()=="F") {
				result[index++] = student;
			}
		}
		return result;
	}
	
}
