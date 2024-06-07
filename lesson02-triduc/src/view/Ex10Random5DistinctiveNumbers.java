package view;

import java.util.Arrays;
import java.util.Random;

public class Ex10Random5DistinctiveNumbers {
//	Viết chương trình in ra 5 số nguyên ngẫu nhiên từ 20 đến 30 → [20, 30]
//	Yêu cầu: 5 số ngẫu nhiên không được trùng nhau
	public static void main(String[] args) {
		int[] numbers = new int[5];
		int count = 0;
		for(int i = 0; i < 5; i++) {
			while(count != 5) {
				count = 0;
				int number = new Random().nextInt(20,31); 
				System.out.println(number);
				for(int j = 0; j < 5; j++) { //check số ở trong mảng
					if(numbers[j] != number)
						count++;
				}
				if(count==5)
					numbers[i] = number;
				else
					System.out.println("Trùng!");
			}
			count = 0;
		}
		System.out.println(Arrays.toString(numbers));
	}
}
