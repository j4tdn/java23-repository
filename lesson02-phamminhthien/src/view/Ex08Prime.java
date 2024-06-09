package view;

import java.util.Scanner;

// kiểm tra số nguyên N có phải là số nguyên tố
public class Ex08Prime {
	public static void main(String[] args) {
		input();
	}

	public static void input() {
		int N;
		int count = 0;
		Scanner ip = new Scanner(System.in);
		while (count < 6) {
			System.out.print("Nhập số nguyên dương muốn kiểm tra: ");
			if (ip.hasNextInt()) {
				N = ip.nextInt();
				if(checkPrime(N)) System.out.println("-> "+ N + " Là số nguyên tố ");
				else System.out.println("-> " +N + " ko phải là số nguyên tố ");
//				break;
			} 
			else {
				System.out.println("-> Lỗi!, Vui lòng nhập lại đúng định dạng");
				ip.next();
			}
			count++;
		}
		if(count == 5) System.out.println("Bạn đã nhập sai quá nhiều lần!!!");
	}
	
	public static boolean checkPrime(int N) {
		if(N <= 1) return false;
		if(N == 2) return true;
		if(N %2 == 0) return false;
		for(int i=2; i<Math.sqrt(N); i+=2) {
			if(N%i==0) return false;
		}
		return true;
	}
}
