package view;

public class Ex02 {
	
	private static boolean isSpecialNumber(int S) {
		if (S < 1) {
			return false;
		}
		
		int n = 1;
		while(true) {
			int sum = (n*(n+1))/2;
			if(sum == S) {
				return true;
			} else if (sum > S) {
				return false;
			}
			n++;
		}
	}
	
	public static void main(String[] args) {
		int S = 6;
		if(isSpecialNumber(S)) {
			System.out.println(S + " là số đặt biệt");
		} else {
			System.out.println(S + " ko phải số đặc biệt");
		}
	}
}
