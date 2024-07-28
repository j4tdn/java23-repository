package view;

public class Ex02 {
	public static int getMissingNumber(int n, int[] A) {
		int totalSum = n * (n + 1) / 2;
		int arraySum = 0;
		
		for (int i : A) {
			arraySum += i;
		}
		return totalSum - arraySum;
	}
	
	public static void main (String arg[]) {
		int[] A = {3,2,1,6,5};
		System.out.println(getMissingNumber(6, A));
	}
}
