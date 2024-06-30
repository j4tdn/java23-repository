package review;

public class Ex07DecimalBinaryBase {
	
	public static void main(String[] args) {
		
		System.out.println("to binary " + toBinary(8));
		
	}
	
	private static String toBinary(int decimal) {
		String binary = "";
		while (decimal != 0) {
			int modePart = decimal % 2;
			decimal = decimal / 2;
			
			binary = modePart + binary;
		}
		return binary;
	}
	
}
