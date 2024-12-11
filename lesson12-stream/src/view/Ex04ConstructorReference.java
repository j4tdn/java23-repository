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
	 1. Method Reference
	 + Bất kỳ lambda nào, mình để có thể chuyển sang method reference
	 + Static, Non-Static method reference
	 
	 2. Constructor Reference
	 + Để lambda có thể chuyển sang Constructor Reference thì
	   yêu cầu body của lambda trả về một đối tượng được tạo ra
	   từ constructor của class
	   
	 
	 Sử dụng lambda khi nào
	 ======================
	 + Khai báo hàm hoặc dùng hàm có sẵn, hàm có tham số là
	   functional interface --> tạo đối tượng cho FI đó -->
	   dùng lambda để code ngắn gọn
	 
	 + Áp dụng trong strategy pattern
	 
	 Functional Interface có sẵn của Java
	 ====================================
	 Predicate<T>  : T -> boolean
	 Function<T, R>: T -> R
	 BiFunction<T, U, R>: (T, U) -> R
	 Supplier<T>   : () -> T
	 Comparator<T> : (T, T) -> int
	 */
	
	// Ví dụ: có hàm có tham số là Supplier<T>, khi gọi
	// hàm thì phải tạo ra đối tượng của Supplier để truyền vào
	
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
