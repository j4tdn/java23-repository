package generic.extendssuper;

import java.util.List;

import javax.annotation.processing.Generated;

public class Ex02GenericWildCardSuper {
	public static void main(String[] args) {
		List<Integer> ints = List.of(1, 2, 3, 4, 5);
		List<Double> dobs = List.of(1d, 2d, 3d, 4d, 5d);
		List<String> strs = List.of("1", "2", "3", "4", "5");
		List<Number> nubs = List.of(1, 2d, 3f, 4, 5d);
		List<Object> obj = List.of(1, "a", 3f, 4, 5d);

		generate(ints);
		generate(dobs);
		generate(strs);
		generate(nubs);
		generate(obj);
	}

	// ? extends Number -> Number & Child
	// ? super Number -> Number & Parent
	// Hầu hết dùng generic type, khi nào muốn generic là KDL chính nó hoặc cha
	private static <T> void generate(List<?> elements) {
		System.out.println("Generate --> {");
		for (Object element : elements) {
			System.out.println("  + " + element);
		}
		System.out.println("}\n");
	}
}
