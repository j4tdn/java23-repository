package view;

import java.util.Scanner;
// trình tìm số nguyên lớn, nhỏ nhất trong 3 chữ số a,b,c
public class Ex06MaxNumber {
	public static void main(String[] args) {
		input();
	}

	public static void input() {
		Scanner ip = new Scanner(System.in);
		int []numbers = new int[3];
		int sl = 1;
		for(int i=0; i<numbers.length; i++) {
			while(sl<6) {
				System.out.print("Nhập số nguyên: ");
				if (ip.hasNextInt()) {
					int number = ip.nextInt();
					if (number >= 0 && number < 20) {
						numbers[i] = number;
						break;
					} else {
						System.out.println("Lỗi - " + sl + ", Vui lòng nhập lại số [0,20)\n");
					}
				} 
				else {
					System.out.println("Lỗi - " + sl + ", Vui lòng nhập lại !\n");
					ip.next();
				}
				sl++;
			}
			if(sl == 6) {
				System.out.println("Bạn nhập sai quá nhiều lần !");
				return;
			}
		}
		int max = findMax(numbers);
		System.out.println("\n=> "+max+" Là số lớn nhất trong 3 số !");
	}
	
	public static int findMax(int[] numbers) {
		int max = numbers[0];
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i]>max) {
				max=numbers[i];
			}
		}
		return max;
	}
	
}
