package view.stream;

import java.util.stream.Collectors;

import bean.Dish;
import model.DataModel;
import utils.CollectionUtils;

public class Ex03StreamOperation {

	/*
	 * Trong CTDL Stream<T>, từ source chuyển sang Stream<T>
	 * 
	 * + Nếu gọi hàm mà vẫn trả về KDL Stream -> Intermediate Operation --> lazy
	 * operation --> các hàm này sẽ chỉ được thực thi khi có terminal operation được
	 * gọi
	 * 
	 * + Nếu gọi hàm mà vẫn trả về KDL khác không phải Stream -> Terminal Operation
	 * 
	 */

	public static void main(String[] args) {

		System.out.println("Start App ...");
		System.out.println("============================\n");
		// Liệt kê tên 3 đĩa thức ăn có lượng calo > 200

		var menu = DataModel.getDishes(); // n phần tử

		// B1: duyệt n phần tử tìm đĩa có lượng calo > 200
		// B2: lấy 3 đĩa đầu tiên
		// B3: lấy tên 3 đĩa đó

		var data = menu.stream() // Stream<Dish>
				.filter(d -> {
					System.out.println("filtering: " + d);
					return d.getCalories() > 300;
				}) // Stream<Dish> -> Intermediate Operation
				.map(d -> {
					System.out.println("mapping: " + d + "\n");
					return d.getName();
				}) // Stream<String>
				.limit(3) // Stream<String>
				.collect(Collectors.toList());

		CollectionUtils.generate("Data", data);

		System.out.println("\n======================");
		System.out.println("Finished ...");

	}

}