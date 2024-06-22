package view;

import java.util.Scanner;

public class Ex06MinMaxInteger {
	
	public static boolean checkString (String str) {
		 for (int i = 0 ; i < str.length(); i++) {
			 if (!Character.isDigit(str.charAt(i))) {
				 return false;
			 }
		 }
		 return true;
	 }
	
	public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
	
	public static void main (String args[]) {
		 Scanner scanner = new Scanner(System.in);
		 int na = 0;
		 int nb = 0;
		 int nc = 0;
		 while (true) {
			 System.out.print("Enter the integer a:  ");
			 String a = scanner.nextLine();
			 System.out.print("Enter the integer b:  ");
			 String b = scanner.nextLine();
			 System.out.print("Enter the integer c:  ");
			 String c = scanner.nextLine();
			 
			 if (checkString(a)) {
				 na = Integer.parseInt(a);
			 }
			 else {
				 System.out.println("a is not integer.");
				 continue;
			 }
			 
			 if (checkString(b)) {
				 nb = Integer.parseInt(b);
			 }
			 else {
				 System.out.println("b is not integer.");
				 continue;
			 }
			 
			 if (checkString(c)) {
				 nc = Integer.parseInt(c);
			 }
			 else {
				 System.out.println("c is not integer.");
				 continue;
			 }
			 if (na >= 0 && na < 20 && nb >= 0 && nb < 20 && nc >= 0 && nc < 20) {
				 break;
			 }
			 else {
				 System.out.println("The numbers should be between 0 and 19. Please re-enter..");
			 }
		 }
		 
		int [] arr = {na,nb,nc};
		bubbleSort(arr);
		System.out.println("The min integer is: "+ arr[0]);
		System.out.println("The max integer is: "+ arr[2]);
	}
}
		

