package utils;

import java.util.Collection;
import java.util.List;
import java.util.Map;


public class CollectionUtils {

	private CollectionUtils() {
		
	}
 
	public static<T> void generate(String prefix, int[] elements) {
        generate(prefix, List.of(elements));
}
	
	public static<T> void generate(String prefix, Object elements) {
        generate(prefix, List.of(elements));
}
	
	public static<T> void generate(String prefix, long elements) {
        generate(prefix, List.of(elements));
}
	
	public static<T> void generate(String prefix, String[] elements) {
	        generate(prefix, List.of(elements));
	}
	
	public static<K,V> void generate(String prefix, Map<K, V> map) {
        generate(prefix, map.entrySet());
}
	
	public static<T> void generate(String prefix, Collection<T> collection) {
		System.out.println(prefix+ " --> ");
		collection.forEach(e -> System.out.println(e + " "));
		System.out.println("\n");
	}
	
}