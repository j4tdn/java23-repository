package view;

import java.util.Arrays;
import java.util.Random;

public class Ex10Random5DistinctNum {
	public static void main(String[] args) {
		int[] n = new int[5];
		int count;

		for (int i = 0; i < 5; i++) {
			do {
				count = 0;
				int number = new Random().nextInt(20, 31);
				for (int j = 0; j < i; j++) {
					if (n[j] == number) {
						count++;
					}
				}
				if (count == 0) {
					n[i] = number;
				}
			} while (count != 0);
		}
		System.out.println(Arrays.toString(n));
	}
}
