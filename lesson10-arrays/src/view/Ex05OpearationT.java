package view;

import java.util.Arrays;

import functional.InTest;

public class Ex05OpearationT {

	public static void main(String[] args) {
		int[] numbers = {0, 20, 50, 13, 12, 28, 77, 66, 29,37};
		
		//C1
		InTest nbr = new InTest() {
			@Override
			public boolean stragegy(int number) {
				return number % 2 ==0;
			}
		};
		
		InTest nbrs = new InTest() {
			@Override
			public boolean stragegy(int number) {
				return number % 5 ==0;
			}
		};
		
		InTest nbrss = new InTest() {
			@Override
			public boolean stragegy(int number) {
				return isPrime(number);
			}
		};
		
		System.out.println("Số chẵn ===>" +Arrays.toString(getNumber(numbers, nbr)));
		System.out.println("Số chia het cho 5 ===>" +Arrays.toString(getNumber(numbers, nbrs)));
		System.out.println("Số nguyên tố ===>" +Arrays.toString(getNumber(numbers, nbrss)));

		
		
		
		//C2
		//		printf("Số chẵn ",numbers,nbr -> nbr % 2 ==0);
	}
	
	private static void printf(String prefix, int[] numbers, InTest intTest) {
		System.out.println(prefix + "==>" +Arrays.toString(getNumber(numbers, intTest)));
		
	}
	
	private static int[] getNumber(int[] source, InTest intTest) {
              int[] target = new int[source.length];
              int count = 0;
              for(int number: source) {
            	  if(intTest.stragegy(number)) {
            		  target[count++] = number;
            	  }
              }
	return Arrays.copyOfRange(target, 0, count);
	}
	
	private static boolean isPrime(int number) {
		if(number == 0 || number == 1) {
			return false;
		}
		for(int i = 2; i<= number;i++) {
			if(number % i == 0) {
				return false;
			}
		}
		return true;
		
	}
	
}
