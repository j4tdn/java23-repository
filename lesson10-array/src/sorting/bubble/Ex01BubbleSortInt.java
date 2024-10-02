package sorting.bubble;

import java.util.Arrays;

import functional.IntComparetor;

public class Ex01BubbleSortInt {
	
	public static void main (String[] args) {
		
		int[] elaments = {1, 5, 9, 4 , 6, 11};
		
		//tang dan 
		bubbleSort(elaments, (n1,n2) -> n1 -n2);
		
		System.out.println("tang dan -->" + Arrays.toString(elaments) );
		//giam dan
		
		bubbleSort(elaments , (n1,n2) -> n2-n1);
		
		System.out.println("giam dan -->" + Arrays.toString(elaments) );
	}
	
	private static void bubbleSort (int[] elament, IntComparetor intComp) {
		for (int round = 0; round < elament.length; round++) {
			for (int i = 0; i < elament.length -round - 1; i++ ) {
				if (intComp.strategy(elament[i], elament[i+1]) > 0) {
					int temp = 0;
					temp = elament[i];
					elament[i] = elament[i+1];
					elament[i+1] = temp;
				}f
			}
		}
	}	
}
