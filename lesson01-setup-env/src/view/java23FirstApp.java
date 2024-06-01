package view;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class java23FirstApp {

   public static void main(String[] args) throws InterruptedException {
    System.out.println("Welcom To Java23 Class");
    
    Random rd = new Random();
    
    while(true) {
    	System.out.println("Rand number --> " + rd.nextInt(20));
    	TimeUnit.SECONDS.sleep(1);
}
    
   }

}   