package exercises;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		int  n = 0;
		Scanner sc = new Scanner(System.in);
		
		while (n < 5) {
            System.out.println("Nhap mot so : ");
            int N = sc.nextInt();

            if (N % 2 == 0) {
                System.out.println(N + " là bội của 2");
                break; 
                
            } else {
                System.out.println(N + " không là bội của 2");
                n++;
            }
        }
		
        if (n == 5) {
            System.out.println("Bạn đã nhập quá 5 lần không thể tiếp tục nhập");
        }
	}

}