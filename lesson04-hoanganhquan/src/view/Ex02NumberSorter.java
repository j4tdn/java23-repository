package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Ex02NumberSorter {
	public static void main(String[] args) {
		Random random = new Random();
        int n = 10; 
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = random.nextInt(100) + 1; 
        }
        
        System.out.println("Input: " + Arrays.toString(numbers));
        
        ArrayList<Integer> divisibleBy7 = new ArrayList<>();
        ArrayList<Integer> divisibleBy5 = new ArrayList<>();
        ArrayList<Integer> divisibleBy5And7 = new ArrayList<>();
        ArrayList<Integer> others = new ArrayList<>();
        
        for (int number : numbers) {
            if (number % 7 == 0 && number % 5 == 0) {
                divisibleBy5And7.add(number);
            } else if (number % 7 == 0) {
                divisibleBy7.add(number);
            } else if (number % 5 == 0) {
                divisibleBy5.add(number);
            } else {
                others.add(number);
            }
        }
        

        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(divisibleBy7);
        result.addAll(others);
        result.addAll(divisibleBy5And7); 
        result.addAll(divisibleBy5);
        
        System.out.println("Output: " + result);
    }
}
