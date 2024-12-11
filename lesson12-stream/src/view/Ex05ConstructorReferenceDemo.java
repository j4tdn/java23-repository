package view;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

import bean.Item;
import functional.BuFunction;

public class Ex05ConstructorReferenceDemo {
	
	public static void main(String[] args) {
		Supplier<Item> s1 = () -> new Item();
		Supplier<Item> s2 = Item::new;
		
		Function<Integer, Item> f1 = id -> new Item(id);
		Function<Integer, Item> f2 = Item::new;
		
		BiFunction<Integer, LocalDate, Item> bf1 = (id, expiredDate) -> new Item(id, expiredDate);
		BiFunction<Integer, LocalDate, Item> bf2 = Item::new;
		
		BuFunction<Integer, String, BigDecimal, LocalDate, Item> buf = Item::new;
		
	}
	
}