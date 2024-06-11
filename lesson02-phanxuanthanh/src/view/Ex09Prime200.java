package view;

public class Ex09Prime200 {
	public static void main(String[] args) {
		int count = 0;
		int number = 2;
		while(count < 200){
			if(isPrime(number)) {
				count++;
			}
			number++;
		}
		int prime200 = number - 1;
		System.out.println("Prime 200: " + prime200);
		}
    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
