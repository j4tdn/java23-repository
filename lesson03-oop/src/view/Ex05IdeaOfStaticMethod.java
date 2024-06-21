package view;

public class Ex05IdeaOfStaticMethod {
	
	private String sequence;
	public Ex05IdeaOfStaticMethod(String sequence) {
		this.sequence = sequence;
	}
	
	public static void main(String[] args) {
		
		// Viết chương trình tìm tổng 2 số nguyên a và b
//		Ex05IdeaOfStaticMethod o1 = new Ex05IdeaOfStaticMethod();
//		System.out.println("o1 --> " + o1.sum(5,7));
//		
//		Ex05IdeaOfStaticMethod o2 = new Ex05IdeaOfStaticMethod();
//		System.out.println("o1 --> " + o2.sum(7,8));
		
		System.out.println("o --> " + Ex05IdeaOfStaticMethod.sum(5,8));
		
		Ex05IdeaOfStaticMethod o1 = new Ex05IdeaOfStaticMethod("ầggaw23");
		System.out.println("o1 is number ---> " + o1.isNumber());;
		
		Ex05IdeaOfStaticMethod o2 = new Ex05IdeaOfStaticMethod("134");
		System.out.println("o2 is number ---> " + o2.isNumber());;
		
	}
	
	
	// Hàm sum chỉ phụ thuộc vào tham số truyền vào
	//				ko phụ thuộc vào đối tượng đang gọi  --> static
	private static int sum(int a, int b) {
		return a+b;
	}
	
	private boolean isNumber() {
		for(int i=0; i< sequence.length(); i++) {
			char letter = sequence.charAt(i);
			if(letter <= '0' || letter >= '9')
				return false;
		}
		return true;
		
	}
	
	private static void printfHello() {
		System.out.println("Today ---> 21.06.2024");
	}
}
