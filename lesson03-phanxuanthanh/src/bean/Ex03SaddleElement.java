package bean;

import java.util.Scanner;

import utils.*;
public class Ex03SaddleElement {
	public static void main(String[] args) {
	    int m, n;
	     
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("ENTER M: ");
	    m = sc.nextInt();
	    System.out.println("ENTER N: ");
	    n = sc.nextInt();
	         
	    Matrix matrix = new Matrix(m,n);
	    matrix.inputMatrix();
	    matrix.printMatrix();
	    
	    if (matrix.hasSaddleElement()) {
	    	System.out.println();
	    }else {
	    	System.out.println("Not Have Saddle Element: ");
	    }
	    sc.close();		
	}
	
}
