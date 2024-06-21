package view;

public class Ex05IdeaOfStaticMethod {
	
	private String sequence; 
	
	public Ex05IdeaOfStaticMethod(String sequence) {
		this.sequence = sequence;
	}
	public static void main(String[] args) {
		// Viet chuong trinh tim tong 2 so a va b
		System.out.println("o sum --> " + sum);
	}
	
	// Ham sum phu thuoc vao tham so truyen vao
	// 			k phu thuoc vao doi tuong dang goi ==> static
	private int sum(int a, int b) {
		return a + b;
	}
	
	private boolean isNumber () {
		for (int i = 0; i < sequence.length(); i++);
				char letter = sequence.charAt(i);
				if (letter <= '0' || letter >= '9') {
					return false;
				}
				return true;
	}
	private static void printfHello () {
		System.out.println("Today --> 16.06.2024 ");
	}
}
