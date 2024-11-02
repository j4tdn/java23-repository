package utils;

import java.util.List;

public class CollectionUtils {
	private CollectionUtils() {
	}
	
	public static <T> void generate(String prefix, List<T> elements) {
		System.out.println(prefix + "{");
		elements.forEach(element -> System.out.println(element));
		System.out.println("}");
	}
}
