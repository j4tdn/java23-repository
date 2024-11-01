package view;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Ex05Expenses {

	public static void main(String[] args) {

		Map<String, Double> expenses = new TreeMap<>();

		mockData(expenses);
		
		generate("Danh sách chi tiêu", expenses);
		
		System.out.print("1. Liệt kê thông tin các khoản chi lớn hơn 500 nghìn VNĐ\n--> ");
		findExpensesWithValue(expenses);
		
		generate("\n2. Sắp xếp các khoản chi theo thứ tự tăng dần của các khoản chi tiêu", expenses);
		
		generate("3. Sắp xếp các khoản chi theo thứ tự giảm dần bởi số tiền", sortToValueDesc(expenses));
	}

	private static void findExpensesWithValue(Map<String, Double> map){
		for (Entry<String, Double> entry : map.entrySet()) 
			if(entry.getValue() > 500000d)
				System.out.println(entry);
	}
	
	private static Map<String, Double> sortToValueDesc(Map<String, Double> map) {
		return new TreeMap<>((v1, v2) -> {
			return v2.compareTo(v1);
		});
	}
	
	private static Map<String, Double> mockData(Map<String, Double> map) {
		map.put("Tiền thuê nhà", 1500000d);
		map.put("Tiền điện", 120000d);
		map.put("Tiền nước", 35000d);
		map.put("Mua thực phẩm", 200000d);
		map.put("Giải trí", 80000d);
		map.put("Chi phí xăng xe", 60000d);
		map.put("Chi phí bảo hiểm", 150000d);
		map.put("Mua sắm quần áo", 75000d);
		map.put("Tiền internet", 45000d);
		map.put("Đặt vé xem phim", 15000d);
		return map;
	}
	
	private static <K, V> void generate(String prefix, Map<K,V> map) {
		System.out.println(prefix + " --> {");
		Set<Entry<K, V>> entries = map.entrySet();
		for(Entry<K, V> entry: entries)
			System.out.println(" + " + entry);
		System.out.println("}\n");
	}
}
