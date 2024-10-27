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

public class Ex02MapOperations {


	
	public static void main (String[] args) {
		
		Map <Integer, String> models = 	new HashMap <> ();

		models.put(92, "Quang Nam");
		models.put(43, "Da Nang");
		models.put(75, "Thua Thien Hue");
		models.put(null, "Khong xac dinh");
		models.put(74, "Quang Tri");
		models.put(73, "Quang Binh");
		
		System.out.println("models size: " + models.size());
		
		
		
		//tìm thành phố có k = 92;
		
		String found = models.getOrDefault(92, "khong tim thay");
		System.out.println("thanh pho can tim "+ found);
		
		//thêm phần tử 
		
		models.putIfAbsent(75, "Thanh Pho Hue");
		
		//xoá phần tử 
		
		models.remove(43, "Da Nang");
		
		generate("1.DataModels" ,models);
		
		//sắp xếp các phần tử trong map theo k, v bất kỳ 
		//VD: sắp xếp tăng dần theo value 
		
		Set<Entry<Integer, String>> entrySet = models.entrySet();
		//List <Entry<Integer, String>> entryList = new ArrayList <> (entrySet);
		
		//entryList.sort((e1,e2) -> {
		//	return e1.getValue().compareTo(e2.getValue());
		//});
		//Map<Integer, String> sortedMap = new LinkedHashMap <> ();
		//for (Entry<Integer, String> entry: entryList) {
		//	sortedMap.put(entry.getKey(), entry.getValue());
		//}
		
		generate("2.DataModels" ,sort(models, (e1,e2) -> e1.getValue().compareTo(e2.getValue()))
				);
	}

	private static <K, V> void generate(String prefix, Map<K, V> map) {
		System.out.println(prefix+ "--> {");
		var entries = map.entrySet();
		for (var entry : entries) {
			System.out.println("  + " + entry);
		}
		System.out.println("\n");
	}
	
	private static <K, V> Map<K, V> sort( Map<K, V> source, Comparator<Entry<K,V>> comparator){
		var entryList = new ArrayList <> (source.entrySet());
		entryList.sort(comparator);
		
		Map<K, V> target = new LinkedHashMap <> ();
		for (var entry: entryList) {
			target.put(entry.getKey(), entry.getValue());
		}
		return target;
	}
	
	
	
}
