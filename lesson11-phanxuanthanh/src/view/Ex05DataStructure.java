package view;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import util.CollectionUtil;

public class Ex05DataStructure {
	
	public static void main(String[] args) {
		Map<String, Integer> map = mockData();
		CollectionUtil.generate("Sort by value", sortByValue(map, Comparator.comparing(Entry::getValue, Comparator.reverseOrder())));
	}
	
	private static Map<String, Integer> sortByValue(Map<String, Integer> map, Comparator<Entry<String, Integer>> comparator) {
		Set<Entry<String, Integer>> entries = map.entrySet();
		
		List<Entry<String, Integer>> listToBeSorted = new ArrayList<>(entries);
		
		listToBeSorted.sort(comparator);
		
		Map<String, Integer> sortedMap = new LinkedHashMap<>();
		
		for (Entry<String, Integer> entry: listToBeSorted) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		
		return sortedMap;
	}
	
	public static Map<String, Integer> mockData(){
		Map<String, Integer> map = new TreeMap<String, Integer>();
		map.put("Ăn sáng", 30);
		map.put("Ăn trưa ", 50);
		map.put("Đi cafe", 150);
		map.put("Đi nhậu", 500);
		map.put("Đi bar", 700);
		return map;
	}

}