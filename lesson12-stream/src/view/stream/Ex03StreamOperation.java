package view.stream;

import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

import bean.Dish;
import model.DataModel;
import utils.CollectionUtils;

public class Ex03StreamOperation {

	/*
	  Trong CTDL Stream<T>, từ source chuyển sang Stream<T>
	  
	  + Nếu gọi hàm mà vẫn tả về KDL Stream --> Intermediate Operation
	  --> lazy operation
	  --> Các hàm này sẽ chỉ dc thực thi khi có terminal operation được gọi
	  
	  
	  + Nếu gọi hàm mà tả về KDL khác không phải là Stream --> Terminal Operation
	 */
	public static void main(String[] args) {
		
		System.out.println("Start App ...");
		// Liệt kê tên 3 đĩa thức ăn có lượng calo > 200
		
		var menu = DataModel.getDishes(); // n phần tử
		
		// B1: Duyệt n phần tử tìm đĩa có lượng calo > 200
		// B2: Lấy 3 đĩa đầu tiên
		// B3: Lấy tên 3 đĩa đó
		
		var data = menu.stream()
			.filter(d -> {
				System.out.println("filtering: " + d);
				return d.getCalories() > 200;
			})
			.map(d -> {
				System.out.println("mapping: " + d + "\n");
				return d.getName(); //Stream<String>
			})
			.limit(3)
			.collect(Collectors.toList()); // List<String>
		
		CollectionUtils.generate("Data", data);
		System.out.println("Finished ...");
	}
	
}
