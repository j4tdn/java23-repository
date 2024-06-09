package video_array;

import java.util.Scanner;

public class Ex01ArrayOperation {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập kích thước mảng: ");
		int size=ip.nextInt();
		int []numbers = new int [size];
		
		//dùng vòng for
		// in ra theo index
		for(int i=0; i<numbers.length; i++) {
			System.out.print("Nhập giá trị mảng: ");
			numbers[i]=ip.nextInt();
		}
		
		// dùng foreach 
		//- ko quan tâm index
		for(int number: numbers) {
			System.out.println("Giá trị: " + number);
		}
		
		
		String []sequences = {"hello", "hi", "xin chào"};
		System.out.println("Length: " + sequences.length);
		for(String sequence: sequences) {
			System.out.println(sequence);
			
		}
	}
	
}
