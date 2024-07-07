package view_fixcode;

import utils.IoUtils;
import utils.MathUtils;

public class Ex03Factorial {
	public static void main(String[] args) {
		int number = IoUtils.input(3);
		System.out.println("f(" + number + ") = " + MathUtils.getFact(number));
	}
}
