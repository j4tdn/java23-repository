package view;

public class Ex04 {
	public static void main(String[] args) {
		int[] a = {1, 5, 8, 9, 2, 5, 9};
		int[] a1 = {4, 2, 6, 6, 4, 15, 1};
		System.out.println("Sum a --> " + sumOfAllElementS(a));
		System.out.println("Sum a1 --> " + sumOfAllElementS(a1));
	}
	
	public static int sumOfAllElementS(int a[]) {
		int maxElements = getMaxValidNumber(a);
		int minElements = getMinValidNumber(a);
		int sum = 0;
		
		boolean elements = false;
		for (int i = 0; i < a.length; i++) {
			elements = false;
			for (int j = 0; j < a.length ; j++) {
				if (a[1] == a[j] && i != j ) {
					elements = true;
				}
			}
			if (elements == false && a[i] != maxElements && a[i] != minElements) {
				sum += a[i];
			}
		}
		return sum;
	}
	
	public static int getMinValidNumber(int a[]) {
		int min = Integer.MAX_VALUE;
		for (int num : a) {
			if (num < min) {
				min = num;
			}
		}
		return min;
	}
	
	public static int getMaxValidNumber(int a[]) {
		int max = Integer.MIN_VALUE;
		for (int num : a) {
			if (num > max) {
				max = num;
			}
		}
		return max;
	}
}
