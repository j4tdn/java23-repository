package view;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import bean.Apple;
import model.DataModel;

import static utils.CollectionUtils.*;

public class Ex03MethodReference {

	public static void main(String[] args) {
		
		// Cho danh sach apples 
		
		var inventory = DataModel.getApples();
		
		// Lambda
		// Function<Apple, Integer> fId = (Apple apple) -> apple.getId();
		// Function<Apple, Integer> fId = Ex03MethodReference::convert;
		
		// Chuyển sang method reference
		
		// Cách 1: static method reference -> có công thức
		// Cách 2: non-static method reference --> chỉ có 1 số dạng và học thuộc
		// Dạng 1: (T t) -> t.getMethod() ==> T::getMethod
		
		generate(
				"1. Lấy ra id của tất cả các apple đỏ", 
				// transform(inventory, apple -> apple.getId()))
				// transform(inventory, Ex03MethodReference::convertToId)
				transform(inventory, Apple::getId)
				);
		
		generate(
				"1. Lấy ra xuất xứ của tất cả các apple đỏ", 
				// transform(inventory, apple -> apple.getOrigin()))
				// transform(inventory, Ex03MethodReference::convertToOrigin)
				transform(inventory, Apple::getOrigin)
				);
		
		inventory.forEach(System.out::println);
	}
	
	// Tham số: chính là tham số của lambda
	// body: chính là body của lambda
	
	private static Integer convertToId(Apple apple) {
		return apple.getId();
	}
	
	private static String convertToOrigin(Apple apple) {
		return apple.getOrigin();
	}
	
	private static <R> List<R> transform(List<Apple> inventory, Function<Apple, R> function){
		
		List<R> result = new ArrayList<>();
		
		for (Apple apple : inventory) 
			result.add(function.apply(apple));
		
		return result;
	}
}
