package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex02ClusterNumber {

	public static void main(String[] args) {
        int[] numbers = {12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18};
        int [] filteredNumbers = numbers.clone();
        
        int index = 0;
        for (int number : numbers ) {
        	if (number % 7 == 0 && number % 5 != 0) {
        		filteredNumbers[index] = number;
        		index++;
        	}
        }

        for (int number : numbers ) {
        	if ((number % 7 == 0 && number % 5 == 0) || (number % 5 != 0 && number % 7 != 0)) {
        		
        		filteredNumbers[index] = number;
        		index++;
        	}
        }

        for (int number : numbers ) {
        	if (number % 7 != 0 && number % 5 == 0) {
        		filteredNumbers[index] = number;
        		index++;
        	}
        }
        System.out.println("Input: " + Arrays.toString(numbers));

		System.out.println("================");

        System.out.println("Output: " + Arrays.toString(filteredNumbers));
    }
}
