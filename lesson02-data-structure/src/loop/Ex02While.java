package loop;

import java.util.Random;

public class Ex02While {

		public static void main(String[] args) {
			// In ra các số là bội của 3 từ a[5,10) đến b [20,30)
			Random rd = new Random();
			
			int a = rd.nextInt(5,11);
			int b = rd.nextInt(20,31);
			System.out.println("\n Su dung for");
			for(int i = a; i <= b; i++) {
				if(i % 4 == 0) {
					System.out.println("i --> " + i);
				}
			}
			System.out.println("\n Su dung while");
			int i = a;
			while(i <= b) {
				if(i % 4 == 0) {
					System.out.println("i --> " + i);
				}
				i++;
			}
			i = a;
			System.out.println("\n Su dung while/ break");
			while(true) {
				if(i % 4 == 0) {
					System.out.println("i --> " + i);
				}
				i++;
				if(i > b) {
					break;
				}
			}
		}
}
