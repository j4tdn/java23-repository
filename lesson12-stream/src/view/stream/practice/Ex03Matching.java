package view.stream.practice;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Ex03Matching {
	public static void main(String[] args) {
		var numbers = List.of(1, 2, 1, 4, 5, 6, 8, 50, 4, 12);

		// 1: is thêr any element / 10
		boolean r1 = numbers.stream().anyMatch(d -> d % 10 == 0);
		System.out.println(r1);
		// 2: first element %4=0
		// Optional --> hạn chế NPE
		// T: null, non-null
		// Optional -> luôn khác null, trước khi T hỗ trợ isPresent or ...

		Optional<Integer> optR2 = numbers.stream().filter(d -> d % 4 == 0).findFirst();
		optR2.ifPresent(val -> System.out.println(val));

		// 3: find ele % 5 =0
		numbers.stream()
		.filter(nb -> nb % 5 == 0)
		.collect(Collectors.toSet())
				.forEach(e -> System.out.println(e)

				);
		;
	}
}
