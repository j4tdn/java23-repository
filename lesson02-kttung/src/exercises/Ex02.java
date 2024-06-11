package exercises;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		int  n = 0;
		Scanner sc = new Scanner(System.in);
		
		while (n < 5) {
            System.out.println("Nhập một số  : ");
            int N = sc.nextInt();

            if (checkPowerOfTwo(N)== true) {
                System.out.println(N + " lũy thừa của 2");
                break; 
               
            } else {
                System.out.println(N + " không là lũy thừa của 2");
                n++;
            }
        }

        if (n == 5) {
            System.out.println("Bạn đã nhập quá 5 lần không thể tiếp tục nhập");
        }
	}

	private static boolean checkPowerOfTwo(int number) {
        return (number > 0) && ((number & (number - 1)) == 0);
    }
}
