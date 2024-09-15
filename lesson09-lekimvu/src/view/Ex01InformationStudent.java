package view;

import java.util.Arrays;

import bean.Student;

public class Ex01InformationStudent {

	public static void main(String[] args) {
		
     System.out.println("Students: "+Arrays.toString(getStudent()));		
     System.out.println("Students have grade A: " +Arrays.toString(getGradeA(getStudent())));
     System.out.println("Students have a retake classes: " +Arrays.toString(reTakeClass(getStudent())));
	}
	
	private static Student[] getStudent() {
       		return new Student[]  {
       				new Student(102, "Nam", "C"	),
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
	}
	
	private static Student[] getGradeA(Student[] students) {
        Student[] result = new Student[students.length];
        int count = 0;
		for(Student student:students) {
        	if("A".equals(student.getGrade())) {
        		result[count++] = student;
        	}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	private static Student[] reTakeClass(Student[] students) {
		Student[] result = new Student[students.length];
        int count = 0;
		for(Student student:students) {
        	if("F".equals(student.getGrade())) {
//        		if(getTime())
        		result[count++] = student;
        	}
		}
		return Arrays.copyOfRange(result, 0, count);
	}		

	private static boolean getTime(int time) {
		if(time > 1) {
			return true;
		}
		return false;
	}
	
}
