package utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

import bean.Apple;

public class CollectionUtils {
	private CollectionUtils() {
	}

	public static <T> List<T> filter(List<T> elements, Predicate<T> predicate) {
		var result = new ArrayList<T>();

		for (var apple : elements) {
			if (predicate.test(apple)) {
				result.add(apple);
			}
		}

		return result;
	}

	public static <T> void generate(String prefix, Collection<T> collection) {
		System.out.println(prefix + " --> ");
		collection.forEach(e -> System.out.println(e));
		System.out.println("}\n");
	}
}
