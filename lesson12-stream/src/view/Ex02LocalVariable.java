package view;

import java.util.List;
import java.util.function.Consumer;

import bean.Apple;
import functional.SumConsumer;

public class Ex02LocalVariable {

	private static Double total;
	public static void main(String[] args) {
		
		// Viet ham tinh tong can nang cua cac qua tao trong khoa hang
	}
	
	private static Double sumOfWeights(List<Apple> inventory) {
		Double sum = 0d;
		
		sum = 10d;
		// Vì sao trong lambda khi sử dụng biến cục bộ thì biến đó là final hoặc tự chuyển sang final
		// Về bản chất khi biến cục bộ sử dụng trong lambda hoặc anonymous class thì Java vẫn cho phép nhưng yêu cầu final
		
		for (Apple apple : inventory) 
			sum += apple.getWeight();
		// 1. lambda
		inventory.forEach(apple -> {
//			sum += apple.getWeight(); 
		});
		
		// 2. anonymous class
		inventory.forEach(new Consumer<Apple>() {
			@Override
			public void accept(Apple apple) {
				// sum += apple.getWeight();
				total += apple.getWeight();
			}
		});
		
		// 3. implements class
		inventory.forEach(new SumConsumer(sum));
		
		sum = 20d;
		
		return sum;
	}
}
