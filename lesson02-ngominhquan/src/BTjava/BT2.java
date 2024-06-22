package BTjava;

public class BT2 {
	public static void main(String[] args) {
        int[] validNumbers = {4, 8, 16};
        
        for (int number : validNumbers) {
            System.out.println(number + " là lũy thừa của 2: " + isPowerOfTwo(number));
        }
        
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int attempts = 0;
        int N = 0;
        boolean isValid = false;

        while (attempts < 5) {
            System.out.print("Nhập vào số nguyên dương N: ");
            if (scanner.hasNextInt()) {
                N = scanner.nextInt();
                if (N > 0) {
                    isValid = true;
                    break;
                } else {
                    System.out.println("Số nhập vào phải là số nguyên dương. Vui lòng thử lại.");
                }
            } else {
                System.out.println("Dữ liệu nhập vào không phải là số nguyên. Vui lòng thử lại.");
                scanner.next();
            }
            attempts++;
        }

        if (isValid) {
            System.out.println(N + " là lũy thừa của 2: " + isPowerOfTwo(N));
        } else {
            System.out.println("Bạn đã nhập sai quá 5 lần.");
        }

        scanner.close();
    }

    private static boolean isPowerOfTwo(int N) {
        return N > 0 && (N & (N - 1)) == 0;
    }
}

