package view;

import java.util.Random;

public class Ex10DiffNumbers {
	public static void main(String[] args) {
		int[] numbers = new int[5];
		for (int number:numbers) {
			System.out.println(number);
		}
		Random random = new Random();
		int count = 0;
		while(count < 5) {
			boolean duplicate = false;
			int randomNumber = random.nextInt(10,21);
			System.out.println(randomNumber);
			for(int i :numbers) {
				if(i == randomNumber) {
					duplicate = true;
					break;
				}
			}
			if (!duplicate) {
				numbers[count] = randomNumber;
				System.out.println("Số thứ "+ count + " :" + numbers[count]);
				count++;
			}
			
			
		}
		System.out.println("=======Các số ngẫu nhiên========");
		for (int number:numbers) {
			System.out.println(number);
		}
	}
}
