package view;

public class Ex04Operater {
	public static void main(String[] args) {
	 int a = 4;
	 int b = 2;
	 int zz =8;
	 
	 
	boolean e1 = (a == b);
	boolean e2 = (a * b ==zz);
	boolean e3 = (a != zz);
	System.out.println(e1);
	System.out.println(e2);
	System.out.println(e3);
	System.out.println(!e3);
	
	
	System.out.println("\n==== Toán tử ++ --");
	int m = a++; //suffix
	int n = ++b; //prefix
	System.out.println(a);
	System.out.println(m);
	System.out.println(n);
	 a =4;
	 b =2;
	System.out.println("\n=== toán tử && || & |");
	boolean w1 = (a++ > 4 & ++b > 2);
	boolean w2 = (++a > 5 | b++ > 3);
	System.out.println(w1);
	System.out.println(w2);
	System.out.println(a);
	System.out.println(b);
	
  }
}
