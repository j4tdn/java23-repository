package view.stream;

import java.util.Arrays;

import utils.CollectionUtils;

public class Ex06StreamMaching {
	
	/*
	 Example: Give a list of numbers: 1, 2, 1, 4, 5, 8, 10, 4, 12
	1st: is there any element that is divisible by 10
	2nd: find the first element that is divisible by 4
	3nd: find the element that is divisible by 5 in the list
	4th: does all elements less than 100
	5th: does no elements greater than 0
	 */
	
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 1 , 42, 5, 8, 10, 4, 12 };
		
		System.out.printf(
				"1st: is there any element that is divisible by 10 --> %s\n\n",
				Arrays.stream(numbers)
					  .anyMatch(nb -> nb % 10 == 0)
		);
		
		// Optional<T>
		// OptionalInt
		// --> hạn chế NPE(null pointer exception)
		
		System.out.printf(
				"2nd: find the first element that is divisible by 4 --> %s\n\n",
				Arrays.stream(numbers) // IntStream
					  .filter(nb -> nb % 4 == 0)
					  .findFirst() // OptionalInt
					  .orElse(-1) // Nếu trong optional ko có trả về -1
		);
		
		CollectionUtils.generate("3nd: find the element that is divisible by 5 in the list",
				Arrays.stream(numbers) // IntStream
				  .filter(nb -> nb % 5 == 0)
				  .toArray()
				);
		
		System.out.printf(
				"4th: does all elements less than 100 --> %s\n\n",
				Arrays.stream(numbers)
					  .allMatch(nb -> nb < 100)
		);
		
		System.out.printf(
				"	5th: does no elements greater than 0 --> %s",
				Arrays.stream(numbers)
					  .noneMatch(nb -> nb < 0)
		);
		
	}
	
}
