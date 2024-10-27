package collection.map;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Ex01MapBasicDemo {

	/*
	 Bai toan quan ly bien so xe va tinh thanh tuong ung o VN
	 
	 --> List<VehicleModel>
	 --> Map<K,V>
	 	 K: Ma so
	 	 V: Thanh pho
	 	 
	 	 HashMap
	 	 + khong duy tri dung thu tu cac phan tu dua vao
	 	 + cho phep KEY = null
	 	 
	 	 LinkedHashMap
	 	 + dam bao duy tri dung thu tu cac phan tu dua vao
	 	 + cho phep KEY = null
	 	 
	 	 TreeMap
	 	 + tu dong sap xep cac phan tu(Entry) trong map theo K tang dan
	 	 + K phai la con cua Comparable<K>
	 	 + --> nen su dung Comparator
	 	 
	 	 
	 */
	public static void main(String[] args) {
		Map<Integer, String> models = new TreeMap<>((k1, k2) -> {
			
			// null first
			if(k1 == null)
				return -1;
			if(k2 == null)
				return 1;
			
			// key descending
			return k2.compareTo(k1);
		});
		
		models.put(92, "Quang Nam");
		models.put(43, "Da Nang");
		models.put(75, "Thua Thien Hue");
		models.put(null, "chua xac dinh");
		models.put(74, "Quang Tri");
		models.put(73, "Quang Binh");
		
		System.out.println("models size: " + models.size());
		generate("1. Data Model", models);
	}
	private static <K, V> void generate(String prefix, Map<K,V> map) {
		System.out.println(prefix + " --> {");
		Set<Entry<K, V>> entries = map.entrySet();
		for(Entry<K, V> entry: entries)
			System.out.println(" + " + entry);
		System.out.println("}\n");
	}
}
