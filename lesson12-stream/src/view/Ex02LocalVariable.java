package view;

import java.util.List;
import java.util.function.Consumer;

import bean.Apple;
import functional.SumConsumer;
import model.DataModel;
 
public class Ex02LocalVariable {
	
	private static Double total;
	public static void main(String[] args) {
	//viết hàm tính tổng cân nặng quả táo	
		
		var inventory = DataModel.getApples();
	}
	
	// Nếu sử dụng biến trong lamda thì biến trong lamda la final k thể thay đổi
	
	
	private static Double sumofWeight(List<Apple> inventory){
// Cách 1:
		
		//		Double sum = 0d;
//		for(var apple:inventory) {
//			sum = sum + apple.getWeight();
//		}
		
		// Cách 2: annoymous class
		inventory.forEach(new Consumer<Apple>() {
			@Override
			public void accept(Apple apple) {
//				sum = sum + apple.getWeight();
 total += apple.getWeight(); 
			}
		});
		
	// Cách 3: implements class
		inventory.forEach(new SumConsumer(total));
		return total;
	}
	// Sở dĩ k dùng được bởi khi sử dụng lamda biến tự động final và k dùng được vì khi dùng lamda 
	// giống như là đang tạo 1 class mới mà ta k để đưa biến cục bộ tự hàm A qua hàm B được và cũng
	// k thể thay đổi địa chỉ trong stack 
	// Ta phải đổi biến cục bộ thành biến toàn cục
	
	
}
