package view;

import java.util.Random;

public class Ex04FactorialTwo {
	public static void main(String[] args) {
        Random random = new Random();
        

        int a = random.nextInt(11) + 10; // 0-10 + 10
        int b = random.nextInt(11) + 10;// 0-10 + 10
        int c = random.nextInt(11) + 10;// 0-10 + 10
        int d = random.nextInt(11) + 10;// 0-10 + 10
        //10+10 =20 thoa mang dieu kien tu 10 den 20
   
        long factorialA = factorial(a);
        long factorialB = factorial(b);
        long factorialC = factorial(c);
        long factorialD = factorial(d);
        
        long sumOfFactorials = factorialA + factorialB + factorialC + factorialD;
        
        
        System.out.println("Các số ngẫu nhiên là: " + a + ", " + b + ", " + c + ", " + d);
        System.out.println("Tổng các giai thừa: " + a + "! + " + b + "! + " + c + "! + " + d + "! = " + sumOfFactorials);
    }
    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

