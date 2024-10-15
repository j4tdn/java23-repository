package view;

import java.util.Arrays;

public class Ex03Operation {
	public static void main(String[] args) {
		int[] arrays = { 1, 3, 5, 7, 9 };

		System.out.println(Arrays.toString(arrays));
		System.out.println(Arrays.toString(add(arrays, 2, 4)));
		System.out.println(Arrays.toString(remove(arrays, 3)));
	}

	private static int[] add(int[] source, int pos, int value) {
		int[] target = new int[source.length + 1];
		
		//B1: copy source -> target.
		for (int i = 0; i < source.length; i++) {
			target[i] = source[i];
		}
		
		// B2: push right 1 unit
		for (int i = target.length - 1; i > pos; i--) {
			target[i] = target[i - 1];
		}

		target[pos] = value;

		return target;
	}

	private static int[] remove(int[] source, int pos) {
//		int[] target = new int[source.length - 1];
//
//		// B1: copy source -> target.
//		for (int i = 0; i < pos - 1; i++) {
//			target[i] = source[i];
//		}
//
//		// B2: push left 1 unit
//		for (int i = pos - 1; i < target.length; i++) {
//			target[i] = source[i + 1];
//		}

		// B12: copy
		int[] target = Arrays.copyOfRange(source, 0, source.length);

		// B2: shift left
		for (int i = pos; i < target.length - 1; i++) {
			target[i] = target[i + 1];
		}

		return Arrays.copyOfRange(target, 0, target.length - 1);
	}
}
