package loop;

import java.util.Random;

public class Ex02While {

	public static void main(String[] args) {
		
		//In ra cac so la boi cua 4 tu a[5,10) den b[20,30)
		Random rd = new Random();
		int a = rd.nextInt(5, 11);
		int b = rd.nextInt(20, 31);
		System.out.println("Gia tri cua a = " + a);
		System.out.println("Gia tri cua b = " + b);
		
		System.out.println("Su dung FOR");
		for(int i = a; i <= b; i++) {
			if(i % 4 == 0)
			System.out.println("i -> " + i);
		}
		
		System.out.println("Su dung WHILE");
		int i = a;
		while(i <=  b) {
			if(i % 4 == 0)
			System.out.println("i -> " + i);
			i++;
		}
		
		System.out.println("Su dung WHILE/BREAK");
		i = a;
		while(true) {
			if(i % 4 == 0)
				System.out.println("i -> " + i);
			i++;
			if(i > b)
				break;
		}
		
	}
}
