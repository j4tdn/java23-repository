package Tasks;

import java.util.Scanner;

public class Ex02PowerOfTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Input the number:");
	    String n = sc.nextLine();
	    int count = 0;
	    do {
	    	if(isNumber(n)) {
	    		if(isPowerOfTwo(Integer.parseInt(n))) {
	    			System.out.println(n+" is power of two");
	    			break;
	    		}else 
	    			System.out.println(n+" is not the power of two");
	    		break;
	    	}
	    }while(count < 5);
	    	count++;
	}

	public static boolean isPowerOfTwo(int n) {
		do {
			if (n % 2 == 0) {
				n = n / 2;
				return true;
			}
			return false;
		} while (n != 1);
	}

	public static boolean isNumber(String n) {
		try {

			int i = Integer.parseInt(n);
			return true;
		} catch (Exception e) {
			return false;			
		}
	}
}
