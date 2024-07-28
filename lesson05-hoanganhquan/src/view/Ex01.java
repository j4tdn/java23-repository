package view;


public class Ex01 {	
	
	public static boolean isPowerOf (int a, int b) {
		if (a <= 0 || b <= 1) {
			return false;
		}
		if (a > b) {
		int i = b;
		while (i < a) {
			i *= b; 
		}
		return i == a;
		}
		else {
			int x;
			x = a;
			a = b;
			b = x;
			int i = b;
			while (i < a) {
				i *= b; 
			}
			return i == a;
		}
	}


	public static void main(String arg[]) {
		
		System.out.println(isPowerOf(8,2));
		System.out.println(isPowerOf(2,8));
		
	}
}
