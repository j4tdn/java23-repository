package loop;

import java.util.Random;

public class Ex02While {
	public static void main(String[] args) {
		// in ra các số bội 4 từ a[5,10] -b[20,30]
		Random rd = new Random();
		int a = rd.nextInt();
		int b = rd.nextInt();
		int i = a;
		while (i<=b) {
			if(a%4==0) System.out.println("i = "+i);
			i++;
		}
	}

}
