package view;

import java.util.Arrays;

import entity.Student;

public class Ex01 {

	public static void main(String[] args) {
		Student[] students = initData();
		System.out.println("List student with A mark: ");
		print(findStudentsWithRankA(students));
		
		System.out.println("List student relearn: ");
		print(findStudentsRelearn(students));
	}

	private static void print(Student[] students) {
		for (Student student : students) {
			System.out.println(student.toString());
		}
	}

	private static Student[] initData() {
		Student[] students = 
		{
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
		
		return students;
	}
	
	private static Student[] findStudentsWithRankA(Student[] students) {
		Student[] rs = new Student[students.length];
		int count = 0;
		for (Student student : students) {
			if(student.getRank() == 'A') {
				rs[count++] = student;
			}
		}
		return Arrays.copyOfRange(rs, 0, count);
	}

	private static Student[] findStudentsRelearn(Student[] students) {
		Student[] rs = new Student[students.length];
		int countId = 0;
		int countStudent = 0;
		Integer[] idStudent = new Integer[students.length];
		for (Student student : students) {
			for (Integer i : idStudent) {
				if (i == student.getId()) {
					rs[countStudent++] = student;
					break;
				}
			}
			idStudent[countId++] = student.getId();
		}
		return Arrays.copyOfRange(rs, 0, countStudent);
	}
}


