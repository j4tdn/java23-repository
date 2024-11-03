package view.stream;

import java.util.Arrays;
import java.util.Collections;

import ultisl.CollectionUtils;

public class Ex06StreamMatching {
	
	public static void main(String[] args) {
		
		int [] number = {1, 2, 1 ,4, 5, 8, 10, 4, 12};
		System.out.printf("1st  + %s\n",
				Arrays.stream(number)
				.anyMatch(nb -> nb % 10 == 0));
		
		System.out.printf("2st  + %s\n",
				Arrays.stream(number)
				.filter(nb -> nb % 41 == 0)
				.findFirst()
				.orElse(-1));
		
		CollectionUtils.generate(
				"3st ", 
				Arrays.stream(number).
				filter(nb -> nb % 5 == 0).
				toArray());
		
		System.out.printf
				("4st + %s\n ",
				Arrays.stream(number).
				allMatch(nb -> nb < 100));
		
		
		System.out.printf(
				"5st + %s ",
				Arrays.stream(number).
				noneMatch(nb -> nb > 0));
	}
}
