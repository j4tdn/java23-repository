package collection.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Employee;

public class Ex03MapPrinciple {
	
	/*
	   List#remove
	   List#contains
	   --> override hàm equals
	   
	   
	   Cơ chế kiểm tra KEY đã tồn tại chưa của Map<K, V>
	   
	   Để kiểm tra 1 entry đã tồn tại trong cái map chưa
	   Duyệt từng entry trong map kiểm tra
	   + có entry nào có key equals với key của entry MỚI chưa
	   + có entry nào có key.hashcode trùng với hashcode của entry mới chưa
	   
	   equals: so sánh địa chỉ
	   hashcode: lấy ra địa chỉ
	   
	   Với các C
	   
	 */
	public static void main(String[] args) {
		
		Map<Employee, List<Employee>> map = mockData();
		map.put(new Employee(3, "Manager 3", 300d), List.of(new Employee(31, "E31", 31d)));
		
		map.put(new Employee(1, "Manager 1", 100d), List.of(new Employee(13, "E13", 13d)));
		
		System.out.println("size --> " + map.size());
		
		for (Employee key: map.keySet()) {
			System.out.println(key);
		}
 	}
	
	private static Map<Employee, List<Employee>> mockData() {
		Map<Employee, List<Employee>> result = new HashMap<>();
		
		result.put(new Employee(1, "Manager 1", 100d),
				List.of(new Employee(11, "E11", 22d), new Employee(12, "E12", 12d)));
		
		result.put(new Employee(2, "Manager 2", 100d),
				List.of(new Employee(21, "E21", 21d), new Employee(22, "E22", 22d)));
		return result;
	}

}
