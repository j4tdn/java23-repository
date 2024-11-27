package view.stream;

import java.util.Arrays;

import utils.CollectionUtils;

public class Ex06StreamMatching {

	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 1, 42, 5, 8, 10, 4, 12};
		
		System.out.printf(
				"1. Is there any element that is divisible by 10 -> %s\n",
				Arrays.stream(numbers)	// IntStream
					  .anyMatch(number -> number % 10 == 0)
		);
		
		// Optional<T>
		// OptionInt
		// --> hạn chế NPE(NullPointerException)
		
		System.out.printf(
				"2. Find the first element that is divisible by 4 -> %s\n\n",
				Arrays.stream(numbers)	// IntStream
					  .filter(number -> number % 41 == 0)
					  .findFirst()		// OptionalInt
					  .orElse(-1)		// nếu trong optional không có -> trả về -1
		);
		
		CollectionUtils.generate("3. Find the elements that is divisible by 5 in the list", 
								 Arrays.stream(numbers)
								 	   .filter(number -> number % 5 == 0)
								 	   .toArray()
		);
		
		System.out.printf(
				"4. Does all elements less than 100 -> %s\n\n",
				Arrays.stream(numbers)	// IntStream
					  .allMatch(nb -> nb < 100)
		);
		
		System.out.printf(
				"5. Does no elements greater than 0 -> %s\n\n",
				Arrays.stream(numbers)
					  .noneMatch(nb -> nb < 100)
		);
		
	}
	
}
