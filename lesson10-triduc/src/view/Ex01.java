package view;

import java.util.Arrays;
import java.util.Random;

public class Ex01 {
	public static void main(String[] args) {
		Integer n = new Random().nextInt(0, 10);
		Integer[] numbers = new Integer[n];

		for(int i = 0; i < numbers.length; i++) {
			Integer temp = new Random().nextInt(0, 10);
			numbers[i] = temp;
		}

		generate("origin: ", numbers);

		generate("1. after removed: ", removeDuplicatedNumber(numbers));

		System.out.println("2. Left > Right ? " + compare(numbers));

		System.out.println("3. Third: " + findTheThird(numbers));
	}

	private static void generate(String prefix, Integer[] numbers) {
		System.out.print(prefix + " {");
		for (Integer num : numbers) {
			System.out.print(num + " ");
		}
		System.out.println("}");
	}
	
	private static Integer[] removeDuplicatedNumber(Integer[] numbers) {
		Integer[] result = new Integer[numbers.length];
		int count =0;
		for (int i = 0; i < result.length; i++) {
			if(checkDuplicated(numbers, numbers[i])) {
				result[count++] = numbers[i];
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

	private static boolean checkDuplicated(Integer[] numbers, Integer num) {
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == num) {
				count++;
			}
			if (count > 1) {
				return false;
			}
		}
		return true;
	}

	private static boolean compare(Integer[] numbers) {
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < numbers.length / 2; i++) {
			sum1 += numbers[i];
		}
		
		for (int i = numbers.length / 2; i < numbers.length; i++) {
			sum2 += numbers[i];
		}

		return sum1 > sum2;
	}

	private static Integer findTheThird(Integer[] numbers) {
		Integer[] temp = removeDuplicatedNumber(numbers);
		for (int i = 0; i < temp.length; i++) {
			for (int j = i; j < temp.length - 1; j++) {
				if (temp[i] > temp[j]) {
					Integer swap = temp[i];
					temp[i] = temp[j];
					temp[j] = swap;
				}
			}
		}
		

		if (temp.length == 0) {
			return null;
		}
		
		else if (temp.length <= 1) {
			return temp[0];
		}
		
		return temp[temp.length - 3];

	}

}
