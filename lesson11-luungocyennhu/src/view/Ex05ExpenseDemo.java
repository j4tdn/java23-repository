package view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import bean.Dictionary;

public class Ex05ExpenseDemo {

	public static void main(String[] args) {
		Map<String, Double> expenses = new HashMap<>();
		
		expenses.put("Taxi đi học", 60000d);
		expenses.put("Ăn sáng", 20000d);
		expenses.put("Shopping", 700000d);
		expenses.put("Caffee", 65000d);
		
		printf("Các khoản chi tiêu", expenses);
		printf("Liệt kê thông tin các khoản chi lớn hơn 500 ngìn VNĐ", foundExpenses(expenses, 500000d));
		
		List<Map.Entry<String, Double>> entryListByKey = new ArrayList<>(expenses.entrySet());
        entryListByKey.sort((e1, e2) -> e1.getKey().compareTo(e2.getKey()));
        System.out.println("   - Sắp xếp các khoản chi theo thứ tự tăng dần của các khoản chi tiêu (key):");
        for (Map.Entry<String, Double> entry : entryListByKey) {
            System.out.println(entry);
        }

        List<Map.Entry<String, Double>> entryListByValue = new ArrayList<>(expenses.entrySet());
        entryListByValue.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));
        System.out.println("   \n- Sắp xếp các khoản chi theo thứ tự giảm dần bởi số tiền (value):");
        for (Map.Entry<String, Double> entry : entryListByValue) {
            System.out.println(entry);
        }
	}
	
	private static void printf(String prefix, Map<String, Double> exs) {
		System.out.println(prefix + " --> {");
		Set<Entry<String, Double>> entries = exs.entrySet();
		for(Entry<String, Double> entry: entries) {
			System.out.println("  " + entry);
		}
		System.out.println("}\n");
	}
	
	private static Map<String, Double> foundExpenses(Map<String, Double> exs, Double value) {
	    Map<String, Double> result = new HashMap<>();
	    Set<Entry<String, Double>> entries = exs.entrySet();
	    for (Entry<String, Double> entry : entries) {
	        if (entry.getValue() > value) {
	            result.put(entry.getKey(), entry.getValue()); 
	        }
	    }
	    return result; 
	}

}
