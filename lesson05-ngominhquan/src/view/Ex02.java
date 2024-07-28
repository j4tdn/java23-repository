package view;

public class Ex02 {
	
	public static boolean isSpecialNumber(int S) {
		if(5 < 1) {
			return false;
		}
		
		int n = 1;
		int sum =0;
		while (sum < S) {
			sum += n;
			if (sum == S) {
				return true;
			}
			n++;
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(isSpecialNumber(1));
		System.out.println(isSpecialNumber(3));
		System.out.println(isSpecialNumber(6));
		System.out.println(isSpecialNumber(7));
		System.out.println(isSpecialNumber(10));
	}

}
