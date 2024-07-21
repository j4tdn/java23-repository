package view;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrangeNumber {

	public static void main(String[] args) {
		// nhập n bao nhiêu số nguyên
//			ngẫu nhiên	
//			đếm bao nhiêu số chia cho 7
//			                           5
//			                        5 và 7
//			                         còn lại
//			duyệt mảng từng cái: mảng chia cho số bằng tưng úng số lần đếm 
//			

		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("Input n: ");
		int n = sc.nextInt();
		if (n < 5 || n > 100) {
			System.out.println("Please input again: ");
			return;
		}

		int[] inputNumbers = new int[n];
		int[] outputNumbers = new int[inputNumbers.length];

		for (int i = 0; i < n; i++) {
			inputNumbers[i] = rd.nextInt(100) + 1;
		}
		System.out.println("input --> " + Arrays.toString(inputNumbers));

		int count = 0;
		for (int number : inputNumbers) {
			if (number % 7 == 0 && number % 5 != 0) {
				outputNumbers[count++] = number;
			}
		}
		for (int number : inputNumbers) {
			if (number % 7 != 0 && number % 5 != 0) {
				outputNumbers[count++] = number;
			}
		}
		for (int number : inputNumbers) {
			if (number % 7 == 0 && number % 5 == 0) {
				outputNumbers[count++] = number;
			}
		}
		for (int number : inputNumbers) {
			if (number % 7 != 0 && number % 5 == 0) {
				outputNumbers[count++] = number;
			}

//			for (int i = 1; i < n; i++) {
//               if(i == n - 1 ) {
//            	   System.out.println(outputNumbers[i]);
//               break;
//               }
				System.out.println("output --> " + Arrays.toString(outputNumbers));
//			}
			
//	   int i = 0;
//	  do {
//		 System.out.println("Input --> " +inputNumbers[i] + ","); 
//		  
//	  }while(i <= inputNumbers.length);
//         i++;	
// 	}

		}
	}
}
