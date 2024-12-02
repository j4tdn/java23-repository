package view;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import bean.Apple;
import model.DataModel;

import static utils.CollectionUtils.*;

public class Ex03MethodReference {
	
	public static void main(String[] args) {
		//Cho danh sách apples, lấy ra id của tất apple
		
		//Lấy ra id của tất cả các apple đó
		
		//2.Lấy ra xuất sứ của tất cả các apple đó
		
//		Function<Apple, Integer> fID= (Apple apple) -> apple.getId();
//		Function<Apple, Integer> fID = Ex03MethodReference::convert;
		
		//CHuyển sang method reference
		
		//Cách 1: Static method reference --> Có công thức
		
		//Cách 2 :Non-static method reference --> Chỉ có 1 số dạng và học thuộc 
		//Dạng 1 : (T t ) -> t.method()==> T::getmethod
		
		Function<Apple, Integer> fi =Apple::getId;
		
		var inventory = DataModel.getApples();
		
		generate("1 Laays ra id cuar tat ca apple", 
//				transform(inventory, apple-> apple.getId()
				transform(inventory, Apple::getId)
				
				);
		
		generate(
				"2. Lấy ra xuất sứ của tất cả các apple đó	", 
				transform(inventory, Apple::getOrigin));
		inventory.forEach(System.out::println);
	}
	private static Integer convertToId(Apple apple) {
		return apple.getId();
	}
	private static String convertToOrigin(Apple apple) {
		return apple.getOrigin();	
		}
	private static <R> List<R> transform(List<Apple> inventory,Function<Apple, R> function){
		List<R> result = new ArrayList<>();
		for (Apple apple:inventory) {
			result.add(function.apply(apple));
		}
		return result;
	}
}
