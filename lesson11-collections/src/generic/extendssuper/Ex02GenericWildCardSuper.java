package generic.extendssuper;

import java.time.LocalDate;
import java.util.List;

public class Ex02GenericWildCardSuper {

	public static void main(String[] args) {
		
		List<Integer> ints = List.of(1, 2, 3, 4, 5);
		List<Double> dobs = List.of(1d, 2d, 3d, 4d, 5d);
		List<String> strs = List.of("a", "b", "c", "d");
		List<Number> nubs = List.of(1, 2d, 3l, 4f, 5);
		List<Object> objs = List.of(1d, "a", LocalDate.now());
	
		generate(ints);
		generate(dobs);
		generate(strs);
		generate(nubs);
		generate(objs);
	}
	
	// ? extends Number --> Number & Child
	// ? super Number --> Number & Parent
	// Hầu hết dùng generic type, khi nào muốn generic là KDL chính
	// nó hoặc KDL cha --> ? với super
	
	// super -> chính nó và cha
	/*
	private static void generate(List<? extends Objects> elements) {
		System.out.println("Generate --> {" );
		for (Object element : elements) {
			System.out.println("    " + element);
		}
		System.out.println("}\n");
	}
	*/
	private static <T> void generate(List<T> elements) {
		System.out.println("Generate --> {" );
		for (Object element : elements) {
			System.out.println("    " + element);
		}
		System.out.println("}\n");
	}
}
