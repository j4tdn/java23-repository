package view;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import bean.Apple;
import model.DataModel;

import static ultisl.CollectionUtils.*;
public class Ex03MethodReference {
	public static void main(String[] args) {
		// Cho sanh sach apples
		var inventory = DataModel.getApples();
		
		
		// Cách 1 : Static method reference --> có công thức
		
		// 1. Lay ra id
		// Cách 2 : Non-static method reference -> chỉ có 1 dạng công thức và học thuộc
		// Dạng 1 (T , t ) -> t.get() ==> T :: get...
		// Dạng 2:
		
		generate("1. Lay ID", transform(inventory, Apple :: getId)); // cach 2
		//2.Lay ra xuat su
		generate("2. Xuat Su", transform(inventory, Apple :: getOrigin)); // cach 2
	}
	private static <R>List<R>  transform(List<Apple> inventory, Function<Apple, R> function ){
		List<R> result = new ArrayList<>();
		
		for(Apple apple : inventory) {
			result.add(function.apply(apple));
		}
		return result;
	}
	// Đăt tên hàm bất kì
	// Tham số : CHính là tham số của lambda
	// body: chính là body của lamda
	// dùng khi lambda có body dài
	private static Integer convertToID(Apple apple) {
		return apple.getId();
	}
	private static String convertToorigin(Apple apple) {
		return apple.getOrigin();
	}
	
}
