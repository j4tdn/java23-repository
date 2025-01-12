package view.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ex02StreamTraversableOnlyOnce {
	public static void main(String[] args) {
		// Collection<T> --> stream() --> Stream<T>

		// Array<T> & primitive

		String[] elements = { "a", "b", "c", "d" };

		Stream<String> stream = Arrays.stream(elements);

		stream.forEach(System.out::println);

//		stream.forEach(System.out::println); //exception
	}
}
