package view;

import java.util.List;
import java.util.function.Consumer;

import bean.Apple;
import functional.SumConsumer;

public class Ex02LocalVariable {

	private static Double total;
	public static void main(String[] args) {
	
		// Viết hàm tính tổng cân nặng của các quả táo trong kho hàng
	}
	
	// Ex02LocalVariable --> sumOfWeights() --> sum(local variable)
	
	private static Double sumOfWeights(List<Apple> inventory) {
		Double sum = 0d;
		
		sum = 10d;
//		for (Apple apple : inventory) {
//			sum = sum + apple.getWeight()
//		}
		
		// Vì soa trong labmdba khi sử dụng biến cục bộ thì biến đó
		// là final hoặc tự chuyển thành final
		
		// Về bản chất khi biến cục bộ sử dụng trong lambda, thật
		// ra biến cục bộ đó đang được sử dụng ở 1 class khác
		
		// Đúng nguyên tắc ko cho phép, như khi dùng lambda hoặc anonymous class
		// thì Java vẫn cho phép nhưng yêu cầu là final
//		1.lambda
		inventory.forEach(apple -> {
			// Thực tế pass biến sum qua hàm accept
//			sum = sum + apple.getWeight();
		});
		
		// 2. anonymous class
		inventory.forEach(new Consumer<Apple>() {
			@Override
			public void accept(Apple t) {
//				sum = sum + t.getWeight();
				total = total + t.getWeight();
			}
		});
		
		// 3.implementation class
		inventory.forEach(new SumConsumer(sum));
		sum = 20d;
		
		return sum;
	}
	
	
}
