package view;

public class Ex03MaxNumber {
	public static void main(String[] args) {
		String text = "112abu02muzk5454586cyx1454698";		
		System.out.println("Số tự nhiên hợp lệ lớn nhất: " + getMaxValidNumber(text));
	}
	private static int getMaxValidNumber(String stream) {
		int biggestNumber = -1;
		int currentNumber = 0;
		boolean inNumber = false;
		
		for (int i = 0; i < stream.length(); i++) {
			char c = stream.charAt(i);
			
			if(Character.isDigit(c)) {
//				System.out.println("digit 1: " + c);
				currentNumber = currentNumber* 10 + (c - '0');
				inNumber = true;
			}
			else {
//				System.out.println("digit 2: " + c);
				if (inNumber) {
					if (currentNumber > biggestNumber) {
						biggestNumber = currentNumber;
//						System.out.println("biggest number :" + biggestNumber);
					}
					currentNumber = 0;
					inNumber = false;
					
				}
			}
			if ( i == stream.length()-1 && inNumber && currentNumber > biggestNumber) {
				biggestNumber = currentNumber;
			}
		}
		
		return biggestNumber;
		
		
	}
}
