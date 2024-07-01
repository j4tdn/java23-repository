package view;

public class Ex07DecimalBinaryBase {
	
	public static void main(String[] args) {
		System.out.println("to binary --> " + toBinary(6));
	}
	
	private static String toBinary(int decimal) {
		String binary = "";
		while(decimal != 0) {
			int modPart = decimal % 2;
			decimal = decimal / 2;
			binary = modPart + binary; // cộng vào đầu
		}
		
		return binary;
	}
	
}
