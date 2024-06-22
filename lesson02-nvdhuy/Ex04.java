package view;

import java.util.Random;

public class Ex04 {

    public static void main(String[] args) {
        Random random = new Random();
        int a = getRandom(random);
        int b = getRandom(random);
        int c = getRandom(random);
        int d = getRandom(random);

        System.out.println("Các số nguyên ngẫu nhiên: a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);

        long sum = calculateFactorial(a) + calculateFactorial(b) + calculateFactorial(c) + calculateFactorial(d);

        System.out.println("Tổng giai thừa của các số nguyên ngẫu nhiên S = " + sum);
    }

    public static int getRandom(Random random) {
        return random.nextInt(10, 20); 
    }

    public static long calculateFactorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
