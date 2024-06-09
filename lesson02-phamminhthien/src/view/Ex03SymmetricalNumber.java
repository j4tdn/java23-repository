package view;

import java.util.Scanner;

public class Ex03SymmetricalNumber {
	
//	tìm giai thừa của một số nguyên dương
	public static void main(String[] args) {
		int N;
		System.out.print("Nhập N: ");
		Scanner ip = new Scanner(System.in);
		N = ip.nextInt();
		int result=1;
		String output = N + "! = ";

		for(int i=N; i>0 ; i--)
		{
			result*=i;
			output +=i;
			if(i > 1) output += ".";
			else output += " = " + result;
		}
		System.out.println(output);
		
	}
}
