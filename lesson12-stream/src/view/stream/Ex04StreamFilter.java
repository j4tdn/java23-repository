package view.stream;

import java.util.List;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

import static utils.CollectionUtils.*;

public class Ex04StreamFilter {
	
	/*
	 Cho danh sách các số nguyên
	 + Tìm các phần tử sau âm 'B' trong danh sách
	 + Unique
	   . Tạo ra danh sách các phần tử mà không trùng nhau từ danh sách đã cho
	     --> VD: A B B C C D --> A B C D
	   . Lấy ra các phần tử là duy nhất trong danh sách
	     --> VD: A B B C C D --> A D
	 + Lấy 5 phần tử cuối cùng trong danh sách
	 + Lấy 3 phần tử đầu tiên trong danh sách  
	 */
	
	
	public static void main(String[] args) {
		var elements = List.of("A", "B", "B", "B", "C", "C", "D", "D", "E");
		
		generate(
			"1. Tìm các phần tử sau âm 'B' trong danh sách",
			elements.stream()
				.filter(e -> e.compareTo("B") > 0)
				.collect(Collectors.toSet()));
		
		generate(
			"2.1 Tạo ra danh sách các phần tử không trùng nhau",
			elements.stream()
				.distinct()
				.toList()); // prefer toSet(hashcode, equals)
		
		// Map<K, V>
		// K: thuộc tính muốn group by
		// V: List<T> chứa các phần tử có trùng K
		
		// counting
		// Map<K, Long>
		// K: thuộc tính muốn group by
		// V: số lượng phần tử trong list
		
		// Function<T, R> function = e -> e; ==> Function.identity()
		
		// + A=1
		// + B=3
		// + C=2
		// + D=2
		// + E=1
		List<String> uniqueElements = elements.stream() // Stream<String>
			.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) // Map<String, Long>
			.entrySet() // Set<Entry<String, Long>>
			.stream() // Stream<Entry<String, Long>>
			.filter(e -> e.getValue() == 1) // Stream<Entry<String, Long>>
			.map(Entry::getKey) // Stream<String>
			.toList(); // List<String>
		
		generate(
			"2.2 Lấy ra các phần tử là duy nhất trong danh sách",
			uniqueElements);
		
		// n --> lấy 5 cuối ==> skip n-5
		// 20 --> 5 cuối --> skip 15
		
		generate(
			"3. Lấy 5 phần tử cuối trong danh sách",
			elements.stream()
				.skip(elements.size() - 5)
				.toList());
		
		generate(
			"4. Lấy 3 phần tử cuối đầu tiên",
			elements.stream()
				.limit(3)
				.toList());
	}
	
}
