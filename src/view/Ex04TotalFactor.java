package view;

import java.util.Random;

public class Ex04TotalFactor {
	
	public static void main(String args[]) {
		Random rd = new Random();
		int a = rd.nextInt(10,20);
		int b = rd.nextInt(10,20);
		int c = rd.nextInt(10,20);
		int d = rd.nextInt(10,20);
		int Fa = 1, Fb = 1, Fc = 1, Fd = 1;
		for (int i = 1; i <= a; i++) {
			Fa = Fa * i;
		}
		for (int i = 1; i <= b; i++) {
			Fb = Fb * i;
		}
		for (int i = 1; i <= c; i++) {
			Fc = Fc * i;
		}
		for (int i = 1; i <= d; i++) {
			Fd = Fd * i;
		}
		int S = Fa + Fb + Fc + Fd;
		System.out.println("S = a! + b! + c! + d! ");
		System.out.println("Value of S: " + S);
	}
}
