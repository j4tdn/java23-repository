package exercises;

import java.util.Scanner;

public class Ex01MultipleTwo {
	
	public static void main(String[] args) {

		int N = 0;
		int count = 0;
		do {
			
			Scanner ip = new Scanner(System.in) ;
			System.out.println(" Nhập N = ");
			N = ip.nextInt();
			count++;
			if(N < 0 ||  N%2 != 0) System.out.println(" --> False");
			else System.out.println(" --> True");
		}while((N < 0 ||  N%2 != 0 ) && count < 5);
		
	}
	
}



