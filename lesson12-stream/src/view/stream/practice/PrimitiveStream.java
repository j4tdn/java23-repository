package view.stream.practice;

import java.util.Arrays;

public class PrimitiveStream {
	public static void main(String[] args) {
		// Primitive stream: IntStream, DoubleStream, LongStream
		// --> 100% chứa dữ liệu nguyên thuỷ: int, double
		// --> hỗ trợ hàm giống như Stream<T>

		// IntStream
		// forEach(IntConsumer consumer)

		// ObjectStream: Stream<T>
		// forEach(Consumer<T> consumer)

		int[] numbers = { 1, 2, 3 };
		// Arrays.stream(numbers) //IntStream
	}
}
