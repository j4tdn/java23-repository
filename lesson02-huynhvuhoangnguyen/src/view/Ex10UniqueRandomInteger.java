package view;

import java.util.Arrays;
import java.util.Random;

public class Ex10UniqueRandomInteger {

	public static void main(String[] args) {
		Random rd = new Random();
		int numberOfRandoms = 5;	// 5 số random
		int[] uniqueNumbers = new int[numberOfRandoms]; // tạo một arry mới có độ dài là 5
		int count = 0;
		
		while (count < numberOfRandoms) {
			int randomNumber = rd.nextInt(20, 31);
			boolean isUnique = true;
			
			for(int i = 0; i < count; i++) {
				if(uniqueNumbers[i] == randomNumber) {
					isUnique = false;
					break;
				}
			}
			
			if (isUnique) {
				uniqueNumbers[count] = randomNumber;
				count++;
			}
		}
		
		System.out.println("5 unique randome number [20, 30] is: " + 
						Arrays.toString(uniqueNumbers));
	
	}
	
}
