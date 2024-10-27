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

	/*
	 * Bài toán quản lý biển số xe, tỉnh thành phố --List<VehicleModel> --> Map<K,V>
	 * K: Mã số V: Thành phố
	 * 
	 * + HashMap: + K duy trì đúng thứ tự các phần tử đưa vào + Cho phép Key = NULL
	 * 
	 * + LinkedHashMap sẽ tự động sắp xếp các phần tử theo thứ tự đưa vào
	 * 
	 * + TreeMap: - Tự động sắp xếp các phần tử theo thứ tự tăng dần theo Key - Muốn
	 * giảm dần thì mình sẽ viết lại
	 */

	public static void main(String[] args) {
//			Map<Integer, String> models = new HashMap<>();
//			Map<Integer, String> models = new LinkedHashMap<>();
		Map<Integer, String> models = new TreeMap<>((k1, k2) -> {
			if (k1 == null) {
				return -1;
			}
			if (k2 == null) {
				return 1;
			}
			// key descending (giảm dần)
			return k2.compareTo(k1);

		});

		models.put(92, "Quảng Nam");
		models.put(43, "Đà Nẵng");
		models.put(75, "Thừa Thiên Huế");
		models.put(74, "Quảng Trị");
		models.put(73, "Quảng Bình");

		System.out.println("Models size: " + models.size());
		generate("1.DataModels", models);

		// Map: Hỗ trợ tìm kiếm theo key
		// Ví dụ như tìm thành phố có key = 92
		String found = models.getOrDefault(92, "Chưa xác định");
		String find = models.getOrDefault(98, "Chưa xác định");
		System.out.println("Thành phố cần tìm: " + found);
		System.out.println("Thành phố cần tìm: " + find);

		// Thêm phần tử
//	               models.put(75, "Thành Phố Huế");
		// put ---> Nếu key = 75 đã tồn tại thì nó sẽ ghi đè
		models.putIfAbsent(75, "Thành Phố Huế");
		// putIfAbsent --> thêm mới entry nếu key chưa tồn tại

		// Xóa phần tử
//	               models.remove(43, "Đà Nẵng");
//	               generate("2. DataModels sau khi xóa: ", 	models);

		// Sắp xếp các phần tử trong map theo k,v bất kỳ
		// Sắp xếp tăng dần theo value
		generate("3.DataModels(sorted by value)", sort(models, (e1, e2) -> e2.getValue().compareTo(e1.getValue())));

	}
//		Set<Entry<Integer, String>> entrySet = models.entrySet();
//		List<Entry<Integer, String>> entryList = new ArrayList<>(entrySet);
//		// Map java k có hỗ trợ hàm sort
//		// Ta sẽ đổi Map thành List và dùng List sort
//		entryList.sort((e1, e2) -> {
//			return e1.getValue().compareTo(e2.getValue());
//		});
	//
//		Map<Integer, String> sortedMap = new LinkedHashMap<>();
//		for (Entry<Integer, String> entry : entryList) {
//			sortedMap.put(entry.getKey(), entry.getValue());
//		}

	private static <K, V> Map<K, V> sort(Map<K, V> source, Comparator<Entry<K, V>> comparator) {
		List<Entry<K, V>> entryList = new ArrayList<>(source.entrySet());
		entryList.sort(comparator);

		// B2: Đưa các phần tử từ sorted List vào LinkedHashMap
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
			System.out.println("  +" + entry);
		}
		System.out.println("}\n");
	}
}
