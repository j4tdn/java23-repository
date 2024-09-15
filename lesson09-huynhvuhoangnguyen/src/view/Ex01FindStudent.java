package view;

import java.util.Arrays;

import bean.Student;

public class Ex01FindStudent {

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
		
		System.out.println("Students got 'A' grade in 2021: ");
		Student[] aGradeStudents = findStudentByGrade(students, 'A');
		System.out.println(Arrays.toString(aGradeStudents));
		
		System.out.println("\nStudent resturdy the course more than once in 2024: ");
		Student[] resturdyStudents = findRestudyStudent(students);
		System.out.println(Arrays.toString(resturdyStudents));
		
	}
	
	private static Student[] findStudentByGrade(Student[] students, char grade) {
		int count = 0;
		for(Student student : students) {
			if(student.getGrade() == grade) {
				count++;
			}
		}
		
		Student[] result = new Student[count];
		int index = 0;
		for(Student student : students) {
			if(student.getGrade() == grade) {
				result[index++] = student;
			}
		}
		return result;
	}
	
	private static Student[] findRestudyStudent(Student[] students) {
		int[] idCounts = new int[students.length];
		int resturdyCount = 0;
		
		for(int i = 0; i < students.length; i++) {
			int id = students[i].getId();
			if(students[i].getGrade() == 'F') {
				for(int j = 0; j < students.length; j++) {
					if(students[i].getId() == id) {
						idCounts[i]++;
					}
				}
			}
		}
		
		for(int i = 0; i < students.length; i++) {
			if(idCounts[i] > 1 && students[i].getGrade() == 'F') {
				resturdyCount++;
			}
		}
		
		Student[] resturdyStudents = new Student[resturdyCount];
		int index = 0;
		for(int i = 0; i < students.length; i++) {
			int id = students[i].getId();
			if(idCounts[i] > 1 && students[i].getGrade() == 'F') {
				boolean added = false;
				for(int j = 0; j < students.length; j++) {
					if(resturdyStudents[j].getId() == id) {
						added = true;
						break;
					}
				}
				
				if(!added) {
					resturdyStudents[index++] = students[i];
				}
			}
		}
		
		return resturdyStudents;
		
	}
	
}
