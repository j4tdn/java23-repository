package view.stream;

import static java.util.Comparator.*;
import java.util.List;
import java.util.Optional;

import bean.Dish;
import model.DataModel;

public class Ex08StreamReduce {

	/*
	 Ví dụ 1: Cho danh sách số nguyên
	 + Tìm tổng các phần tử trong mảng
	 + Tìm giá trị lớn nhất của các phần tử trong mảng
	 
	 Ví dụ 2:
	 + Tìm tổng lượng calo có trong menu
	 + Tìm lượng calo lớn nhất trong menu
	 + Tìm đĩa thức ăn có lượng calo lớn nhất --> Dish
	 */
	
	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(7, 82, 22, 14, 20);
		
		Integer sum = numbers.stream()
							 .reduce(0, Integer::sum);
		System.out.println("Tổng --> " + sum);
	
		Integer max = numbers.stream()
							 .reduce(Integer.MIN_VALUE, Integer::max);
		System.out.println("Giá trị lớn nhất max: " + max);
	
		// Khi chưa biết identity truyền vào là gì
		// VD: Tìm item thỏa mãn --> identity là null thì ko cần truyền
		
		Optional<Integer> optMin = numbers.stream().reduce(Integer::min);
		optMin.ifPresent(min -> System.out.println("Giá trị lớn nhất min: " + min));

		// int, long, double
		// Stream<Integer> --> IntStream
		
		List<Dish> menu = DataModel.getDishes();
		System.out.printf(
				"Tìm tổng lượng calo có trong menu = %s",
				menu.stream()
					.mapToDouble(Dish::getCalories) // DoubleStream
					.sum()
		);
		
		System.out.printf(
				"\nTìm lượng calo cao nhất có trong menu = %s",
				menu.stream()
					.mapToDouble(Dish::getCalories) // DoubleStream
					.max()
					.orElse(0d)
		);
		
		System.out.printf(
				"\nTìm đĩa lượng calo cao nhất có trong menu = %s",
				menu.stream()
					.sorted(comparing(Dish::getCalories, reverseOrder()))
					.findFirst()
					.orElse(null)
		);	
		
	}
	
	/*
	 		T result = identity;
	 *		for (T element : this stream)
	 *			result = accumulator.apply(result, element)
	 *		return result;
	 *
	 */
	
}
