package view;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Java23FirstApp {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("hello");
		Random rd = new Random();
		System.out.println("hello: " + rd.nextInt(30));
		while(true) {
			System.out.println("rand number :" + rd.nextInt(20));
			TimeUnit.SECONDS.sleep(1);
		}
	}
}
