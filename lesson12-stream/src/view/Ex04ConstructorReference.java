package view;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

import bean.Apple;
import bean.Item;
import model.DataModel;
import utils.CollectionUtils;

public class Ex04ConstructorReference {

	/*
	 1.
	 
	 2. 
	 
	 
	 */
	
	public static void main(String[] args) {
		
		// anonymous class
		Supplier<Item> s1 = new Supplier<Item>() {
			@Override
			public Item get() {
				return new Item();
			}
		};
		
		// anonymous function (lambda)
		Supplier<Item> s2 = () -> new Item();
		
		// static method reference
		Supplier<Item> s3 = Item::init;
		
		// constructor reference
		// Supplier<T>: () -> T
		// ==> Item::new tự biết là dùng khởi tạo ko có tham số
		Supplier<Item> s4 = Item::new;
		
		var inventory = DataModel.getApples();
		var cities = map(inventory, Apple::getOrigin, ArrayList::new);
		CollectionUtils.generate("1. Xuat xu", cities);
	}
	
	public static <T, R> Collection<R> map(List<T> elements, Function<T, R> funt, Supplier<Collection<R>> supplier){
		// () -> HashSet
		// () -> TreeSet
		// () -> LinkedHashSet
		Collection<R> result = supplier.get();
		for(T element: elements)
			result.add(funt.apply(element));
		return result;
	}
}
