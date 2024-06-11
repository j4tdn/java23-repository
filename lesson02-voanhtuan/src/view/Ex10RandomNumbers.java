package view;

import java.util.Random;

public class Ex10RandomNumbers {
	public static void main(String[] args) {
		Random rd = new Random();
		int[] numbers = new int[5];
		int count = 0;
		//tạo 5 số ngẫu nhiên không trùng
		while (count < 5) {
			int randomNumber = rd.nextInt(20, 31);
			boolean check = false;
			for (int i = 0; i < 5; i++) {
				if (numbers[i] == randomNumber) {
					check = true;
					break;
				}
			}
			if (!check) {
				numbers[count] = randomNumber;
				count++;
			}
		}
		System.out.print("Năm số nguyên ngẫu nhiên [20, 30]:  ");
		for (int number : numbers) {
			System.out.print(number + " ");
		}
	}
}
