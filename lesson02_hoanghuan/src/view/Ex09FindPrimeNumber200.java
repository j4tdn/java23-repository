package view;

public class Ex09FindPrimeNumber200 {
	public static void main(String[] args) {
        int count = 0;
        int n = 2;
        while (count < 200) {
            if (check(n)) {
                count++;
            }
            if (count == 200) {
                System.out.println("Số nguyên tố thứ 200 là: " + n);
                return;
            }
            n++;
        }
    }

    public static boolean check(int n) {
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
