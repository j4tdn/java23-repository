package view;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import javax.naming.spi.DirStateFactory.Result;

import bean.Apple;
import model.DataModel;

import static utils.CollectionUtils.*;

public class Ex03MethodReference {

	public static void main(String[] args) {
		//  Cho danh sách apples
		
		//Lambda
//		Function<Apple, Integer> fId = (Apple apple) -> apple.getId();
//		Function<Apple, Integer> fId = Ex03MethodReference::convert;
		
		// Chuyển sang method reference
		
		// Cách 1: Static method reference --> có công thức 
		
		// Cách 2: Non-static method reference --> chỉ có 1 số dạng và học thuộc
		// Dạng 1: (T t) -> t.getMethod() ==> T::getMethod
		
		var inventory = DataModel.getApples();
		// 1. Lấy ra id của cac apple đó
		
		generate("1. Lấy ra id của các apple", 
//				transform(inventory, apple -> apple.getId())
				//transform(inventory, Ex03MethodReference::convertToId)
				transform(inventory, Apple::getId)
				);
		
		
		// 2. Lấy ra xuất xứ của các apple đó
		
		generate("1. Lấy ra xuất xứ của các apple",
//				transform(inventory, apple -> apple.getOrigin())
//				transform(inventory, Ex03MethodReference::convertToOrigin)
				transform(inventory, Apple::getOrigin)
				);
		inventory.forEach(System.out::println);
		
	}
	
	// Đặt tên hàm bất kỳ
	// Tham số: chính là tham số của lambda
	// body: chính là body của lambda
	// Dùng khi lambda có body dài
	
	private static Integer convertToId(Apple apple) {
		return apple.getId();
	}
	
	private static String convertToOrigin(Apple apple) {
		return apple.getOrigin();
	}
	
	private static <R> List<R> transform(List<Apple> inventory, Function<Apple, R> function ){
		List<R> result  = new ArrayList<>();
		
		for (Apple apple : inventory) {
			result.add(function.apply(apple));
		}
		
		return result;
	}
}
