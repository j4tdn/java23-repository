package view;

import java.util.Arrays;

import bean.Student;

 
public class Ex01Stundent {

	public static void main(String[] args) {
		Student [] student = {
				new Student(102,"Nam,", 'D'),
				new Student(103,"Bảo,", 'F'), 
				new Student(104,"Hoàng,", 'D'), 
				new Student(105,"Nguyên,", 'B'), 
				new Student(107,"Vũ,", 'F'), 
				new Student(109,"Lan,", 'A'), 
				new Student(202,"Đạt,", 'C'), 
				new Student(103,"Bảo,", 'F'), 
				new Student(107,"Vũ,", 'C'), 
				new Student(104,"Hoàng,", 'B'), 
				};
		 System.out.println("List student rating A in 2024" + Arrays.toString(getRatingA(student)));
	}
	private static Student[] getRatingA(Student[] students ) {	
		int count = 0;
		for(Student student :students ) {
			if(student.getRating() == 'A') {
				count ++;
			}	
		}
		Student [] result = new Student[count];
		int index = 0;
		for(Student student :students ) {
			if(student.getRating() == 'A') {
				result[index++] = student;
			}
		}
		return result;
	}
	
}


