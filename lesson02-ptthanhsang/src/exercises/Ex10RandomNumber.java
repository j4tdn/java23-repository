package exercises;

import java.util.Arrays;
import java.util.Random;

public class Ex10RandomNumber {


		public static void main(String[] args) {
	        int[] array  = new int[5];
	        Random random = new Random();
	        for (int i = 0; i < array.length; i++) {
	            int Number;
	            do {
	                Number = random.nextInt(11) + 20; 
	                } while (IsRandomNumber(array, Number, i));

	            array[i] = Number;
	        }

	        System.out.println("5 số ngẫu nhiên không trùng là : " + Arrays.toString(array));

		}
		private static boolean IsRandomNumber(int[] array, int so, int x) {
	        for (int i = 0; i < x; i++) {
	            if (array[i] == so) {
	                return true; 
	            }
	        }
	        return false;
	    }

}