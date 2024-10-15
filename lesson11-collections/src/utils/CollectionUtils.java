package utils;

import java.util.Collection;
import java.util.List;

import bean.Item;

public class CollectionUtils {
	
	private CollectionUtils(){
	}
	
	public static void generateInts(String prefix, Collection<Integer> collection) {
		System.out.println(prefix + "-->");
		collection.forEach(e ->  System.out.print(e + " "));
		System.out.println("\n");
	}
	
	public static void generateString(String prefix, Collection<String> collection) {
		System.out.println(prefix + "-->");
		collection.forEach(e ->  System.out.print(e + " "));
		System.out.println("\n");
	}
	
	public static void generateItem(String prefix, List<Item> items) {
		System.out.println(prefix + "-->");
		items.forEach(e ->  System.out.print(e + " "));
		System.out.println("\n");
	}
	
}
