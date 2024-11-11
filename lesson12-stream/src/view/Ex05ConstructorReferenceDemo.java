package view;

import java.util.function.Function;
import java.util.function.Supplier;

import bean.Item;

public class Ex05ConstructorReferenceDemo {

	public static void main(String[] args) {
		
		Supplier<Item> s1 = () -> new Item();
		Supplier<Item> s2 = () -> Item::new;
		
		Function<Integer, Item> f1 = id -> new Item(id);
	}
}
