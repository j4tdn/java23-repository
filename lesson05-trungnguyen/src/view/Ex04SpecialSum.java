package view;

public class Ex04SpecialSum {
	public static void main(String[] args) {
		int count = 0;
		int[] a = {1, 5, 8, 9,1, 2, 5, 9,9,9,-8,999};
		int[] b = a.clone();
		for (int i = 0; i < b.length; i++) {
			b[i] = 0;
		}
		for (int i = 0; i< a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i] == a[j]) {
					b[count] = a[i];
					count ++;
				}
			}
		}
		for (int i = 0; i< a.length; i++) {
			for (int j =0; j< b.length; j++) {
				
			}
		}
		
		
		
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
			if (a[i] < min) min = a[i];
			if (a[i] > max) max = a[i];
		}
//		System.out.println("min: " + min);
//		System.out.println("max: " + max);
		

	}
}
