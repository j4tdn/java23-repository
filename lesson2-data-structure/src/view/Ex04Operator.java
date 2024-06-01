package view;

import javax.sql.rowset.serial.SQLOutputImpl;

public class Ex04Operator {
   public static void main(String[] args) {
	// Toán Tử = 
	   int a = 4;
	   int b = 2;
	   int z = 8;
	   
	 boolean e1 =  (a == b);
	  boolean e2 =(a * b == z);
	  boolean e3 =( a != z);
	  
	  
	  System.out.println("e1 --> " + e1); //false 
	  System.out.println("e2 --> " + e2); // true
	  System.out.println("e3 --> " + e3); // true
	  System.out.println("e4 --> " + !e3);
	  
	  System.out.println("\n ====== Toan Tu ++ -- =======\n"); 
	  
	  int m = a++;
	  int n = ++b;
	  System.out.println("m --> " + m);
	  System.out.println("n --> " + n);
	  a = 4;
	  b = 2;
	  System.out.println("\n ====== Toan Tu &&|| & | =======\n"); 
	boolean  w1 = (a++ > 4 && ++b > 2 );
	  boolean w2 = (++a > 5 || b++ > 3);
	  
	  System.out.println("w1 --> " + w1);
	  System.out.println("w2 --> " + w2);
	  System.out.println("a --> " + a);
	  System.out.println("b --> " + b);
	  
	  System.out.println("\n ====== Thực Hành  =======\n"); 
	
			  
     }
}
