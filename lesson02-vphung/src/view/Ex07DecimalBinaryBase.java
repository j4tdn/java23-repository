package view;

public class Ex07DecimalBinaryBase {

	public static void main(String[] args) {
		
		System.out.println("To Binary --> " + toBinary(11)); // Kết quả 1011
		
	}
	
	private static String toBinary(int decimal) {
		String binary = "";
		while(decimal != 0) {
			int modPart = decimal % 2;
			decimal = decimal / 2;
			
			binary = modPart + binary; // Cộng vào đầu
		}
		return binary;
	}
}
