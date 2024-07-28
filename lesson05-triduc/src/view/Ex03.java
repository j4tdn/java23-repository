package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bean.InputUtils;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter input: ");
		String input = sc.nextLine();
		System.out.println("Max Valid Number: " + getMaxValidNumber(input));
		sc.close();
	}
	
	private static int getMaxValidNumber(String s) {
		int max = 0;
		String number = "";
		List<String> num = new ArrayList<String>();
		for(int i = 0; i < s.length(); i++) {
			if(InputUtils.isIntegerNumber(String.valueOf(s.charAt(i)))) {
				number += String.valueOf(s.charAt(i));
			}
			else {
				if(!number.isEmpty()) {
					num.add(number);
					number = "";
				}
			}
		}
		if(!number.isEmpty())
			num.add(number);
		System.out.println(num);
		max = Integer.valueOf(num.get(0));
		for(String st : num) {
			if(Integer.valueOf(st) > max) {
				max = Integer.valueOf(st);
			}
		}
		return max;
	}
}
