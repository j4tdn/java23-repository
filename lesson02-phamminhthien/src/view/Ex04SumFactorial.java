package view;

import java.util.Random;
// trình tính tổng giải thừa của các số nguyên dương S = a! +b! + c! + d!
public class Ex04SumFactorial {
	public static void main(String[] args) {
		calculateSumFactorial();
	}
	
	//Cách 1:
//	public static void calculateSumFactorial () {
//		long S = 0;
//		long result1=1;
//		long result2=1;
//		long result3=1;
//		long result4=1;
//		Random rd = new Random();
//		
//		int a = rd.nextInt(10,21);
//		int b = rd.nextInt(10,21);
//		int c = rd.nextInt(10,21);
//		int d = rd.nextInt(10,21);
//		
//		for(int i=a; i>0 ; i--)
//		{
//			result1*=i;
//		}
//		System.out.println("a! = "+result1);
//		
//		for(int i=b; i>0 ; i--)
//		{
//			result2*=i;
//		}
//		System.out.println("b! = "+result2);
//		
//		for(int i=c; i>0 ; i--)
//		{
//			result3*=i;
//		}
//		System.out.println("c! = "+result3);
//
//		for(int i=d; i>0 ; i--)
//		{
//			result4*=i;
//		}
//		System.out.println("d! = "+result4);
//		S = result1+result2+result3+result4;
//		System.out.println("\nTổng giai thừa: \nS = " + S);
//		
//	}
	
	//Cách 2:
	public static void calculateSumFactorial() {
        long S = 0;
        Random random = new Random();
        
        int[] numbers = new int[4];
        for (int i = 0; i < 4; i++) {
            numbers[i] = random.nextInt(10, 21);
            long factorial = Factorial(numbers[i]);
            S += factorial;
            System.out.println(numbers[i] + "! = " + factorial);
        }
        System.out.println("\nTổng giai thừa: \nS = " + S);
    }

	public static long Factorial(int number) {
		long result = 1;
        for (int i = number; i > 0; i--) {
            result *= i;
        }
		return result;
	}
}
