package view.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import bean.Dish;
import model.DataModel;

import static ultisl.CollectionUtils.*;
public class Ex05StreamMapping {
	
	public static void main(String[] args) {
		List<String> elements = List.of("Hello", "Water", "Laptop", "Televition");
		generate("1. Lấy độ dai của từng từ ", elements.stream()
				.map(String :: length)
				.toList());
		generate("2. Lấy độ dai của từng từ, kèm từ ", elements.stream()
				.collect(Collectors.toMap(Function.identity(), String :: length)));
		
		List<Dish> menu = DataModel.getDishes();
		
		generate("3. Lấy số thứ tự cuối cùng của tên đĩa thức ăn", menu.stream()
				.map(d -> {
					String name = d.getName();
					return name.charAt(name.length()- 1);
				}).toList());
		List<List<String>> cards = List.of(
				List.of("5 co", "6 chuon" , "2 co" , "2 bich"),
				List.of("8 ro", "Ri co"),
				List.of("10 co ", "2 chuon")
				);
		generate(
				"4. Tìm những quân bài là 2 còn lại ",
				cards.stream() // Stream<List<String>>
				.flatMap(list -> list.stream()) // Stream<String>
				.filter(card -> card.startsWith("2"))
				.toList()); //List<String>
		
		int [][] mtrix2D= {
				{2,3,4},
				{5,6,7},
				{1,2,3}
		};
		// Stream <Integer> và IntStream(Hỗ trợ thêm các hàm cho KDL nguyên thủy + - * /)
		generate(
				"5. Chuyển đổi mảng 2 chiều sang 1 chiều",
				Arrays.stream(mtrix2D)
				.flatMapToInt(Arrays::stream)
				.toArray());
			
	}
}
