package loop;

import java.util.Random;

public class Ex02While {
	public static void main(String[] args) {
		//in cac so la boi cua 4 tu a[5,10))-b[20,30)
		Random rd = new Random();
		int a = rd.nextInt(5,11);
		int b = rd.nextInt(20,31);
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("for ---------------");
		for(int i= a;i<=b;i++) {
			if(i%4 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("while --------------");
		int i =a;
		while(i<=b) {
			if(i%4 == 0) {
				System.out.println(i);
			}
			i++;
		}
		System.out.println("while,break --------------");
		i=a;
		while(true) {
			if(i%4 == 0) {
				System.out.println(i);
			}
			i++;
			if(i>b) break;
		}
	
	}
}
