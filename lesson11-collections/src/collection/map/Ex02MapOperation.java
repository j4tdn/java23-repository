package collection.map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex02MapOperation {
	
	public static void main(String[] args) {
		Map<Integer, String> models = new HashMap<>();
		
		models.put(92,"Quảng Nam");
		models.put(43,"Đà Nẵng");
		models.put(75,"Thừa Thiên Huế");
		models.put(74,"Quảng Trị");
		models.put(73,"Quảng Bình");
		
		// Hỗ trợ tìm kiếm theo KEY
		
		// Tìm thành phố có K = 92
		String found = models.getOrDefault(73, "Không tìm thấy");
		System.out.println("Thành phố cần tìm: " + found);
		
		// Thêm phần tử
		// put: ghi đè value nếu key đã tồn tại
		// putIfAbsent: thêm mới entry nếu key chưa tồn tại
		models.putIfAbsent(72, "Thành phố Huế");
		
		// Xóa phần tử
		// models.remove(43, "Đà Nẵng");
	
		
		generate("1.Data Models", models);
		// Arrays.sort
		// Collections.sort
		// list.sort(Comparator<T>)
		// --> void
		
		// Sắp xếp các phần tử trong map theo k, v bất kỳ
		// VD: sắp xếp tăng dần theo value
		// --> return new map
		
		var entrySet = models.entrySet();
		var entryList = new ArrayList<>(entrySet);
		entryList.sort((e1, e2) -> e1.getValue().compareTo(e2.getValue()));
		
		Map<Integer, String> sortedMap = new LinkedHashMap<>();
		for (var entry: entryList) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		
		generate("2. Data Models(sorted by value)", 
			sort(models, (e1, e2) -> e2.getValue().compareTo(e1.getValue()))
	    );
	}
	
	private static <K, V> Map<K, V> sort(Map<K, V> source, Comparator<Entry<K, V>> comparator){
		// B1: chuyển đổi map -> set -> list -> sorted list
		List<Entry<K, V>> entryList = new ArrayList<>(source.entrySet());
		entryList.sort(comparator);
		
		// B2: đưa các phần tử sorted list vào LinkedHashMap
		Map<K, V> target = new LinkedHashMap<>();
		for (Entry<K, V> entry: entryList) {
			target.put(entry.getKey(), entry.getValue());
		}
		return target;
	}
	
	private static <K, V> void generate(String prefix, Map<K, V> map) {
		System.out.println(prefix + " { ");
		Set<Entry<K, V>> entries = map.entrySet();
		for (Entry<K, V> entry: entries) {
			System.out.println("  + " + entry);
		}
		System.out.println("}\n");
	}
	
}
