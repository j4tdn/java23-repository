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

public class Ex01MapBasicDemo {

	public static void main(String[] args) {
//		Map<Integer, String> models = new HashMap<>();
//		Map<Integer, String> models = new LinkedHashMap<>();
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
               models.put(75, "Thành Phố Huế");
		// put ---> Nếu key = 75 đã tồn tại thì nó sẽ ghi đè
		models.putIfAbsent(75, "Thành Phố Huế");
		// putIfAbsent --> thêm mới entry nếu key chưa tồn tại

		// Xóa phần tử
               models.remove(43, "Đà Nẵng");
               generate("2. DataModels sau khi xóa: ", 	models);

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
