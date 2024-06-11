package view;

import java.util.Random;

public class Ex04SumOfFactorial {
	public static void main(String[] args) {
		Random rand = new Random();
        int a = rand.nextInt(10,21); 
        int b = rand.nextInt(10,21);
        int c = rand.nextInt(10,21);
        int d = rand.nextInt(10,21);

        long factorialA = factorial(a);
        long factorialB = factorial(b);
        long factorialC = factorial(c);
        long factorialD = factorial(d);

        long sum = factorialA + factorialB + factorialC + factorialD;

        System.out.println("Các số nguyên ngẫu nhiên là: a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);
        System.out.println("Tổng các giai thừa: sum = " + sum);
    }

    public static long factorial(int n) {
        long result = n;
        for (int i = n-1; i >0 ; i--) {
            result *= i;
        }
        return result;
    }
	
}
