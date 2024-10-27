package collection.map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex02MapOperations {

	
	public static void main(String[] args) {
		Map<Integer, String> models = new HashMap<>();
		
		models.put(92, "Quang Nam");
		models.put(43, "Da Nang");
		models.put(75, "Thua Thien Hue");
		models.put(null, "chua xac dinh");
		models.put(74, "Quang Tri");
		models.put(73, "Quang Binh");
		
		// Ho tro tim kiem theo KEY
		
		// Tim thanh pho co K = 92
		String found = models.getOrDefault(98, "Khong tim thay");
		System.out.println("Thanh pho can tim: " + found);
		
		// Them phan tu
		// put: ghi đè value neu key da ton tai
		// putIfAbsent: thêm mới entry nếu key chưa tồn tại
		models.putIfAbsent(75, "Thanh pho Hue");
		
		// Xoa phan tu
		models.remove(43, "Da Nang");
		
		System.out.println("models size: " + models.size());
		generate("1. Data Model", models);
		
		// Arrays.sort
		// Collection.sort
		// list.sort(Comparator<T>)
		// --> void
		
		// Sap xep cac phan tu trong map theo k, v bat ky
		// VD: sap xep tang dan theo value
		// --> return new map
		
		generate("2. Data Models(sorted by value", 
				sort(models, (e1, e2) -> e1.getValue().compareTo(e2.getValue())));
		
	}
	private static <K, V> Map<K, V> sort(Map <K, V> source, Comparator<Entry<K, V>> comparator){
		// B1: Chuyen doi map -> set -> list -> sorted list
		List<Entry<K, V>> entryList = new ArrayList<>(source.entrySet());
		entryList.sort(comparator);
		// B2: Dua cac phan tu tu sorted list vao LinkedHashMap
		Map<K, V> target = new LinkedHashMap<>();
		for(Entry<K, V> entry: entryList)
			target.put(entry.getKey(), entry.getValue());
		
		return target;
	}
	
	private static <K, V> void generate(String prefix, Map<K,V> map) {
		System.out.println(prefix + " --> {");
		Set<Entry<K, V>> entries = map.entrySet();
		for(Entry<K, V> entry: entries)
			System.out.println(" + " + entry);
		System.out.println("}\n");
	}
}
