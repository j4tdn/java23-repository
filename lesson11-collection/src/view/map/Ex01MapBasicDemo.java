package view.map;

import static java.util.Comparator.comparing;
import static java.util.Comparator.nullsFirst;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Ex01MapBasicDemo {
	public static void main(String[] args) {
//		var vehicles = new HashMap<>(); // K Obj V Obj

		/*
		 * Map -> ngoài lưu trữ dữ liệu trả về hashcode và lưu hash
		 * 
		 * HashMap ko đảm bảo thứ tự đúng như lúc put LinkedHashMap: đảm bảo duy trì
		 * đúng thứ tự Treemap: hỗ trợ tự động sort theo K, yêu cầu <K extends
		 * Comparable<?>> : có thể sử dụng Comparator
		 * 
		 * -> 0 hỗ trợ sort by value
		 * 
		 * -> muốn sort by value -> tự code hàm sort (dùng map bất kỳ)
		 */
		// null last and desc by key
		// sort trước, put sau!

//		Map<Integer, String> vehicles = new TreeMap<>(new Comparator<>() {
//			@Override
//			public int compare(Integer k1, Integer k2) {
//				if (k1 == null) {
//					return 1;
//				}
//				if (k2 == null) {
//					return -1;
//				}
//				return k2.compareTo(k1);
//			}
//		});
		
		Map<Integer, String> vehicles = new TreeMap<>(nullsFirst(comparing(k -> k)));

		vehicles.put(92, "Quảng Nam");
		vehicles.put(43, "Đà Nẵng");
		vehicles.put(75, "Huế");
		vehicles.put(74, "Quảng Trị");
		vehicles.put(73, "Quảng Bình");

		vehicles.put(75, "T - T - H"); // put -> override
		vehicles.putIfAbsent(92, "QN"); // put --> ko override

		System.out.println("Value K=88: " + vehicles.getOrDefault(88, "Not Found"));

		printf("Vehicles: ", vehicles);
	}

	// Map -> mỗi ptu là 1 entry khác nhau
	private static void printf(String prefix, Map<Integer, String> map) {
		System.out.println(prefix + "{");
		Set<Entry<Integer, String>> entries = map.entrySet();
		entries.forEach(m -> System.out.println(m.getKey() + " --> " + m.getValue()));
	}
}
