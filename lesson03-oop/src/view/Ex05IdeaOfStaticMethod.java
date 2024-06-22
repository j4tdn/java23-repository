package view;

public class Ex05IdeaOfStaticMethod {
	private String sequences;
	
	public Ex05IdeaOfStaticMethod(String s) {
		this.sequences = s;
	}
	//Viết ctrinh tìm tổng a và b
	public static void main(String[] args) {
//		Ex05IdeaOfStaticMethod i1 = new Ex05IdeaOfStaticMethod();
//		System.out.println(i1.sum(4, 5));
		
		Ex05IdeaOfStaticMethod i1 = new Ex05IdeaOfStaticMethod("koko");
		System.out.println(i1.isNumber());
	}
	
	
	//Hàm sum phụ thuộc vào tham số truyền vào
	// không phụ thuộc vào đối tượng -> static
	private static int sum(int a, int b) {
		return a + b;
	}
	
	
	//phụ thuộc vào biến sequnces của class -> không có static
	private boolean isNumber() {
		for(int i = 0; i < sequences.length(); i++) {
			char letter = sequences.charAt(i);
			if(letter >= '0' || letter <= '9') {
				return false;
			}
		}
		return true;
	}
}


