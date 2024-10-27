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

public class Ex02MapOperation {
	
	public static void main(String[] args) {
		Map<Integer, String> models = new HashMap<>();
		
		models.put(92, "Quảng Nam");
		models.put(43, "Đà Nẵng");
		models.put(75, "Thừa Thiên Huế");
		models.put(74, "Quảng Trị");
		models.put(73, "Quảng Bình");
		
		// Hỗ trợ tìm kiếm theo KEY
		
		// Tìm thành phố có K = 92
		String found = models.getOrDefault(73, "Ko tìm thấy");
		System.out.println("Thành phố cần tìm: " + found);
		
		// thêm phần tử: 
		// put: nếu đã tồn tại KEY, sẽ ghi đè
		// putIfAbsent: thêm  mới Entry nếu KEY ch tồn tại
		models.putIfAbsent(75, "Thành phố Huế");
		
		// Xóa phần tử: 
		// + xóa theo key
		// + xóa theo key + value
		models.remove(43, "ĐN");
		
		generate("1. Data Models", models);
		
		
		
		// Sắp xếp các phần tử tron map theo k, v bất kỳ
		// VD: Sắp xếp tăng dần theo value
		// -> return new map
		
//		Set<Entry<Integer, String>> entrySet = models.entrySet();
//		List<Entry<Integer, String>> entryList = new ArrayList<>(entrySet);
//		entryList.sort((e1, e2) -> {
//			return e1.getValue().compareTo(e2.getValue());
//		});
//		Map<Integer, String> sortedMap = new LinkedHashMap<>();
//		for (Entry<Integer, String> entry: entryList) {
//			sortedMap.put(entry.getKey(), entry.getValue());
//		}
		
		generate("2. Data Models(sorted by value)",
				sort(models, (e1, e2) -> e2.getValue().compareTo(e1.getValue()))
				);
	}
	
	private static <K, V> Map<K, V> sort(Map<K, V> source, Comparator<Entry<K, V>> comparator) {		
		// B1: Chuyển đổi map -> set -> list -> sort list
		List<Entry<K, V>> entryList = new ArrayList<>(source.entrySet());
		entryList.sort(comparator);
		
		// B2: đưa các phần tử từ sorted list vào LinkedHashMap
		Map<K, V> target = new LinkedHashMap<>();
		
		// for (var entry: entryList) {
		for (Entry<K, V> entry: entryList) {
			target.put(entry.getKey(), entry.getValue());
		}
		return target;
	}
	
	private static <K, V> void generate(String prefix, Map<K, V> map) {
		System.out.println(prefix + " {");
		
		// vì map k phải con collections, mà collections mới hỗ trợ hàm for each, ...
		
	//	var entries = map.entrySet();
		Set<Entry<K, V>> entries = map.entrySet();
		
		for(Entry<K, V> entry: entries) {
	//  for(var entry: entries) {
			System.out.println("   + " + entry);
		}
		System.out.println("}\n");
	}

}
