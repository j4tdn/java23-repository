package collection.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Employee;

public class Ex03MapPrinciple {
	public static void main (String[] args) {
		var map = mockData();
		
		
		
	}
	
	private static Map<Employee, List<Employee>> mockData() {
		Map <Employee, List<Employee>> result = new HashMap <> ();
		
		result.put( new Employee (1, "M1", 100d), 
					List.of(new Employee(11, "E11", 10d), new Employee (12, "E12" , 11d))
		);
		
		result.put( new Employee (2, "M2", 200d), 
				List.of(new Employee(13, "E13", 12d), new Employee (14, "E14" , 13d))
	);
		
		return result;
	} 
}
