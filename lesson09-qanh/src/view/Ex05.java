package view;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		int number ;
		System.out.println("Enter the value of the happiness point : ");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		boolean happy = HappyNumber(number);
		if(happy) {
			System.out.println("verry happy :)) ! ");
		}else {
			System.out.println("poor happiness coefficient ! ");
		}
		
	}
	public static boolean HappyNumber(int num) {
        int ero1 = num;
        int ero2 = num;

        do {
        	ero1 = quaresHappy(ero1);       
        	ero2 = quaresHappy(quaresHappy(ero2)); 
        } while (ero1 != ero2); 

        return ero1 == 1; 
    }
  
    private static int quaresHappy(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;           
            sum += digit * digit;          
            num /= 10; 
            
        
        }
        return sum;
    }
	

}
