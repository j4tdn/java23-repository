package view;

public class Ex02 {
	public static void main(String[] args) {
		System.out.println(isSpecialNumber(-1));
		System.out.println(isSpecialNumber(6));
		System.out.println(isSpecialNumber(9));
	}
	
	public static boolean isSpecialNumber(int number) {
		if(number<1) {
			return false;
		}
		int sum=0;
		for(int i=1; sum<number; i++) {
			sum+=i;
			if(sum == number) return true;
		}
		return false;
	}
}
