package utils;

import java.util.Collection;

public class CollectionUtils {

	private CollectionUtils() {
	}
	
	// Tham số Collection<Object>
	// Nhận đc List<Object>, Set<Object>
	
	// Truyền vào List<T>
	// Nhận đc List<Integer>, Set<Double>
	
	public static <T> void generate(String prefix, Collection<T> collection) {
		System.out.println(prefix + "--> {");
		collection.forEach(e -> System.out.println(" + " + e));
		System.out.println("\n");
	}
	
//	public static void generateInts(String prefix, Collection<Integer> collection) {
//		System.out.print(prefix + "-->");
//		collection.forEach(e -> System.out.print(e + " "));
//		System.out.println("\n");
//	}
//	
//	public static void generateStrings(String prefix, Collection<String> collection) {
//		System.out.print(prefix + "-->");
//		collection.forEach(e -> System.out.print(e + " "));
//		System.out.println("\n");
//	}
//	
//	public static void generateItems(String prefix, Collection<Item> collection) {
//		System.out.print(prefix + "--> {");
//		collection.forEach(e -> System.out.println(" + " + e));
//		System.out.println("}\n");
//	}
}
