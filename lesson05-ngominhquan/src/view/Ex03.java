package view;

public class Ex03 {

	public static int getMaxValidNumber(String input) {
		
		int maxNumber = -1;
		int currentNumber = 0;
		boolean inNumber = false;
		
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (Character.isDigit(c)) {
				if (!inNumber) {
					inNumber = true;
					currentNumber = c - '0';
				} else {
					currentNumber = currentNumber * 10 + (c - '0');
				}
			} else {
				if (inNumber) {
					if (currentNumber > maxNumber) {
						maxNumber = currentNumber;
					}
					inNumber = false;
				}
			}
		}
		
		if (inNumber && currentNumber > maxNumber) {
			maxNumber = currentNumber;
		}
		
		return maxNumber;
	}
	
	public static void main(String[] args) {
		System.out.println(getMaxValidNumber("12abu02muzk586cyx"));
		System.out.println(getMaxValidNumber("Uyk892nn1234uxo2"));
		System.out.println(getMaxValidNumber("abc"));
		System.out.println(getMaxValidNumber("abc123xyz456"));
	}
}
