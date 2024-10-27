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
		models.put(null, "Chưa xác định");
		models.put(74, "Quảng Trị");
		models.put(73, "Quảng Bình");
		
		// Hỗ trợ tìm kiếm theo key
		
		// Tìm thành phố có key == 92
		String found = models.getOrDefault(98, "Không tìm thấy");
		System.out.println("Thành phố cần tìm : " + found);
	
		// Thêm phần tử
		// put: ghi đè value nếu key đã tồn tại
		// putIfAbsent: thêm mới entry nếu key chưa tồn tại
		models.putIfAbsent(75, "Thành phố Huế");
	
		// Xoá phần tử
		models.remove(43, "Đà Nẵng");
		generate("1.Data models" , models);

		// Sắp xếp các phần tử trong map theo k, v bất kỳ
		// VD: sắp xếp tăng dần theo value 
		// --> return new map
//		
//		Set<Entry<Integer, String>> entrySet = models.entrySet();
//		List<Entry<Integer, String>> entryList = new ArrayList<>(entrySet);
//		entryList.sort((e1, e2) -> {
//			return e1.getValue().compareTo(e2.getValue());
//		});
//		
//		Map<Integer, String> sortedMap = new LinkedHashMap<>();
//		for (Entry<Integer, String> entry : entryList) {
//			sortedMap.put(entry.getKey(), entry.getValue());
//		}
		
		generate("2. Data models (sorted value asc)", 
				sort(models, (e1, e2) -> e2.getValue().compareTo(e1.getValue()))
				);
	}
	
	private static <K, V> Map<K, V> sort(Map<K, V> source, Comparator<Entry <K, V>> comparator) {
		// B1: Chuyển đổi map --> set -> list --> sorted list
		List<Entry<K, V>> entryList = new ArrayList<>(source.entrySet());
		entryList.sort(comparator);

		Map<K, V> target = new LinkedHashMap<>();
		for (Entry<K, V> entry : entryList) {
			target.put(entry.getKey(), entry.getValue());
		}
		return target;
	}
	
	private static <K, V> void generate(String prefix, Map<K, V> map) {
		System.out.println(prefix + "{");
		Set<Entry<K, V>> entries = map.entrySet();
		for (Entry<K, V> entry : entries) {
			System.out.println("    +  " + entry);
		}
		System.out.println("}\n");
	}
}
