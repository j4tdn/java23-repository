package view;

public class EX05IdeaOfStaticMethod {
	public static void main(String[] args) {
		//viet chuong trinh tim tong a b
		/*
		 * EX05IdeaOfStaticMethod o1 = new EX05IdeaOfStaticMethod();
		 * System.out.println("o1 sum ==> "+o1.sum(5, 7)); EX05IdeaOfStaticMethod o2 =
		 * new EX05IdeaOfStaticMethod();
		 */
		System.out.println("o sum ==> "+EX05IdeaOfStaticMethod.sum(7, 8));
		EX05IdeaOfStaticMethod o1 = new EX05IdeaOfStaticMethod("123");
		o1.isNumber();
		System.out.println("o1 --> "+o1.isNumber());
	}
	public EX05IdeaOfStaticMethod(String sequence) {
		this.sequence = sequence;
	}
	private static int sum(int a, int b) {
		return a+b;
	}
	private String sequence;
	private boolean isNumber() {
		for(int i =0;i<sequence.length();i++) {
			char letter = sequence.charAt(i);
			if(letter <='0'|| letter >='9') {
				return false;
			}
		}
		return true;
	}
	private static void printfHello() {
		System.out.println("Today");
	}
	
}
