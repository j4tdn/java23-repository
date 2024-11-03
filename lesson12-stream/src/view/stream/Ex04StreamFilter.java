package view.stream;

import java.util.List;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

import static ultisl.CollectionUtils.*;
public class Ex04StreamFilter {
	/*
	 Cho 1 danh sách các số nguyên có sẵn
	 + Tìm các ptu chẵn trong danh sách
	 + Unique
	 	. Tạo re danh sách các phần tư mà nó không trùng nhau từ danh sách đã cho
	 	--> VD 1 2 3 4 4 2 -> 1 2 3 4
	 	. Lấy ra các phần tử duy nhất trong danh sách
	 	 --> VD 1 2 3 1 3 4 -> 2 4
	 + Lấy 5 phàn tử cuối cùng trong danh sách
	 + Lấy 3 phần tử đầu tiên trong danh sách
	 
	 */
	public static void main(String[] args) {
		var elements = List.of( "A" ,"B" , "C", "C", "D", "D", "E");
		
		
		// 1.Tìm các ptu sau am B trong danh sách
		generate(
				"1.Tìm các ptu chẵn trong danh sách", 
				elements.stream()
				.filter(e -> e.compareTo("B") > 0)
				.collect(Collectors.toSet()));
		generate(
				"2.Tao ra danh sách các ptu không trung nhau", 
				elements.stream()
				.distinct()
				.toList());// hoặc dùng toSet
		List<String> uniqueElements = elements.stream()
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet()
				.stream()
				.filter(e -> e.getValue() > 1)
				.map(Entry:: getKey)
				.toList();
		generate(
				"2.Lấy ra các phần tử duy nhất trong danh sách", uniqueElements);
		
		elements.stream()
			.skip(elements.size() - 5)// VD Có n ptu lấy 5 ptu cuối dùng skip(n - 5) 
			.toList();
		generate(
				"3.Lấy 5 phàn tử cuối cùng trong danh sách", elements.stream()
				.skip(elements.size() - 5)
				.toList());
		generate(
				"3.Lấy 3 phần tử đầu tiên trong danh sách", elements.stream()
				.limit(3)
				.toList());
		
		

		
		
		
		
	}
}
