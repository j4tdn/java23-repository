package view;

import java.util.*;
import java.util.stream.Collectors;

import bean.Student;

public class Ex01Student {
	
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

        // Tìm sinh viên đạt loại A
        Student[] gradeAStudents = getStudentsWithGradeA(students);
        System.out.println("Danh sách sinh viên đạt loại A:");
        for (Student student : gradeAStudents) {
            System.out.println(student);
        }

        // Tìm sinh viên học lại môn
        Student[] repeatStudents = getRepeatStudents(students);
        System.out.println("\nDanh sách sinh viên đã học lại môn cấu trúc dữ liệu:");
        for (Student student : repeatStudents) {
            System.out.println(student);
        }
        
    }

	// Tìm danh sách sinh viên từng đạt loại A
	public static Student[] getStudentsWithGradeA(Student[] students) {
		List<Student> gradeAStudents = Arrays.stream(students)
				.filter(student -> student.getGrade() == 'A')
				.collect(Collectors.toList());

		return gradeAStudents.toArray(new Student[0]);
	}

    // Tìm danh sách sinh viên đã tham gia học lại (học nhiều hơn 1 lần)
    public static Student[] getRepeatStudents(Student[] students) {
        List<Student> repeatStudents = Arrays.stream(students)
            .collect(Collectors.groupingBy(Student::getId))
            .entrySet().stream()
            .filter(entry -> entry.getValue().size() > 1)
            .flatMap(entry -> entry.getValue().stream())
            .collect(Collectors.toList());

        return repeatStudents.toArray(new Student[0]);
    }

}
