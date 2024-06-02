package view;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Jav23FirtApp {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("wlecome java23 Class");
		Random  rd = new Random();
		while(true){
			System.out.println("Random number --> " + rd.nextInt(20));
			TimeUnit.SECONDS.sleep(1);
		}
	}
}
