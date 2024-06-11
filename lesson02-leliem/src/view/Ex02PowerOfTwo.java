package view;

import java.util.Scanner;

public class Ex02PowerOfTwo {
		public static void main(String[] args) {
			int number = getValidInteger();
			if (isPowerOfTwo(number)) {
				System.out.println(number + " -> True");
			} else {
				System.out.println(number + " -> False");
			}
		}

		private static int getValidInteger() {
			Scanner ip = new Scanner(System.in);

			String numberAsText = "";
			int number = 0;
			int incorrectInputAmount = 0;

			do {
				System.out.print("Enter your number: ");
				numberAsText = ip.nextLine();
				if (numberAsText.matches("\\d+")) {
					number = Integer.parseInt(numberAsText);
					return number;
				}

				incorrectInputAmount++;
				if (incorrectInputAmount == 5) {
					System.out.println("Wrong input 5 times");
					System.out.println("Exit");
					System.exit(0);

				}

			} while (true);
		}
		
		private static boolean isPowerOfTwo(int n){ 
			if(n <= 0) {
				return false;
			}
			return (n & (n -1)) == 0;
		}
	}
		
		
		
		
		
		