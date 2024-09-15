package exam;

import java.util.ArrayList;
import java.util.List;

public class Ex01 {

	class Student {
	    int id;
	    String name;
	    String grade;

	    public Student(int id, String name, String grade) {
	        this.id = id;
	        this.name = name;
	        this.grade = grade;
	    }

	    @Override
	    public String toString() {
	        return "Mã SV: " + id + ", Tên: " + name + ", Xếp loại: " + grade;
	    }
	}
	public static void main(String[] args) {
		 Student[] students = 
//			 {
//					 new Student(102, "Nam", C),
//					 new Student(103, "Bảo", F),
//					 new Student(104, "Hoàng", D),
//					 new Student(105, "Nguyên", B),
//					 new Student(107, "Vũ", F),
//					 new Student(109, "Lan", A),
//					 new Student(202, "Đạt", C),
//					 new Student(103, "Bảo", F),
//					 new Student(107, "Vũ", C),
//					 new Student(104, "Hoàng", B)
//					 
//            };
		            
			List<Student> aGradeStudents = getStudentsWithGrade(students, "A");
			System.out.println("Danh sách sinh viên đạt loại A trong năm 2021");
			for (Student s : aGradeStudents) {
				System.out.println(s);
			}
			List<Student> retakingStudents = getStudentsWithGrade(students, "F");
			System.out.println("Danh sách sinh viên phải học lại(học nhiều hơn 1 lần môn cấu trúc dữ liệu trong năm 2024)");
			for (Student s : retakingStudents) {
				System.out.println(s);
			}
		}

		public static List<Student> getStudentsWithGrade(Student[] students, String grade) {
			List<Student> result = new ArrayList<>();
			for (Student student : students) {
				if (student.grade.equals(grade)) {
					result.add(student);
				}
			}
			return result;
		}
	}