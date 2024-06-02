package view;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class java23FirstApp {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("welcome to java23  class");
		Random rd =  new Random();
		while(true) {
			System.out.println("Random number -->" + rd.nextInt(20));
			TimeUnit.SECONDS.sleep(1);
		}
		
	}

}
