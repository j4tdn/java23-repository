package view.stream.practice;

import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Ex07BuildingStream {
	public static void main(String[] args) {
		// Tạo stream từ

		// array: primitive -> primitive Stream

		// array: object -> stream<T>

		// Collection: list/set -> stream<T>

		// map: entrySet -> Stream<T>

		// Tự build Stream
		Stream.of(1,2,3)
			.forEach(System.out::println);
		
		String s = "a,b,c";
		
		Pattern.compile(",").splitAsStream(s)
				.filter(si -> si.compareTo("a") > 0)
			.forEach(System.out::println);
	}
}
