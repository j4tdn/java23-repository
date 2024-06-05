package loop;

public class Ex01For {
	public static void main(String[] args) {
		//In ra số nhỏ hơn 10
		for(int i = 0; i < 10; i++) {
			System.out.println("i --- " + i);
		}
		
		int i = 0;
		for (;i<10;) {
			System.out.println("i --- " + i);
		}
	}
}
