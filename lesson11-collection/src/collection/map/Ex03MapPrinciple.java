package collection.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Employee;

public class Ex03MapPrinciple {
	/*
	 * List#remove
	 * list#contains
	 * --> override equals
	 * 
	 * cơ chế kiểm tra KEY đã tồn tại chưa của MAP
	 * 
	 * Để kiểm tra 1 entry đã tồn tại trong map chưa
	 * duyệt từng entry trong map kiểm tra
	 * + có entry nào có key equals với key của entry mới
	 * + có entry nào có key.hashcode trùng với hashcode của entry mới
	 * 
	 * -> chỉ so sánh hashcode
	 */
	
	public static void main(String[] args) {
		Map<Employee, List<Employee>> map = mockData();
		
		map.put(
			new Employee(2, "Manager 2", 100d),
			List.of(new Employee(21, "E121", 11d), new Employee(22, "E122", 12d)));

		System.out.println("size --> " + map.size());

		
	}

	private static Map<Employee, List<Employee>> mockData() {
		Map<Employee, List<Employee>> result = new HashMap<Employee, List<Employee>>();

		result.put(new Employee(1, "Manager 1", 100d),
				List.of(new Employee(11, "E11", 11d), new Employee(12, "E12", 12d)));
		result.put(new Employee(2, "Manager 2", 100d),
				List.of(new Employee(21, "E121", 11d), new Employee(22, "E122", 12d)));

		return result;
	}
}
