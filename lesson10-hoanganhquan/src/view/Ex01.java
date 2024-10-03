package view;

import java.util.Arrays;

public class Ex01 {

		public static void main (String[] args) {
			int[] n = {1,2,3,4,3,1};
		
			System.out.println("result --> " + Arrays.toString(removeDupElements(n)));
			equals(n);
		}
		
		private static int[] removeDupElements(int[] n) {
			int[] result = new int [n.length];
			int count = 0;
			boolean check = false;
			
			for (int i=0; i<n.length - 1; i++) {
				for (int j = 0; j <n.length; j++) {
					if (n[i] == n[j] && i!=j) {
						check = true;
						break;
					} else {
						check = false;
					}
				}
				
				if (!check) {
					result[count++] = n[i];
				}
			}
			
			return Arrays.copyOfRange(result, 0, count);
		}
		
		private static void equals(int[] n) {
			int a = 0;
			int b = 0;
			
			for (int i = 0; i< n.length; i++) {
				if (i <= n.length/2 -1) {
					a = a + n[i];
				}
				else {
					b = b + n[i];
				}
			}
			
			String s = ((a) < (b)) ?
					"nửa đầu bé hơn nửa sau " : 
					"nửa đầu lớn hơn nửa sau ";
			
			System.out.println(s);
		}
		
}
