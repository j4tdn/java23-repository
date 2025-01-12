package view.stream.practice;

import bean.Dish;
import bean.Item;
import bean.Store;
import model.DataModel;

import static utils.CollectionUtils.*;

import java.util.AbstractMap.SimpleEntry;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex02MapFlatMap {
	public static void main(String[] args) {

		var menu = DataModel.mockDishes();

		System.out.println("============= Stream#Map ============");

		var ids = menu.stream().map(Dish::getId).toList();

		generate("1. Ids: ", ids);
		
		var idCats = menu.stream()
				.map(d -> new SimpleEntry<>(d.getId(), d.getCategory()))
				.toList();
		generate("2. idCats", idCats);

		var names = map(menu, Dish::getName);
		generate("3. Names", names);

		System.out.println("============= Stream#flatMap ============");
		// stream<T> -> collection<T>

		// stream<collection<T>> --> flatMap --> stream<T> -> collection

		// Liệt kê danh sách tên các store đã bán hàng!

		var items = DataModel.mockItems();

//		items.stream() // Stream<Item>
//				.map(Item::getStores) // Stream<List<Store>> {s1,s2} ..
//				.collect(Collectors.toList()); // List<List<Store>>
		
		String storeNames = items.stream() // Stream<Item>
				.map(Item::getStores) // Stream<List<Store>> {s1,s2}, {s1,s2,s3} ..
				.flatMap(list -> list.stream()) // Stream<Store> s1,s2,s1,s2,s3 ...
			.map(Store::getName)
				.distinct()
				.collect(Collectors.joining(", "));

		System.out.println(storeNames);

		// flatMap làm phẳng mản 2 chiều
		Integer[][] a2D = { { 1, 5, 7 }, { 2, 2, 2 }, { 8, 7, 1 } };
		
		//Arrays.stream(Integer[]) --> Stream<Integer>
		//Arrays.stream(Integer[][]) --> Stream<Integer[]>
		
		Integer[] newA = Arrays.stream(a2D)
				.flatMap(a1D -> Arrays.stream(a1D))
				.toArray(Integer[]::new);
	}

	private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
		return list.stream().map(e -> function.apply(e)).toList();
	}
}
