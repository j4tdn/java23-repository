package test01.view;

import java.text.DecimalFormat;

import test01.utils.IoUtils;

public class Ex01MinFactional {

	private static DecimalFormat df = new DecimalFormat("#,###");

	public static void main(String[] args) {
		double number = IoUtils.inputDecimal();
		System.out.println("fractional --> " + getMinFract(number));
	}

	private static String getMinFract(double number) {
		String[] parts = String.valueOf(number).split("\\.");
		int intPart = Integer.parseInt(parts[0]);
		int decPart = Integer.parseInt(parts[1]);
		int decPartLength = String.valueOf(decPart).length();

		double numerator = intPart * Math.pow(10, decPartLength) + decPart;
		double denominator = Math.pow(10, decPartLength);

		double gcd = gcd(numerator, denominator);

		return df.format(numerator / gcd) + "/" + df.format(denominator / gcd);
	}

	private static double gcd(double a, double b) {
		while (a != b) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		return a;
	}
}
