package exam;

import java.util.Iterator;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println("Số lớn nhất trong chuỗi: "+ getMaxValidNumber(s));
	}
	
	public static int getMaxValidNumber(String s) {
		String[] strSplit = s.split("\\D+");
		int max = Integer.MIN_VALUE;
		for (String str:strSplit) {
			if(!str.isEmpty()) {
				int n = Integer.parseInt(str);
				max = Math.max(n, max);
				
			}
		}
		return max;
	}
}
