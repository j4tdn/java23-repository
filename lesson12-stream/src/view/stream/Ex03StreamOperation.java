package view.stream;

import java.util.stream.Collectors;

import model.DataModel;
import utils.CollectionUtils;

public class Ex03StreamOperation {
	
	/*
	 Trong CTDL Stream<T>, từ source chuyển sang Stream<T>
	 
	 + Nếu gọi hàm vẫn trả về KDL Stream -> Intermediate Operation
	 	--> lazy operation
	 	--> các hàm này chỉ được thực thi khi có terminal operation được gọi 
	 	
	 + Nếu gọi hàm mà trả về KDL khác ko phải là Stream --> Terminal Operation
	 
	 */
	
	public static void main(String[] args) {
		System.out.println("Start App ...");
		System.out.println("\n========================");
		
		// Liệt kê tên 3 đĩa thưcs ăn có lượng calo > 200
		
		var menu = DataModel.getDishes();
		
		// B1: duyệt n phần tử tìm đĩa có lượng calo > 200
		// B2: lấy 3 đĩa đầu tiên
		// B3: lấy tên 3 đĩa đó
		
		var data = menu.stream() // Stream<Dish>
			.filter(d -> {
				System.out.println("filtering: " + d);
				return d.getCalories() > 300;
			}) // Stream<Dish> (intermediate operation)
			.map(d -> {
				System.out.println("mapping: " + d + "\n");
				return d.getName();
			}) // Stream<String>
			.limit(3) // Stream<String>
			.collect(Collectors.toList()); // List<String>
		
		CollectionUtils.generate("Data", data);
		
		System.out.println("\n========================");
		System.out.println("Finish App ...");
		
	}
	
}
