package array;

import java.util.Random;
import java.util.Scanner;

public class SaddleElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length: "); //chìu dài
		int m = sc.nextInt();
		System.out.println("Enter width: "); //chìu rộng
		int n = sc.nextInt();
		
		//tạo mảng 2 chìu
		Integer[][] arraytwoside = new Integer[m][n];
		
		//nhập dữ lịu cho mảng
		for(int i = 0; i < m ; i++) { 
			for (int j = 0; j < n; j++) {
				arraytwoside[i][j] = new Random().nextInt(1,99);
			}
		}
		
		//in
		System.out.println("Array: ");
		for(int i = 0; i < m ; i++) { 
			for (int j = 0; j < n; j++) {
				System.out.printf("%5d", arraytwoside[i][j]);
			}
			System.out.println();
		}
		
		for(int i = 0; i < m ; i++) {
			int j = 0;
			int column = 0; //vị trí để so khớp cột
			int max1 = arraytwoside[i][j];
			//tìm vị trí lớn nhất ở 1 hàng giữa các cột
			while(j < n) {
				if(max1 < arraytwoside[i][j]) {
					max1 = arraytwoside[i][j];
					column = j;
				}
				j++;
			}
//			System.out.println(max + " ở " + column);
			int k = 0;
			int max2 = max1;
			//so sánh lớn nhất ở 1 cột giữa các hàng
			while(k < m) {
				if(max2 < arraytwoside[k][column]) {
					max2 = arraytwoside[k][column];
				}
				k++;
			}
//			System.out.println(max+ " ở "+row);
			if(max2 == max1) {
				System.out.println("There is at least 1 saddle element in array, is: " + max2);
			}
//			System.out.println("-----------");
		}
		
		
	}
}
