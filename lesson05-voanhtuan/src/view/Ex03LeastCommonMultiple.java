package view;

public class Ex03LeastCommonMultiple {

	public static void main(String[] args) {
		int[] A1 = {2, 3};
		System.out.println("[2, 3] -> BCNN = " + getLeastCommonMultiple(A1));
		
		int[] A2 = {2, 3, 4};
		System.out.println("[2, 3, 4] -> BCNN = " + getLeastCommonMultiple(A2));
	}	
	
	// method UCLN (Greatest Common Divisor)
	private static int gcd(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
	
	// method BCNN (Least Common Multiple)
	private static int lcm(int a, int b) {
		return (a*b)/gcd(a, b);
	}
	
	// method tìm BCNN trong mảng
	private static int getLeastCommonMultiple(int[] A){
		int lcm = A[0];
		
		for (int i = 1; i < A.length; i++) {
			lcm = lcm(lcm, A[i]);
		}
		
		return lcm;
	}
	
}
