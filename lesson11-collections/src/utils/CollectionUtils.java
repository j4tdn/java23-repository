package utils;

import java.util.Collection;

import bean.Item;

public class CollectionUtils {

	public CollectionUtils() {
	}
	
	public static void generateInt(String prefix, Collection<Integer> collection) {
		System.out.print(prefix + " --> ");
		collection.forEach(e -> System.out.print(e + " "));
		System.out.println("\n");
	}
	
	public static void generateString(String prefix, Collection<String> collection) {
		System.out.print(prefix + " --> ");
		collection.forEach(e -> System.out.print(e + " "));
		System.out.println("\n");
	}
	
	public static void generateItems(String prefix, Collection<Item> collection) {
		System.out.println(prefix + " --> {");
		collection.forEach(e -> System.out.println("  + " + e));
		System.out.println("}\n");
	}
}
