package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex02MapOperations2 {
	/*
	 BÀi toán quản lý biển số xe, tỉnh thành tương ứng ở VN
	 
	 List<VehicleModel> 
	 Map<K,V>
	 K: mã số
	 V : Thành phố
	 *)HashMap
	 + Không duy trì đúng thứ tự các phần tử đưa vào
	 + Cho phép Key = NULL
	  *)LinkedHasMAp
	 + Đảm bảo đúng thứ tự các phần tử đưa vào
	 + Cho phép Key = NULL
	 *)TreeMap
	 +Tự động sắp xếp các phần tử (Entry) trong map theo K tăng dần 
	 + Không phải là con của Comparable<K>
	 + --> nên sử dụng Comparator
	 
	 */
	public static void main(String[] args) {
		Map<Integer, String> models = new HashMap<>();
		models.put(92, "Quảng Nam");
		models.put(43, "Đà Nẵng");
		models.put(75, "Thừa Thiên Huế");
		models.put(74, "Quảng trị");
		models.put(73, "Quảng Bình");
		System.out.println("models size : " + models.size());
		generate("1.Data Models", models);
		// hỗ trợ tìm kiếm theo KEY
		// Tìm thành phố
		String found = models.getOrDefault(73, "Không tìm thấy");
		System.out.println("Thành phố cần tìm: " + found);
		// Thêm phần tử
		// put: ghi đè value nếu key đã tôn tại
		// putIfAdsent: thêm mới entry nếu key chưa tồn tại
		models.putIfAbsent(75, "Thành phố Huế");
		
		// Xóa phần tử
		models.remove(43,"Đà Nẵng");
		
	}
	private static <K,V> void generate(String prefix, Map<K,V> map) {
		System.out.println(prefix + " --> { ");
		Set<Entry<K,V>> entris=  map.entrySet(); 
		for(Entry <K,V> entry : entris) {
			System.out.println("  + " + entris);
		}
		System.out.println("}\n");
	}
}
