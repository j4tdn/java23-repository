package BTjava;

public class BT3 {
	public static void main(String[] args) {
        int N = 5;
        System.out.println(N + "! = " + factorial(N));
   
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
}

