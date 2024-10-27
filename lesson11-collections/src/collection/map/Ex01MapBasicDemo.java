package collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Ex01MapBasicDemo {

	/*
	  bài toán quản lý biển số xe, tỉnh thành tương ứng ở VN 
	  --> List<VehicelModel>
	  --> Nap<k,v>
	  	  K: mã số 
	  	  V: Thành phố 
	 */
	
	public static void main (String[] args) {
		
		Map <Integer, String> models = 	new TreeMap <> ((k1, k2) ->{
			//null firt
			if (k1 == null) {
				return -1;
			}
			if (k2 == null) {
				return 1;
			}
			//key descending
			return k2.compareTo(k1);
		});
		models.put(92, "Quang Nam");
		models.put(43, "Da Nang");
		models.put(75, "Thua Thien Hue");
		models.put(null, "Khong xac dinh");
		models.put(74, "Quang Tri");
		models.put(73, "Quang Binh");
		
		System.out.println("models size: " + models.size());
		
		generate("1.DataModels" ,models);
	}

	private static <K, V> void generate(String prefix, Map<K, V> map) {
		System.out.println(prefix+ "--> {");
		Set<Entry<K, V>> entries = map.entrySet();
		for (Entry<K, V> entry : entries) {
			System.out.println("  + " + entry);
		}
		System.out.println("\n");
	}
	
	
	
}
