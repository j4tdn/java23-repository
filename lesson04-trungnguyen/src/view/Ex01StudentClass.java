package view;

import java.util.Scanner;

import bean.Student;

public class Ex01StudentClass {
	public static void main(String[] args) {
		Student sv1 = new Student(1, "Nguyen Van A", 8.5, 8.6);
		Student sv2 = new Student(2, "Tran Van B", 5.6, 5.0);
		Student sv3 = new Student();
		sv3 = inputStudent();
		System.out.println(sv3.averageScoreCalculate());
		Student[] students = {sv1, sv2, sv3};
		Student[] filteredStudent = studentScoreFilter(students, 8.5);
		System.out.println("Danh sách sinh viên có điểm trung bình lớn hơn 8.5 : \n");
		for (Student student : filteredStudent) {
			System.out.println(student);
		}
		System.out.println("=======================\n");
		Student[] filteredStudentByTheoryScore = studentScoreFilter(students);
		System.out.println("Danh sách học sinh có điểm lý thuyết cao hơn điểm thực hành: \n");
		for (Student student : filteredStudentByTheoryScore) {
			System.out.println(student);
		}

		
	}
	public static Student inputStudent() {
		Student sv = new Student();

		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập mã sinh viên: \n");
		sv.setId(Integer.valueOf(ip.nextLine()));
		System.out.println("Nhập tên sinh viên: \n");
		sv.setName(ip.nextLine().trim());
		System.out.println("Nhập điểm lý thuyết: \n");
		sv.setTheoryScore(Double.valueOf(ip.nextLine()));
		System.out.println("Nhập điểm thực hành: \n");
		sv.setPracticeScore(Double.valueOf(ip.nextLine()));
		return sv;
	}
	public static Student[] studentScoreFilter(Student[] students, Double score) {
		int count = 0;
		for (Student student: students) {
			if(student.averageScoreCalculate() > score) {
				count++;
			}
		}
		Student[] filteredStudents  = new Student[count];
		int index = 0;
		for (Student student : students) {
			if (student.averageScoreCalculate() > score) {
				filteredStudents[index] = student;
				index++;
			}
		}
		return filteredStudents;
		
	}
	public static Student[] studentScoreFilter(Student[] students) {
		int count = 0;
		for (Student student: students) {
			if(student.getTheoryScore() > student.getPracticeScore()) {
				count++;
			}
		}
		Student[] filteredStudents  = new Student[count];
		int index = 0;
		for (Student student : students) {
			if (student.getTheoryScore() > student.getPracticeScore()) {
				filteredStudents[index] = student;
				index++;
			}
		}
		return filteredStudents;
		
	}
	
}
