package utils;

import java.util.Collection;

import bean.Item;

public class CollectionUtils {

	private CollectionUtils() {
	}
	
	public static <T> void generate(String prefix, Collection<T> collection) {
		System.out.print(prefix + " --> ");
		collection.forEach(e -> System.out.print(e + " "));
		System.out.println("\n");
	}
	
	
}