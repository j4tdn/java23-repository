package view;

import java.math.BigInteger;
import java.util.Scanner;

public class Ex04EquivalentPrime {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập số N: ");
		BigInteger n = ip.nextBigInteger();
		
		System.out.println("Nhập số M: ");
		BigInteger m = ip.nextBigInteger();
		
		BigInteger factorN = primeFactors(n);
		BigInteger factorM = primeFactors(m);
		
		if(factorN.equals(factorM)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		ip.close();
	}
	
	public static BigInteger primeFactors(BigInteger n) {
		BigInteger factorization = BigInteger.ONE;
		BigInteger two = BigInteger.valueOf(2);
		
		while(n.mod(two).equals(BigInteger.ZERO)) {
			factorization = factorization.multiply(two);
			n = n.divide(two);
		}
		
		BigInteger i = BigInteger.valueOf(3);
		while(i.multiply(i).compareTo(n) <= 0) {
			while(n.mod(i).equals(BigInteger.ZERO)) {
				factorization = factorization.multiply(i);
				n = n.divide(i);
			}
			i = i.add(two);
		}
		
		if(n.compareTo(BigInteger.ONE) > 0) {
			factorization = factorization.multiply(n);
		}
		
		return factorization;
	}
	
}