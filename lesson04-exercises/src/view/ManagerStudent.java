package view;

import java.util.Arrays;
import java.util.Scanner;

import bean.Student;

public class ManagerStudent {

	static Scanner sc = new Scanner(System.in);

	static void input(Student inf) {
		System.out.println("Input student code: ");
		inf.setStudentCode(Integer.parseInt(sc.nextLine()));
		System.out.println("Input name student: ");
		inf.setName(sc.nextLine());
		do {
			System.out.println("Input theo point: ");
			inf.setTheoPoint(Double.parseDouble(sc.nextLine()));
		} while (inf.getTheoPoint() < 0 && inf.getTheoPoint() > 10);
		do {
			System.out.println("Input practice point: ");
			inf.setPracPoint(Double.parseDouble(sc.nextLine()));
		} while (inf.getPracPoint() < 0 && inf.getPracPoint() > 10);

	}

	public static void main(String[] args) {
		Student student1 = new Student(001, "Le Kim Vu", 7d, 8d);
		Student student2 = new Student(002, "Tran Cong Hoang", 8d, 9d);
		Student student3 = new Student();
		input(student3);

		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);

		Student[] students = { student1, student2, student3 };

		generate("The student have higher point than 8.5 is", findHigheravgPoint85(students));
		generate("The student has theo point higher than practice point is: ", findHighTheoPoint(students));
	}

	private static Student[] findHigheravgPoint85(Student[] students) {
		Student[] result = new Student[students.length];
		int count = 0;
		for (Student student : students) {
			if (student.avgPoint() >= 8.5d) {
				result[count++] = student;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

	private static Student[] findHighTheoPoint(Student[] students) {
		Student[] result = new Student[students.length];
		int count = 0;
		for (Student student : students) {
			if (student.getTheoPoint() > student.getPracPoint()) {
				result[count++] = student;
			}
		}
		return Arrays.copyOfRange(result, 0, count);

	}

	private static void generate(String prefix, Student[] students) {
		System.out.println(prefix + " --> {");
		for (Student student : students) {
			System.out.println("   +" + student);
		}
		System.out.println("}\n");
	}
}
