package view;

public class Ex03Operator {
	public static void main(String[] args) {
		int a =4;
		int b=2;
		int z=8;
		
		boolean e1 = (a==b);
		boolean e2 = (a*b ==z);
		boolean e3 = (a!=z);
		System.out.println("e1---> "+e1);
		System.out.println("e2---> "+e2);
		System.out.println("e3---> "+e3);
		System.out.println("e4---> "+!e3);
		
		System.out.println("---------Toan Tu------------");
		int m = a++;
		int n = ++b;
		System.out.println(a);
		System.out.println("m---"+m);
		System.out.println("n---"+n);
		
		a =4;
		b=2;
		System.out.println("--------toan tu $$ || & | ----");
		boolean w1 =(a++ >4 & ++b >2);
		boolean w2 = (++a >5 | b++ >3);
		System.out.println("w1 -> "+w1);
		System.out.println("w2 -> "+w2);
		System.out.println("a -> "+a);
		System.out.println("b -> "+b);
		
		System.out.println("---------thuc hanh---------");
		
	}
}
