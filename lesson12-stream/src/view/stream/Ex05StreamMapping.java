package view.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import bean.Dish;
import model.DataModel;

import static utils.CollectionUtils.*;

public class Ex05StreamMapping {

	public static void main(String[] args) {
		List<String> elements = List.of("Hello", "Water", "Laptop", "Television");
		
		// Lấy độ dài của từng từ trong danh sách trên
		generate("1. Lấy độ dài của từng từ", 
				elements.stream()
				.map(String::length)
				.toList());
				
		generate("2. Lấy độ dài của từng từ kèm giá trị", 
				elements.stream()
				.collect(Collectors.toMap(Function.identity(), String::length)));
		
		List<Dish> menu = DataModel.getDishes();
		generate("3. Lấy số thứ tự cuối cùng của tên đĩa thức ăn", 
				menu.stream()
					.map(d -> {
						String name = d.getName();
						return name.charAt(name.length() - 1);
					})
					.toList());
		
		// {{1,2}, {2, 3}, {3, 4}} --> {1,2,2,3,3,4}
		// source --> Stream<Collection<T>> --> flatMap --> Stream<T>
		List<List<String>> cards = List.of(
					List.of("5 cơ", "6 chuồng", "2 cơ", " 2 rô"),
					List.of("8 rô", "ri cơ"),
					List.of("10 cơ", "2 chuồng")
				);
		
		generate("4. Tìm những quân bài là 2 còn lại", 
				cards.stream()	// Stream<List<String>>
				 .flatMap(list -> list.stream())	// Stream<String>
				 .filter(card -> card.startsWith("2"))
				 .toList()); 	// List<String>);
				
		int[][] matrix2D = {
				{2,3,4},
				{5,7,8},
				{1,2,3}
		};
		
		// Stream<Integer> và IntStream (hỗ trọ thêm các hàm cho KDL nguyên thủy + - * /)
		
		generate("5. Chuyển đổi mảng 2 chiều sang 1 chiều", 
				Arrays.stream(matrix2D) // Stream<int[]>
				  .flatMapToInt(Arrays::stream)	// IntStream
				  .toArray());
		
	}
	
}
