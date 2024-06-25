package view;

public class Ex05IdeaOfStaticMethod {
	
	private String sequences;
	
	public Ex05IdeaOfStaticMethod (String sequences) {
			this.sequences = sequences;
	}
	
	public static void main(String[] args) {
		
		// Viết chương trình tìm tổng 2 số a và b
		
		// Ex05IdeaOfStaticMethod o1 = new Ex05IdeaOfStaticMethod();
		// System.out.println("o1 sum ==> " + o1.sum(5, 7));
		
		// Ex05IdeaOfStaticMethod o2 = new Ex05IdeaOfStaticMethod();
		// System.out.println("o2 sum ==> " + o2.sum(5, 8));
		
		System.out.println("o sum ==> " + Ex05IdeaOfStaticMethod.sum(5, 8));
		
		Ex05IdeaOfStaticMethod o1 = new Ex05IdeaOfStaticMethod("kkdkfk");
		System.out.println("o1 sum ==> " + o1.isNumber());
				
		Ex05IdeaOfStaticMethod o2 = new Ex05IdeaOfStaticMethod("12345");
		System.out.println("o2 sum ==> " + o2.isNumber());
	}
	
	// Hàm sum phụ thuộc vào tham số truyền vào
	// 		   không phụ thuộc vào đối tượng đang gọi ==> static
	private static int sum(int a, int b) {
		return a + b;
	}
	
	private boolean isNumber(){
		for(int i = 0; i < sequences.length(); i ++) {
			char letter = sequences.charAt(i);
			if (letter <= '0' || letter >= '9') {
				return false;
			}		
		}
		return true;
	}
	
	private static void printfHello() {
		System.out.println("Today --> 16.06.2024");
	}
}
