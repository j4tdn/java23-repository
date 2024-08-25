package test01.view;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

import test01.util.IOUtils;

public class Ex01MinFraction {
	
	private static DecimalFormat df = new DecimalFormat("#,###.#");
	public static void main(String[] args) {
		double number = IOUtils.inputDecimal();
		System.out.println("fractional --> " + getMinFract(number));
		
	}
	
	/*
	 	0.1 -> 1/10
	 	0.2 -> 1/5
	 	0.04 -> 1/25
	 	0.75 -> 3/4
	 	1.5 -> 3/2
	 */
	
	// tim phan so toi gian 
	// 0.04 --> 4/100 ->  UCLN = 1/25 -> chia cho UCLN
	
	// 4/100 --> GiaTriPhaThapPhan/ 10 ^ (so chu so phan thap phan)
	// 0.2 --> 2/10
	// 0.752 --> 752/1000
	// 125.34 00 --> 12534/100
	
	// 1.5 -> 15/10 --> (GiaTriPhanNguyen*10^SoChuSoThapPhan + GiaTriPhanThapPhan) / 10^SoChuSoThapPhan
	
	// numerator: tử số
	// denominator: mẫu số 
	
	private static String getMinFract(double number)
	{
		String numberAsString = String.valueOf(number); // "0.04"
		String[] parts = numberAsString.split("\\.");
 		int intPart = Integer.parseInt(parts[0]);
		int decPart = Integer.parseInt(parts[1]);
		
		int decPartLength = String.valueOf(decPart).length();
		double numerator = intPart * Math.pow(10, decPartLength) + decPart;
		double denominator = Math.pow(10, decPartLength);
		
		double gcd = gcd(numerator, denominator);
		
		return df.format(numerator/gcd) +"/" + df.format(denominator/gcd);
	}
	
	private static double gcd(double a, double b) {
		while (a!= b ) {
			if( a > b) {
				a = a - b;
				
			} else {
				b = b - a;
				
			}
		}
		return a;
	}

	
}
	// 12, 18
	// UCL: 6
	// (12*18)/BCNN(12,18)
	
