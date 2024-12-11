package view.stream;

import java.util.stream.Collectors;

import bean.Dish;
import model.DataModel;
import utils.CollectionUtils;

public class Ex03StreamOperation {

	/*
	 Trong CTDL Stream<T>,từ source chuyển sang Stream<T>
	 Nếu gọi hàm mà vẫn trả về KDL Stream --> Intermediate Operation 
	 ---> Lazy operation 
	 ---> Các hàm này sẽ chỉ được thực thi khi có terminal operation được gọi 
	 
	 + Nếu gọi hàm mà trả về KDL k phải là Stream --> Terminal Stream
	 
	 */
	public static void main(String[] args) {
		// Liệt kê tên 3 đĩa thức ăn có calo trên 200;
		var menu = DataModel.getDishes();
		
		//B1: Duyệt n phần tử tìm đĩa thức ăn có calo trên 200
		//B2: Lấy 3 đĩa thức ăn 
		//B3: Lấy tên 3 đĩa
		
		System.out.println("Start At: ");
            System.out.println("\n=========================\n");
            
		menu.stream()
		             .filter(d -> {
		            	System.out.println("Filtering: " +d);
		            	return d.getCalories() > 300;
		             })		            	 
//		             .map(Dish::getName) //Stream<String>
		             .map(d -> {
		            	 System.out.println("Mapping: " +d + "\n");
		            	 return d.getName(); 
		            	 
		             })
		             .limit(3) // limit(n) chỉ lấy ra n phần tử
		             .collect(Collectors.toList());
		
		CollectionUtils.generate("Data", menu);
       
		System.out.println("\n=========================\n");
		System.out.println("Finished At: ");

		
		
		
		
	}
}
