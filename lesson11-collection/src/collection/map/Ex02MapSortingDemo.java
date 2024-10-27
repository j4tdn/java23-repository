package collection.map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import java.util.Comparator.*;

public class Ex02MapSortingDemo {
	public static void main(String[] args) {
		Map<Integer, String> vehicles = new HashMap<>();

		vehicles.put(92, "Quảng Nam");
		vehicles.put(43, "Đà Nẵng");
		vehicles.put(75, "Huế");
		vehicles.put(74, "Quảng Trị");
		vehicles.put(73, "Quảng Bình");

		generate("origin: ", vehicles);

	}

	private static void generate(String prefix, Map<Integer, String> map) {
		System.out.println(prefix + " {");
		for (Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

	private static Map<Integer, String> sort(Map<Integer, String> map,
			Comparator<Entry<Integer,String>> comparator) {
		//1. convert to list:
		List<Entry<Integer, String>> elements = new ArrayList<>(map.entrySet());
	
		//2. List -> sắp xếp theo yc
		elements.sort(comparator);

		// 3. Tạo 1 map mới
		Map<Integer, String> sortedMap = new LinkedHashMap<Integer, String>();

		// 4. Trả về map mới đó
		for (Entry<Integer, String> entry : elements) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}

		return sortedMap;
	}
}
