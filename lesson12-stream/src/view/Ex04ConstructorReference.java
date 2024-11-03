package view;

import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

import bean.Item;
import model.DataModel;

public class Ex04ConstructorReference {
	public static void main(String[] args) {
		/*
		 1. Method Reference
		 + Bất kì lambda nào cũng có thể chuyển sang method reference 
		 + Static, non-Static method reference
		 
		 2. Constructor Reference 
		 + Để lambda có thể chuyến sang Constructor Reference thì yêu cầu body của lambda trả về 1 đối tượng được tạo ra 
		 từ constructor của class
		 
		 Sử dụng lambda khi nào
		 
		 + Khai báo hàm hoặc dùng hàm có sẵn, hàm có tham số là functional interface --> tạo đối tượng cho FI đó --> dùng lambda cho code ngắn gọn 
		 + Áp dụng trong strategy pattern
		  
		  Functional Interface có sẵn trong Java
		  
		  =============================
		  
		  
		 */
		// anonymous class
		Supplier<Item> s1 = new Supplier<Item>() {
			
			@Override
			public Item get() {
				return new Item();
			}
		};
		// anonymous function
		Supplier< Item> s2 = () -> new Item();
		
		// static method reference
		//Supplier<Item> s3 = 
		
		//var inventory = DataModel.getApples();
		
	}
	public static <T,R> Collection<R> map(List<T> elements, Function<T, R> funt, Supplier<Collection<R>> supplier){
		Collection<R> result = supplier.get();
		for(var element : elements) {
			result.add(funt.apply(element));
		}
		return result;
	}
}
