package view;

import java.util.Arrays;

public class Ex03OperationsF {
	
	public static void main(String[] args) {
		
		int[] numbers = {1, 9, 5, 36, 12, 33};
		
		int[] addedNumbers = add(numbers, 3, 18);
		
		System.out.println("add(source, 3, 18) --> " + Arrays.toString(addedNumbers));
		
		int[] removedNumbers = remove(numbers, 2);
		System.out.println("remove(source, 2) --> " + Arrays.toString(removedNumbers));
		
	}
	
	private static int[] add(int[] source, int pos, int newValue) {
		int[] target = new int[source.length + 1];
		
		for (int i = 0; i < source.length; i++) {
			target[i] = source[i]; 
		}
		
		for (int i = target.length - 1; i > pos; i--) {
			target[i] = target[i - 1];
		}
		
		target[pos] = newValue;
			
		return target;
	}
	
	private static int[] remove(int[] source, int pos) {
		int[] target = Arrays.copyOfRange(source, 0, source.length);
		
		for (int i = pos; i < target.length - 1; i++) {
			target[i] = target[i + 1];
		}
		
		return Arrays.copyOfRange(target, 0, target.length - 1);
	}

}
