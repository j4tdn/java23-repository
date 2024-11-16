package view;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.Supplier;

import bean.Apple;
import bean.Item;
import model.DataModel;
import utils.CollectionUtils;

public class Ex04ConstructorReference {

	
	/*
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
	
	//anonymous class
	Supplier<Item> s1 = new Supplier<Item>() {
		@Override
		public Item get() {
			return new Item();
		}
	};
	
	// anonymous function = lamda
	Supplier<Item> s2 = () -> {
		return new Item();
	};
	
	//static method reference
	Supplier<Item> s3 = Item::init;
	
	// constructor reference
	// Supplier<T>: () -> T
	// ==> Item:: new tự biết dùng hàm khởi tạo k có tham số
	Supplier<Item> s4 = Item::new;
	
	var inventory = DataModel.getApples();
	 
	//Cách 2 ngắn gọn hơn
	var cities = map(inventory, Apple::getOrigin, ArrayList::new);
	CollectionUtils.generate("city -->", cities);

	// Cách 1
	var city = map(inventory, t -> t.getOrigin() , () -> new ArrayList<>());
	CollectionUtils.generate("city -->", city);
	
	}

	public static <T,R> Collection<R> map
	               (List<T> elements, Function<T, R> function, Supplier<Collection<R>> supplier) {
		// () -> HashSet 
		// () -> TreeSet 
		// () -> LinkedHashSet 
		
		Collection<R> result = supplier.get();
		
		for(var element:elements) {
			result.add(function.apply(element));
		}
		return result;
	}
	
}
