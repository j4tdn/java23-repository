package view;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import bean.Apple;
import model.DataModel;
import utils.CollectionUtils;

public class Ex03MethodReference {

	public static void main(String[] args) {
		
		var inventory = DataModel.getApples();
		
		// Chuyển sang method reference
		
		// Cách 1: static method reference --> có công thức
		
		// Cách 2: non-static method reference --> Chỉ có 1 số dạng và học thuộc 
		// Dạng 1: (T t) -> t.getMethod() ==> T:getMethod
		//T là tên Kdl , t là kiểu dữ liệu mình lấy trong T
//		Function<Apple, Integer> fi = Apple::getId;d
		
		
		// Lấy ra tất cả id của apple 

//		CollectionUtils.generate("Tất cả id của apple" , getAll(inventory, apple -> 
//		       apple.getId()
//				));
CollectionUtils.generate("Tất scả id của apple" , getAll(inventory, Ex03MethodReference::convertToId)
				);
//		CollectionUtils.generate("Tất cả id của apple" , getAll(inventory, Apple::getId)
//			));
		
		// Lấy ra xuất xử của tất cả apple đó 

//		CollectionUtils.generate("Tất cả xuất xứ của apple" , getAll(inventory, apple -> 
//	       apple.getOrigin()
//			));
		CollectionUtils.generate("Tất cả xuất xứ của apple" , getAll(inventory, Apple::getOrigin
				));
		
		inventory.forEach(System.out::println);
		
	}
	
	private static <R> List<R> getAll(List<Apple> inventory, Function<Apple, R> function){
		List<R> result = new ArrayList<R>();
		for(var apple:inventory) {
				result.add(function.apply(apple));
			}
           return result;		
		}
	
	private static Integer convertToId(Apple apple) {
		return apple.getId();
	}
		
	private static String convertToOrigin(Apple apple) {
		return apple.getOrigin();
	}
	}

