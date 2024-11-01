package collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Ex01MapBasicDemo {
	
	/*
	 Bài toán quản lý bản số xe, tỉnh thành tương ứng ở VN
	 
	 --> List<VehicleModel>
	 --> Map<K,V>
	 	 K: Mã số
	 	 V: Thành phố
	 	 
	 	 HashMap
	 	 + Không duy trì đúng thứ tự các phần tử đưa vào
	 	 + Cho phép KEY = null
	 	 
	 	 LinkedHashMap
	 	 + Đảm bảo duy trì đúng thứ tự các phần tử đưa vào
	 	 + Cho phép KEY = null
	 	 
	 	 TreeMap
	 	 + Tự động sắp xếp các phần tử (Entry) trong map theo K tăng dần
	 	 + K phải là con của Conparable<K>
	 	 + --> nên sử dụng Comparator
	 
	 */
	
	public static void main(String[] args) {
		
		Map<Integer, String> models = new TreeMap<>((k1, k2) -> {
			// null first
			if(k1 == null) {
				return -1;
			}
			if(k2 == null) {
				return 1;
			}
			
			// key descending
			return k2.compareTo(k1);
			
		});
		
		models.put(92, "Quảng Nam");
		models.put(43, "Đà Nẵng");
		models.put(75, "Thừa Thiên Hóa");
		models.put(null, "Chưa xác định");
		models.put(74, "Quảng Trị");
		models.put(73, "Quảng Bình");
		
		System.out.println("models size: " + models.size());
		
		generate("1. Data Models", models);
		
	}

	private static <K, V> void generate(String prefix, Map<K, V> map) {
		System.out.println(prefix + " --> {");
		Set<Entry<K, V>> entries = map.entrySet();
		
		for(Entry<K, V> entry : entries) {
			System.out.println("   + " + entry);
		}
		System.out.println("}\n");
	}
	
}