package view;

import javax.sound.midi.Sequence;

public class Ex05IdeaOfStaticMethod {
	
	private String sequence;
	
	public Ex05IdeaOfStaticMethod(String sequence) {
		this.sequence = sequence;
	}

	public static void main(String[] args) {
		
		// Viết chương trình tìm tổng hai số a và b
		
		// Ex05IdeaOfStaticMethod o1 = new Ex05IdeaOfStaticMethod();
		// System.out.println("o1 sum ==> " + o1.sum(5, 7));

		// Ex05IdeaOfStaticMethod o2 = new Ex05IdeaOfStaticMethod();
		// System.out.println("o1 sum ==> " + o2.sum(5, 8));

		System.out.println("o sum ==> " + Ex05IdeaOfStaticMethod.sum(5, 8));
		
		Ex05IdeaOfStaticMethod o1 = new Ex05IdeaOfStaticMethod("ab67yk");
		System.out.println("o1 is number ==> " + o1.isNumber());
		
		Ex05IdeaOfStaticMethod o2 = new Ex05IdeaOfStaticMethod("22563");
		System.out.println("o1 is number ==> " + o2.isNumber());
		
	}
	
	// Hàm sum phụ thuộc vào tham số truyền vào
	//		   không phụ thuộc vào đối tượng đang gọi ==> static
	private static int sum(int a, int b) {
		return a + b;
	}
	
	private boolean isNumber() {
		for (int i = 0; i < sequence.length(); i++) {
			char letter = sequence.charAt(i);
			if (letter <= '0' || letter >= '9') {
				return false;
			}
		}
		return true;
	}
	
	private static void printHello() {
		System.out.println("Today --> 16.06.2024");
	}
	
}
