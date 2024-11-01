package view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import model.DataModel;

public class Ex05SpendingManagement {

	public static void main(String[] args) {
		
        Map<String, Double> expenses = DataModel.mockSpending();

        // Liệt kê thông tin các khoản chi lớn hơn 500 nghìn VNĐ
        System.out.println("1. Expenses greater than 500000 VND:");
        
        for (Map.Entry<String, Double> entry : expenses.entrySet()) {
            if (entry.getValue() > 500000) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " VND");
            }
        }

        // Sắp xếp các khoản chi theo thứ tự tăng dần của các khoản chi tiêu(key).
        System.out.println("\n2. Expenses sorted by spending (asc):");
        
        List<String> sortedKeys = new ArrayList<>(expenses.keySet());
      
        Collections.sort(sortedKeys);
        
        for (String key : sortedKeys) {
            System.out.println(key + ": " + expenses.get(key) + " VND");
        }

        // Sắp xếp các khoản chi theo thứ tự giảm dần bởi số tiền(value).
        System.out.println("\n3. Expenses sorted by amount (desc):");
        
        List<Map.Entry<String, Double>> sortedEntries = new ArrayList<>(expenses.entrySet());
        
        sortedEntries.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));
        
        for (Map.Entry<String, Double> entry : sortedEntries) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " VND");
        }
		
	}
	
}
