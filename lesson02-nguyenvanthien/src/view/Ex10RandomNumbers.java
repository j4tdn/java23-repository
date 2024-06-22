package view;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Ex10RandomNumbers {
	 public static void main(String[] args) {
	        Random random = new Random();
	        Set<Integer> numbers = new HashSet<>();

	        while (numbers.size() < 5) {
	            int number = 20 + random.nextInt(11);
	            numbers.add(number);
	        }

	        System.out.println("5 so ngau nhien khong trung nhau " + numbers);
	    }
	}

