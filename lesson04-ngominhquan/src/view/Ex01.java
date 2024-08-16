package view;

import java.util.Arrays;

import bean.Student; 

public class Ex01 {
	
	public static void main(String[] args) {
		Student s1 = new Student(1, "Ngo Minh Quan", 10f, 10f);
		Student s2 = new Student(2, "Ngo Minh Quang", 9f, 9f);
		Student s3 = new Student();
		s3.setId(3);
		s3.setName("Ngo Minh Quoc");
		s3.setTheoreticalPoint(8f);
		s3.setPracticePoint(8f);

		Student[] ss = { s1, s2, s3 };

		System.out.println("---INFORMATION---");
		int count = 1;
		for (Student s : ss) {
			System.out.println("--> Student " + count + ":");
			System.out.println(s);
			count++;
		}
		
		System.out.println();
		generate("==> Student with an average score greater than 8.5: \n", findStudent_AvgMoreThan5(ss));
		generate("==> Student have greater theoretical points than practice: \n", findStudent_TheoreticalPractice(ss));
	}
	
	private static Student[] findStudent_AvgMoreThan5(Student[] ss) {
		Student[] result = new Student[ss.length];
		int count = 0;
		for(Student s: ss) {
			if(s.calculateAvgPoint() > 8.5) {
				result[count++] = s;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	private static Student[] findStudent_TheoreticalPractice(Student[] ss) {
		Student[] result = new Student[ss.length];
		int count = 0;
		for(Student s: ss) {
			if(s.getTheoreticalPoint() > s.getPracticePoint()) {
				result[count++] = s;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	private static void generate(String prefix, Student[] ss) {
		System.out.println(prefix + "-> ");
		for(Student s: ss) {
			System.out.println("   + " + s);
		}
		System.out.println("\n");
	}
}


