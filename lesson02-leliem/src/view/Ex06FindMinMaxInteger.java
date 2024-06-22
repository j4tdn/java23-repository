package view;

import java.util.Scanner;

public class Ex06FindMinMaxInteger {
	public static void main(String[] args) {
		
		   int a = getValueInteger();
		   int b = getValueInteger();
		   int c = getValueInteger();
		
		    int max = Math.max(a, Math.max(b, c));
	        int min = Math.min(a, Math.min(b, c));

	        System.out.println("Số lớn nhất là " + max);
	        System.out.println("Số nhỏ nhất là " + min);

	}

	private static int getValueInteger() {
		Scanner ip = new Scanner(System.in);
		String numberAsText = "";
		int number = 0;
		do {
			System.out.println("Enter your number");
			numberAsText = ip.nextLine();
			if (numberAsText.matches("\\d+")) {
				number = Integer.parseInt(numberAsText);
		        if (number >= 0 && number <20) {
		        	return number;
		         } else {
		        	 System.out.println("The value must be between 0 and 19. Please re-enter. ");
		         }
	        }else {
	        	System.out.println("The value must be an integer. Please re-enter.");	
	        }
         }while (true);
	}
}
