package utils;

import java.util.Collection;
import java.util.List;

public class PrintUtils {

	private PrintUtils() {}
	
	public static <E> void generate (String prefix, E element) {
		if(element == null) {
			System.out.println(prefix + " --> Not Found");
		} else {
			generate(prefix, List.of(element));
		}
	}
	
	public static <E> void generate (String prefix, Collection<E> elements) {
		System.out.println(prefix + " { ");
		elements.forEach(element -> {
			System.out.println("    - " + element);
		});
		System.out.println("}\n");
	}
	
}
