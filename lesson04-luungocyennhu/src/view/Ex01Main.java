package view;

import java.util.Arrays;

import bean.Students;

public class Ex01Main {
	
	public static void main(String[] args) {
		Students s1 = new Students(1, "Luu Ngoc Yen Nhu", 9.0f, 8.5f);
		Students s2 = new Students(2, "Chu Thi Hoai Nhi", 8.5f, 8.0f);

		Students s3 = new Students();
		s3.setId(3);
		s3.setName("Tran Bao Uyen");
		s3.setTheoreticalPoint(7.5f);
		s3.setPracticePoint(9.0f);

		Students[] ss = { s1, s2, s3 };

		System.out.println("--------- INFORMATION ---------------");
		int count = 1;
		for (Students s : ss) {
			System.out.println("--> Student " + count + ":");
			System.out.println(s);
			count++;
		}
		
		System.out.println();
		generate("==> Students with an average score greater than 8.5: \n", findStudent_AvgMoreThan5(ss));
		generate("==> Students have greater theoretical points than practice: \n", findStudent_TheoreticalPractice(ss));
	}
	
	private static Students[] findStudent_AvgMoreThan5(Students[] ss) {
		Students[] result = new Students[ss.length];
		int count = 0;
		for(Students s: ss) {
			if(s.calculateAvgPoint() > 8.5) {
				result[count++] = s;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	private static Students[] findStudent_TheoreticalPractice(Students[] ss) {
		Students[] result = new Students[ss.length];
		int count = 0;
		for(Students s: ss) {
			if(s.getTheoreticalPoint() > s.getPracticePoint()) {
				result[count++] = s;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	private static void generate(String prefix, Students[] ss) {
		System.out.println(prefix + "-> ");
		for(Students s: ss) {
			System.out.println("   + " + s);
		}
		System.out.println("\n");
	}
}
