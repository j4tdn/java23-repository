package BTjava;

public class BT4 {
	public static void main(String[] args) {
        int a = generateRandomNumber();
        int b = generateRandomNumber();
        int c = generateRandomNumber();
        int d = generateRandomNumber();

        long sum = factorial(a) + factorial(b) + factorial(c) + factorial(d);
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("Tổng của giai thừa của a, b, c, d là: " + sum);
    }

    // Hàm tính giai thừa của số N
    private static long factorial(int N) {
        if (N < 0) {
            throw new IllegalArgumentException("Số N phải là số nguyên dương.");
        }
        
        long result = 1;
        for (int i = 2; i <= N; i++) {
            result *= i;
        }
        return result;
    }

    // Hàm sinh số nguyên ngẫu nhiên trong khoảng từ 10 đến 20
    private static int generateRandomNumber() {
        return (int) (Math.random() * 11) + 10;
    }
}
