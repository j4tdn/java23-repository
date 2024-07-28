package view;

import java.util.Scanner;

public class Ex03FindMaxNumber {

	public static void main(String[] args) {
		String input = "Uyk892nn1234uxo2";
		if(getMaxValidNumber(input)!= -1) {
			System.out.println("Max number is: "+ getMaxValidNumber(input));
		}else {
			System.out.println("Number not found");
		}
	}
	
	private static int getMaxValidNumber(String input) {
	    String[] sts = input.split("[^0-9]+");
	    int maxNumber = -1;
	    int currentNumber = 0;
	    for (String st :sts) {
	    	if(!st.isEmpty()) {
	    		currentNumber = Integer.parseInt(st);
	    		if(currentNumber > maxNumber) {
	    			maxNumber = currentNumber;
	    		}
	    	}
	    }
	    return maxNumber;
	}
}
