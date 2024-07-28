package view;

import bean.InputUtils;

public class Ex02 {
	public static void main(String[] args) {
		Integer input = InputUtils.inputInteger("Enter an integer number ", 3);
		if(isSpecialNumber(input)) {
			System.out.println(input + " is a special number");
		}
		else {
			System.out.println(input + " is not a special number");
		}
	}
	
	private static boolean isSpecialNumber(Integer number) {
		int sum = 0;
		for(int i = 1; i <= number; i++) {
			sum += i;
			if(sum == number) {
				return true;
			}
		}
		return false;
	}
}
