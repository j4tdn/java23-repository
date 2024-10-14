package generic.extendssuper;

import java.time.LocalDate;
import java.util.List;

public class Ex02GenericWildCardSuper {
	public static void main(String[] args) {
		
		List<Integer> ints = List.of(1, 2, 3, 4, 5);
		List<Double> dous = List.of(1d, 2d, 3d, 4d, 5d);
		List<String> strs = List.of("a", "b", "c", "d");
		List<Number> nums = List.of(1, 2d, 3l, 4f, 5);
		List<Object> objs = List.of(1d, "a",LocalDate.now());
		generate(ints);
		generate(dous);
		generate(strs);
		generate(nums);
		generate(objs);
	}
	 // Hầu hết dùng generic 
	private static <E>void generate(List<E> elements) {
		System.out.println("Generate --> { ");
		for(Object element : elements) {
			System.out.println("   + " + element);
		}
		System.out.println("} \n");
	}
}
