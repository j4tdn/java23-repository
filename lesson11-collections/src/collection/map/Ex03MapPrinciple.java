package collection.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Employee;

public class Ex03MapPrinciple {
	
	/*
	 List#remove
	 List#contains
	 --> override equals
	 
	 
	 Cơ chế kiểm tra KEY đã tồn tại chưa của Map<K, V>
	 
	 Để kiểm tra một entry đã tồn tại trong cái map chưa
	 Duyệt từng entry trong map kiểm tra
	 + có entry nào có key equals với key của entry mới chưa
	 + có entry nào có key.hashcode trùng với hash code của entry mới chưa
	 
	 equals: so sách địa chỉ
	 hashcode: lấy ra địa chỉ
	 
	 Với các CTDL liên quan đến hashing, hashcode là công thức để hashing từ giá trị
	 của đối tượng ra mã băm(dãy số nguyên)
	 
	 */
	
	public static void main(String[] args) {
		
		var map = mockData();
		
		map.put(
			new Employee(3, "Manager 3", 300d), List.of(new Employee(31, "E31", 31d))
		);
		
		map.put(
			new Employee(1, "Manager 1", 100d), List.of(new Employee(13, "E13", 13d))
		);
		
		System.out.println("size --> " + map.size());
		
		for(var key: map.keySet()) {
			System.out.println(key);
		}
	}
	
	private static Map<Employee, List<Employee>> mockData() {
		Map<Employee, List<Employee>> result = new HashMap<>();
		
		result.put(
			new Employee(1, "Manager 1", 100d),
			List.of(new Employee(11, "E11", 11d), new Employee(12, "E12", 12d))
		);
		
		result.put(
			new Employee(2, "Manager 2", 200d),
			List.of(new Employee(21, "E21", 21d), new Employee(22, "E22", 22d))
		);
		
		return result;
	}
	
}
