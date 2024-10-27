package utils;

import java.util.Collection;

public class CollectionUtils {
	public static <T> void generate(String prefix, Collection<T> collection) {
		System.out.println(prefix + " --> {");
		collection.forEach(e -> System.out.println("  + " + e));
		System.out.println("}\n");
	}
}

