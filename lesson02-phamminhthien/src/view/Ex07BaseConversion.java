package view;

import java.util.Scanner;
// chuyển đổi cơ số một số tự nhiên ở hệ cơ số 10(thập phân) thành số ở hệ cơ số 2(nhị phân)
public class Ex07BaseConversion {
	public static void main(String[] args) {
		input();
	}
	
	public static void input() {
		int number;
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập số tự nhiên(thập phân) muốn chuyển đổi sang(nhị phân): ");
		number = ip.nextInt();
		
		int temp = number;
		int size=0;
		while(temp > 0) {
			temp /=2;
			size++;
		}
//		System.out.println("size --> " + size);
		int []numbers = new int[size];
		int i=0;
		while(number>0) {
			numbers[i]= number % 2;
			number /=2;  
			i++;
		}
		
		System.out.print("Dãy số nhị phân là: ");
		for(int j=size - 1; j>=0; j--) {
			System.out.print(numbers[j]+" ");
		}
		
	}
}
