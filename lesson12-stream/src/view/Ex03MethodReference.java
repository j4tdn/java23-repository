package view;

import static utils.CollectionUtils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import bean.Apple;
import model.DataModel;

public class Ex03MethodReference {

	public static void main(String[] args) {
		// Cho danh sách apples
		// 1. Lấy ra id của tất cả các apple đó
		// 2. Lấy ra xuất sứ của tất cả các apple đó
		
		var inventory = DataModel.getApples();
		
		//Lambda
//		Function<Apple, Integer> fId = (Apple apple) -> apple.getId();
//		Function<Apple, Integer> fId = Ex03MethodReference::convert;
		
		// Chuyển sang method reference (khi đoạn code lambda trên quá dài)
		
		// Cách 1: Static method reference --> có công thức như trên và dưới làm
		
		// Cách 2: Non-static method reference --> chỉ có 1 số dạng, và phải học thuộc!
		// + Dạng 1: (T t) -> t.getMethod() ==> T::getMethod
		Function<Apple, Integer> fi = Apple::getId;
		
		generate(
			"1. Lấy ra id của tất cả các apple",
//			transform(inventory, (Apple apple) -> apple.getId())
//			transform(inventory, Ex03MethodReference::convertToId) //Static method reference
			transform(inventory, Apple::getId)					   //Non-static method reference - Dạng 1
		);
		
		generate(
			"2. Lấy ra xuất sứ của tất cả các apple đó",
//			transform(inventory, apple -> apple.getOrigin())
//			transform(inventory, Ex03MethodReference::convertToOrigin) //Static method reference
			transform(inventory, Apple::getOrigin)					   //Non-static method reference - Dạng 1
		);
		
		inventory.forEach(System.out::println);
	}
	
	// Viết một hàm,
	// đặt tên hàm bất ký.
	// Tham số: Chính là tham số của lambda
	// body: chính là body của lambda
	// Dùng khi lambda có body dài
	private static Integer convertToId(Apple apple) {
		return apple.getId();
	}
	
	private static String convertToOrigin(Apple apple) {
		return apple.getOrigin();
	}
	
	
	private static <R> List<R> transform(List<Apple> inventory, Function<Apple, R> function){
		List<R> result = new ArrayList<>();
		for (Apple apple: inventory) {
			result.add(function.apply(apple));
		}
		return result;
	}
	
}
