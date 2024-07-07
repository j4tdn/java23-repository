package view_fixcode;

public class Ex07DecimalBinary {
	
	public static void main(String[] args) {
		
		System.out.println("to binary -->" + toBinary(11));
		
	}
	
	
	private static String toBinary(int decimal) {
		String binary = ""; //
		while(decimal != 0){
			int modPart = decimal % 2;
			decimal /= 2;
			
			binary = modPart + binary; // cộng vào đầu chuổi
		}
		return binary;
	}
}
