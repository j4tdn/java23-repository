package collection.map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Ex02MapOperations {
	
	
	public static void main(String[] args) {
		
		Map<Integer, String> models = new HashMap<>();
		
		models.put(92, "Quảng Nam");
		models.put(43, "Đà Nẵng");
		models.put(75, "Thừa Thiên Huế");
		models.put(null, "Chưa xác định");
		models.put(74, "Quảng Trị");
		models.put(73, "Quảng Bình");
		
		System.out.println("models size: " + models.size());
		
		// Hỗ trợ tìm kiếm theo KEY
		
		// Tìm thành phố có K = 92
		String found = models.getOrDefault(73, "Không tìm thấy");
		System.out.println("Thành phố cần tìm: " + found);
		
		// Thêm phần tử
		// put: ghi đè value nếu key đã tồn tại
		// putIfAbsent: thêm mới entry nếu key chưa tồn tại
		models.putIfAbsent(75, "Thành Phố Huế");
		
		// Xóa phần tử
		// models.remove(43, "Đà Nẵng");
		
		generate("1. Data Models", models);

		// Arrays.sort
		// Collection.sort
		// List.sort(Comparator<T>)
		// --> void
		
		// Sắp xếp các phần tử trong map theo K, V bất kỳ
		// VD: sắp xếp tăng dần theo value
		// --> return new map
		
		
		generate("2. Data Models (sorted by value)", 
				sort(models, (e1, e2) -> e2.getValue().compareTo(e1.getValue()))
		);
		
	}
	
	private static <K, V> Map<K, V> sort(Map<K, V> source, Comparator<Entry<K, V>> comparator) {
		
		// B1: Chuyển đổi map -> set -> list -> sorted list
		var entryList = new ArrayList<>(source.entrySet());
		entryList.sort(comparator);
		
		// B2: Đưa các phần tử từ sortedList vào LinkedHashMap
		Map<K, V> target = new LinkedHashMap<>();
		for(var entry : entryList) {
			target.put(entry.getKey(), entry.getValue());
		}
		
		return target;
	}

	private static <K, V> void generate(String prefix, Map<K, V> map) {
		System.out.println(prefix + " --> {");
		var entries = map.entrySet();
		
		for(var entry : entries) {
			System.out.println("   + " + entry);
		}
		System.out.println("}\n");
	}
	
}