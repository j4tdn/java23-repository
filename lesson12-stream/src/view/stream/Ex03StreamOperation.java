package view.stream;

import java.util.Collections;
import java.util.stream.Collectors;

import bean.Dish;
import model.DataModel;

public class Ex03StreamOperation {
	/*
	  Trong CTDL Stream <T> , từ source chuyển sang Straeam<T>
	  
	  + Nếu gọi hàm mà vẫn trả về KDL Stream --> Interme
	 */
	public static void main(String[] args) {
		System.out.println("Start APP .. ");
		var menu = DataModel.getDishes();
		menu.stream() // Stream<Dish>
			.filter(d ->{
				System.out.println("filterding " + d);
				return d.getCalories() > 200;
				
			})
			.map(d -> {
				System.out.println("mapping " + d + "\n");
				return d.getName();
			})
			.limit(3)
			.collect(Collectors.toList());
		System.out.println("Finished .. ");
	}
}
