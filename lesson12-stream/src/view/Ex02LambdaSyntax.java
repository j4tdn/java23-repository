package view;

import java.util.function.Function;
import java.util.function.Supplier;

public class Ex02LambdaSyntax {
	public static void main(String[] args) {
		
		// Khi code 1 lambda (đúng)
		// -> suy ra công thức của "HÀM TRỪU TƯỢNG"
		
		Runnable runnable = () -> {}; // -> Void

		Supplier<String> supplier = () -> "Raul";

		Function<Integer, String> func = (Integer i) -> "Alan" + i;

		// Predicate<T> --> T -> boolean
		// Consumer<T> -> T -> void
		// Comparator<T> -> (T, T) -> int
		// Function<T,R> -> T -> R
		// UnaryOperator<T> -> T -> T
		// Supplier<T> --> () -> T
		// Callable --> () throws Exception -> T
		// Runnable --> () -> void
	}
}
