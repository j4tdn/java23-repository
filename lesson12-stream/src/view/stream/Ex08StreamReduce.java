package view.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import bean.Dish;
import model.DataModel;

public class Ex08StreamReduce {

	/*
	  Ví dụ 1 : Cho danh sách các số nguyên
	  + Tìm tổng các phần tử trong mảng
	  + Tìm giá trị lớn nhất của các phần tử trong mảng
	  + Tìm giá trị nhỏ nhất
	  

	  VD 2: 
	  + Tìm tổng lương calo có trong menu
	  + Tìm lượng calo lớn nhất trong menu
	  + Tìm đĩa thức ăn có lượng calo lớn nhất
	 */
	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(7, 82, 22, 14, 20);
		
		Integer sum = numbers.stream()
			.reduce(0, (result, element) -> result + element);
		
		System.out.println("Tổng --> " + sum);
		
//		Integer max = numbers.stream()
//							.reduce(Integer.MIN_VALUE, (result, element) -> {
//								if (result < element) {
//									return element;
//								}
//								return result;
//							});
		Integer max = numbers.stream()
							.reduce(Integer.MIN_VALUE, Integer::max);
		System.out.println("Gía trị lớn nhất: " + max);
		
		Optional<Integer> otpMin = numbers.stream().reduce(Integer::min); // khi chưa biết identity giá trị ban đầu là bao nhiêu, và nó sẽ là kiểu optional tại vì khi chưa bit giá trị thì nó cũng có thể là null
		otpMin.ifPresent(min -> System.out.println("Gía trị nhỏ nhất: " + min));
		
		// int, long, double
		// Stream<Integer> --. IntStream
		List<Dish> menu = DataModel.getDishes();
		System.out.printf(
				"Tổng lượng calo có trong menu = %s",
				menu.stream()
				.mapToDouble(Dish::getCalories) // DoubleStream
				.sum()
		);
		
		System.out.printf(
				"\nTổng lượng calo cao nhất có trong menu = %s",
				menu.stream()
				.mapToDouble(Dish::getCalories) // DoubleStream
				.max()
				.orElse(0d) // nếu có thì in max, ko có in ra 0d
		);
		
		System.out.printf(
				"\nTìm đĩa có lượng calo cao nhất trong menu = %s",
				menu.stream()
				.reduce((result, element) -> result.getCalories() < element.getCalories() ? element : result)
		);

	}
	
	/* code reduce
	 *     T result = identity;
     *     for (T element : this stream)
     *         result = accumulator.apply(result, element)
     *     return result;
	 */
}