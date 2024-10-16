package generic.method;

public class Ex01GenericMethodDemo {
	
	public static void main (String[] args) {
		
		printg("X1");
		printf("X2");
		
	}
	
	private static <E> void printg (E val) {
		System.out.println("value -->" + val);
	}
	
	private static void printf (Object val) {
		System.out.println("value -->" + val);
	}
	
}
