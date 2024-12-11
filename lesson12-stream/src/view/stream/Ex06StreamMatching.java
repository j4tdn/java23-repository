package view.stream;

import java.util.Arrays;

import utils.CollectionUtils;

public class Ex06StreamMatching {
	
	public static void main(String[] args) {
		
		int[] numbers = {13,2,1,42,5,8,10,4,12};
		
		System.out.printf(
			"1. Có bất kì phần tử nào chia hết cho 10 hay không? --> %s",
			Arrays.stream(numbers) //IntStream
			.anyMatch(nb -> nb % 10 == 0)
		);
		
		// Optional<T>
		// OptionalInt
		// -> hạn chế NPE (null pointer exception)
		System.out.printf(
				"2. Tìm phần tử đầu tiên mà chia hết của 4? --> %s",
				Arrays.stream(numbers) //IntStream
				.filter(nb -> nb % 4 == 0)
				.findFirst() // OptionalInt
				.orElse(-1)  // nếu trong optional không có thì trả về -1
			);
		
		CollectionUtils.generate(
				"3. Tìm phần tử nào chia hết cho 5", 
				Arrays.stream(numbers)
				.filter(nb -> nb % 5 == 0)
				.toArray()
				);
		
		System.out.printf(
				"4. Có phải các phần tử đều bé hơn cho 100 không? --> %s",
				Arrays.stream(numbers) //IntStream
				.allMatch(nb -> nb < 100)	
			);
		
		System.out.printf(
				"5. Có phải ko có phần tử nào lớn hơn cho 0 không? --> %s",
				Arrays.stream(numbers) //IntStream
				.noneMatch(nb -> nb > 0)
			);
		
	}

}
