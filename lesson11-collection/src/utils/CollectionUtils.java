package utils;

import java.util.Collection;

public class CollectionUtils {
	private CollectionUtils() {
	}

	// tham số Collection<Object>
	// nhận được list<Object>, Set<object>

	// tham số Collection<T>
	// nhận được list<Integer>, Set<Double>

	public static <T> void generate(String prefix, Collection<T> collection) {
		System.out.println(prefix + " --> ");
		collection.forEach(e -> System.out.println(e));
		System.out.println("}\n");
	}

}
