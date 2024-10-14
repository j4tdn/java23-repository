package ultisl;

import java.util.Collection;

import bean.Item;

public class CollectionUtils {
	private CollectionUtils() {
		
	}
//	public static <T> void generate(String prefix, Collection<T> collection) {
//		System.out.println(prefix + " --> ");
//		collection.forEach(e -> System.out.println(e + " "));
//		System.out.println("\n");
//		
//	}
//	public static void generateString(String prefix, Collection<String> collection) {
//		System.out.println(prefix + " --> ");
//		collection.forEach(e -> System.out.println(e + " "));
//		System.out.println("\n");
//		
//	}
	public static  <T>  void generate(String prefix, Collection<T> collection) {
		System.out.println(prefix + " --> {");
		collection.forEach(e -> System.out.println("  + " + e));
		System.out.println("}\n");
		
	}
	
}
