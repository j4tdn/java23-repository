package view;

import java.util.List;
import java.util.function.Consumer;

import bean.Apple;
import functional.SumConsumer;

public class Ex02LocalVariable {
	
	private static Double total;

	public static void main(String[] args) {
		
		// Viết hàm tính tổng cân nặng của các quả táo trong kho hang
		
	}
	
	// Ex02LocalVariable --> sumOfWeight() --> sum(local variable
	// Sumconsumer		 --> accept --> 
	
	private static Double sumOfWeight(List<Apple> inventory) {
		Double sum = 0d;
		
		sum = 10d;
		
//		for(Apple apple : inventory) {
//			sum += apple.getWeight();
//		}
		
		// Vì sao trong lambda, khi sử dụng biên cục bộ thì biến đó là final hoặc tự chuyển
		// qua final
		
		// Về bản chất, khi biến cục bộ sử dụng trong lamda thì thật ra biến cục bộ đó đang được
		// sử dụng ở 1 class khác
		
		// Dúng nguyên tắc là không cho phép, nhung khi dùng lambda hoặc anonymous class thì Java
		// vẫn cho phép nhưng yêu cầu final
		
		// 1. lambda
		inventory.forEach(apple -> {
			// thực tế đang pas biến sum qua hàm accept
			// sum += apple.getWeight();
		});
		
		// 2. anonymous class
		inventory.forEach(new Consumer<Apple>() {
			@Override
			public void accept(Apple apple) {
				// sum += apple.getWeight();
				total = total + apple.getWeight();
			}
		});
		
		// 3. implementation class
		inventory.forEach(new SumConsumer(sum));
		
		sum = 20d;
		
		return sum;
	}
	
}
