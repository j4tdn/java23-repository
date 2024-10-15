package utils;

import java.util.Collection;

import bean.Item;

public class CollectionUtils {

	private CollectionUtils() {
		
	}
	
	public static void generateIn(String prefix, Collection<Integer> collection) {
		System.out.println(prefix + "--> ");
		collection.forEach(e -> System.out.println(e + " "));
		System.out.println("\n");
	}
	
	public static void generateString(String prefix, Collection<String> collection) {
		System.out.println(prefix + "--> ");
		collection.forEach(e -> System.out.println(e + " "));
		System.out.println("\n");
	}
	
	public static void generateItems(String prefix, Collection<Item> collection) {
		System.out.println(prefix + "--> {");
		collection.forEach(e -> System.out.println(" + " + e));
		System.out.println("}\n");
	}
}
