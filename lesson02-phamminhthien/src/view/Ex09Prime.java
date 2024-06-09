package view;
//tìm số nguyên tố thứ 200 trong hệ thống số tự nhiên.
public class Ex09Prime {
	public static void main(String[] args) {
		int count = 0;
        int number = 2;
        while (count < 200) {
            if (checkPrime(number)) {
                count++;
                if (count == 200) {
                    System.out.println("Số nguyên tố thứ 200 là: " + number);
                    break;
                }
            }
            number++;
        }
	}
	 public static boolean checkPrime(int n) {
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
