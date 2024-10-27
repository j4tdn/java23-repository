package view;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import bean.Apple;
import model.DataModel;

public class Ex05MethodReference_NonStatic {
	public static void main(String[] args) {
		var inventory = DataModel.getApples();
		
		var ids = getData(inventory, apple -> apple.getId());
		var colors = getData(inventory, Apple::getColor);
		var weights = getData(inventory, apple -> apple.getWeight());

		inventory.sort(Comparator.comparing(Apple::getId));

		ids.forEach(System.out::println);
		colors.forEach(e -> System.out.println(e));
	}
	
	/*
	 BT: cho danh sách apples
	 1. Lấy danh sách tất cả id, color, salesPrice.
	 */

	private static <T, R> List<R> getData(List<T> inventory, Function<T, R> function) {
		List<R> result = new ArrayList<R>();
		for (T element : inventory) {
			result.add(function.apply(element));
		}

		return result;
	}
}
