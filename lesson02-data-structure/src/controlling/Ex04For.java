package controlling;

public class Ex04For {
	public static void main(String[] args) {
		for(int i = 0; i<10; i++) {
			System.out.println("i ---> " + i);
		}
		System.out.println("\n ======= \n");
		
		int i = 0;
		for( ; i<10; ) {
			System.out.println("i ---> " + i);
			i++;
		}
	}
}
