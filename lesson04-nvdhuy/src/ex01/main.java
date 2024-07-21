package ex01;

import java.util.Arrays;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Students s1 = new Students (123,"Nguyen Huy", 8.5,7.8);
		Students s2 = new Students (234,"Anh Quan", 9.5,10);
		
		
		System.out.println("SV1 " + s1);
		System.out.println("SV2 " + s2);
		
		
		Students s3 = new Students ();
		s3.setId(456);
		s3.setName("Nguyen");
		s3.setDLT(8);
		s3.setDTT(9);
		
		
		System.out.println("Sv3 " + s3);
		
		Students[] student = {s1,s2,s3};
		System.out.println(student[0]);
		
		for (Students sv : student) {
			if (sv.Avg() > 8.5) {
				System.out.println(sv);
			}
		}
		for (Students sv : student) {
			if(sv.getDLT() > sv.getDTT()) {
				System.out.println(sv);
			}
		}
	}
}
	


