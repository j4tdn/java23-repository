package view.stream.practice;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import bean.Dish;
import model.DataModel;
import utils.CollectionUtils;

public class Ex01filterDistinctLimit {
	public static void main(String[] args) {
		
		/*
		 n[1,100]
		 
		 1. Liệt kê ptu trong danh sách, trùng nhau chỉ lấy 1 lần -> distinct
		 
		 VD: 1,1,1,2,2,2,3 --> 1,2,3
		 --> Chuyển sang set
		 --> dùng distinct trong stream
		 
		 
		 2. Liệt kê các ptu chỉ xuất hiện 1 lần
		 VD: a,a,b,b,c,d -> c,d
		 
		 Tổng quát: 
		 + 1 lần 
		 + 2 lần
		 + nhiều hơn 1
		 
		 --> mỗi phần tử xuất hiện bao lần [a,2], b[3]
		 */
		
		List<Integer> numbers = List.of(1, 2, 3, 1, 2, 3, 3, 4);
		
		List<Integer> distinctNumbers = numbers.stream()
				.distinct()
				.toList();
		
		
		//groupingBy(Function<T, ?>)
		//List<Dish> --> groupingBy (d->d.getId()) --> Map<Integer, List<Dish>>
		//List<String> --> groupingBy (s->s) --> Map<String, List<String>>

		List<String> elements = List.of("a", "a", "b", "b", "c", "d");
		
		Map<String, List<String>> groups =elements.stream()
				.collect(Collectors.groupingBy(e -> e));
		
		Map<String, Long> groupsCounters = elements.stream()
				.collect(Collectors.groupingBy(e -> e, Collectors.counting()));
	
		String unique = elements.stream()
				.collect(Collectors.groupingBy(e -> e, Collectors.counting()))
				.entrySet() // -> Set
				.stream() // Stream<Entry<String,Long>>
				.filter(e -> e.getValue() == 1) // Stream<Entry<String,Long>>
				.map(Entry::getKey) // Stream<String> {c,d}
//			.toList(); //List<String>
				.collect(Collectors.joining(", ")); // {c,d}
		System.out.println(unique);

		// distinct by Key - property

		// .distinct() //equals, hashCode -> muốn distinct theo tt gì phải đổi
		// hạn chế: ko thể distinct theo 1 lúc nhiều y/c

		List<Dish> menu = DataModel.mockDishes();
		
		// C1: distinct by key (set, nếu n ptu trùng nhau -> luôn lấy ptu đầu)
		CollectionUtils.generate("Liệt kê 0 trùng nhau: ", distinctByKey(menu, d -> d.getCalories()));
	
		// C2: dùng map để distinct danh sách theo thuộc tính,
		// chọn được phần tử đầu hoặc cuối
		Collection<Dish> collection = menu.stream() // Stream<Dish>
				.collect(Collectors.toMap(Dish::getName, Function.identity(), (e1, e2) -> e2)) // Map<String,Dish>
				.values();
		CollectionUtils.generate("Liệt kê 0 trùng nhau: ", distinctByKey(menu, d -> d.getCalories()));
	}

	private static <T, R> List<T> distinctByKey(List<T> menu, Function<T, R> keyExtractor) {
		Set<R> nonOverlapNames = new HashSet<>();
		return menu.stream()
				.filter(d -> {
					return nonOverlapNames.add(keyExtractor.apply(d));
				}).collect(Collectors.toList());
		
	}
}
