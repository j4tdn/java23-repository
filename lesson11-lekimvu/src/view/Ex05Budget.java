package view;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import utils.MultiUlti;

public class Ex05Budget {

	public static void main(String[] args) {
		Map<String, Double> dataShopping = new TreeMap<>((k1, k2) -> {
			return k1.compareTo(k2);
		});

		dataShopping.put("đi chợ ", 100d);
		dataShopping.put("đi mua sắm ", 600d);
		dataShopping.put("đi ăn ", 1000d);
		dataShopping.put("mua tivi ", 10000d);

		MultiUlti.print("Danh sách các khoản chi tiêu(tăng dần theo Key)", dataShopping);

		MultiUlti.print("Danh sách các khoản chi tiêu giảm dần theo value ",
				sort(dataShopping, ( v1	, v2) -> {
					return v2.getValue().compareTo(v1.getValue());
				}));

	}

	private static <K, V> Map<K, V> sort(Map<K, V> source, Comparator<Entry<K, V>> comparator) {
		List<Entry<K, V>> entryLists = new ArrayList<>(source.entrySet());
		entryLists.sort(comparator);

		Map<K, V> target = new LinkedHashMap<>();
		for (var entry : entryLists) {
			target.put(entry.getKey(), entry.getValue());
		}
		return target;

	}

}