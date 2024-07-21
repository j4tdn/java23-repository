package view;

import java.util.Random;
import java.util.Scanner;

public class st5 {

	    static int countDivisors(int num) {
	        int count = 0;
	        for (int i = 1; i <= num; ++i) {
	            if (num % i == 0) {
	                count++;
	            }
	        }
	        return count;
	    }
	    static void printDivisors(int num) {
	        System.out.print("Ước số của " + num + ": ");
	        for (int i = 1; i <= num; ++i) {
	            if (num % i == 0) {
	                System.out.print(i + " ");
	            }
	        }
	        System.out.println();
	    }

	    static void sortByLevel(int[] arr, int n) {
	        for (int i = 0; i < n - 1; ++i) {
	            for (int j = i + 1; j < n; ++j) {
	                if (countDivisors(arr[i]) > countDivisors(arr[j])) {
	                    int temp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = temp;
	                }
	            }
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print(" (3 <= n <= 20): ");
	        int n = scanner.nextInt();

	        int[] arr = new int[20];
	        System.out.print("enter " + n + " : ");
	        for (int i = 0; i < n; ++i) {
	            arr[i] = scanner.nextInt();
	        }

	        System.out.println("wet list of natural numbers :");
	        for (int i = 0; i < n; ++i) {
	            printDivisors(arr[i]);
	        }

	        
	    }
	}
