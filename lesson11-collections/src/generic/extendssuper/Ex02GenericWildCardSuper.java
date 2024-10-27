package generic.extendssuper;

import java.time.LocalDate;
import java.util.List;

public class Ex02GenericWildCardSuper {

	public static void main(String[] args) {
		
		List<Integer> ints = List.of(1, 2, 3, 4, 5);
		List<Double> dobs = List.of(1d, 2d, 3d, 4d, 5d);
		List<String> strs = List.of("a", "b", "c", "d");
		List<Number> nubs = List.of(1, 2d, 3l ,4f, 5);
		List<Object> objs = List.of(1d, "a", LocalDate.now());
		
		generateT(ints);
		generateT(dobs);
		generateT(strs);
		generateT(nubs);
		generateT(objs);
	}
	
	// ? extends Number -> Number & Child
	// ? super Number -> Number & Child
	// Hau het dung generic type, khi nao muon generic la KDL chinh no hoac KDL cha --> ? voi super
	private static <T> void generateT(List<T> elements) {
		System.out.println("Generate --> {");
		for(T element: elements)
			System.out.println(" + " + element);
		System.out.println("}\n");
	}
	
	private static void generateW(List<?> elements) {
		System.out.println("Generate --> {");
		for(Object element: elements)
			System.out.println(" + " + element);
		System.out.println("}\n");
	}
}
