package view;

import java.time.Year;
import java.util.Random;

public class Ex05Ramdomdemo {
	public static void main(String[] args) {
		Random rd = new Random();
		int number = rd.nextInt(5 ,20);
		if(number % 2 == 0) {
			System.out.println("Result --> " + (Year.now().getValue() + number));
		}
	}
}
