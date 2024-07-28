package view;

public class isSpecialNumber {
	public static void main(String[] args) {
		int [] number = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for (int n : number) {
			System.out.println("So " + n + " la so dac biet " + isSpecialNumber(n));
		}
	}
		private static boolean isSpecialNumber (int a) {
			int sum = 0;
			int i = 1;
			
			while (sum < a) {
				sum += i;
				i++;
			}
			return sum == a;
		}
}
