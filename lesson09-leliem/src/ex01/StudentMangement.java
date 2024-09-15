package ex01;

public class StudentMangement {

	public static void main(String[] args) {
		Student[] students = {
				new Student(102, "Nam", Grade.C),
				new Student(103, "Bảo", Grade.F),
				new Student(104, "Hoàng", Grade.D),
				new Student(105, "Nguyên", Grade.B),
				new Student(107, "Vũ", Grade.F),
				new Student(109, "Lan", Grade.A),
				new Student(202, "Đạt", Grade.C),
				new Student(103, "Bảo", Grade.F),
				new Student(107, "Vũ", Grade.C),
				new Student(104, "Hoàng", Grade.B)
		};
		
		Student[] studentWithGradeA = getstudents(students, Grade.A);
		System.out.println("List student with grade A in 2021: ");
		for(Student student: studentWithGradeA) {
			System.out.println(student);
		}
		
		Student[] studentRetake = getstudents(students, Grade.F);
		System.out.println("List student retake in 2024: ");
		for(Student student: studentRetake) {
			System.out.println(student);
		}
	}
	
	private static Student[] getstudents (Student[] students, Grade grade) {
		int count = 0;
		for (Student student : students) {
			if (student.getGrade() == grade) {
				count++;
			}
		}

													
		Student[] result = new Student[count];
		int index = 0;

		for (Student student : students) {
			if (student.getGrade() == grade) {
				result[index++] = student;
			}
		}

		return result;

	}
}
