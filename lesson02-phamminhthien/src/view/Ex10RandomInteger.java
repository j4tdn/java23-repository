package view;

import java.util.Random;
// trình in ra 5 số nguyên ngẫu nhiên từ 20 đến 30 → [20, 30] không được trùng nhau
public class Ex10RandomInteger {
	public static void main(String[] args) {
		Random rd = new Random();
		int[] numbers = new int[5];
		int count = 0;
		while (count < 5) {
			int randomNumber = rd.nextInt(20, 31);
			boolean check = false;
			for (int i = 0; i < 5; i++) {
				if (numbers[i] == randomNumber) {
					check = true;
				}
			}
			if(!check) {
				numbers[count] = randomNumber;
				count++;
			}
		}
		System.out.print("Năm số nguyên ngẫu nhiên từ[20, 30]:  ");
		for (int number : numbers) {
			System.out.print(number + ", ");
		}
	}
}
