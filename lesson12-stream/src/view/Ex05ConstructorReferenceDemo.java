package view;

import java.util.function.Function;
import java.util.function.Supplier;

import bean.Item;

public class Ex05ConstructorReferenceDemo {

	public static <R> void main(String[] args) {
// Tự tạo hàm khởi tạo rỗng
		Supplier<Item> s1 = () -> new Item();
		Supplier<Item> s2 = Item::new;
		
//	Function<Integer, R> f1 = id -> new Item(id);
	
		
		
		
	}
}
