package view.stream;

import java.util.List;
import java.util.Optional;

import bean.Dish;
import model.DataModel;

public class Ex07StreamReduce {
		/*
		 * VD1 : CHo sanh sách số nguyên
		 * + Tìm tổng các phần tử trong mảng
		 * + Tìm max của mảng
		 * 
		 * VD2 : 
		 * + Tìm tổng lượng calo có trong menu]
		 * + Tìm đĩa thức ăn có lượng calo cao nhất
		 * 
		 * 
		 * 
		 */
	
	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(7, 82, 22, 14, 20);
		
		Integer   sum = numbers.stream()
				.reduce(0, (result,number) -> result + number);
			System.out.println("1. tong " + sum);
		
		Integer max = numbers.stream()
						.reduce(Integer.MIN_VALUE, Integer:: max);
			System.out.println("2. MAX " + max);
		
			// khi chưa biết identity truyền vào là gì dùng Optional
			// VD : Tìm item thỏa mã --> identity là null thì k cần truyền
			Optional<Integer> optmin = numbers.stream().reduce(Integer :: min);
			optmin.ifPresent(min -> System.out.println("Gia tri min " + min));
			
			List<Dish> menu = DataModel.getDishes();
			System.out.printf("Tổng lượng calo có trong menu = %s",
					menu.stream().mapToDouble(Dish::getCalories).sum());
			System.out.println("\n");
			System.out.printf("Tìm lượng calo cao nhất có trong menu = %s",
					menu.stream().mapToDouble(Dish::getCalories).max().orElse(0d));
			System.out.println("\n");
			System.out.printf("Tìm đĩa thức ăn có lượng calo cao nhất có trong menu = %s",
					menu.stream().reduce((result, elements) -> 
						result.getCalories() < elements.getCalories() ? elements:result)
					);
			
			
		
	}
}
