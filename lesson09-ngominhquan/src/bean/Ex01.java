package bean;

import java.util.ArrayList;
import java.util.List;

import src.Student;

public class Ex01 {
	
	public static void main(String[] args) {
		
		List <Student> students = getStudents();
		List <Student> gradeAStudents = findStudentsWithGradeAIn2021(students);	
		System.out.println("Sinh viên đoạt loại A năm 2021: " );
			for (Student s: gradeAStudents) {
				System.out.println(s.getName());
			}
		
		List <Student> RepeatedStudents = findStudentsRetakingTheCourse(students);
		System.out.println("Sinh viên học lại nhiều hơn 1 lần trong năm 2024: ");
			for (Student s: RepeatedStudents) {
				System.out.println(s.getName());
			}
	}

}
