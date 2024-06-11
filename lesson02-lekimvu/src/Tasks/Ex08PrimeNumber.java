package Tasks;

import java.util.Scanner;

public class Ex08PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Number: ");
		int n = sc.nextInt();
		int i;
		do {
			 i = 2; 
			if (n % i == 0) {
				System.out.println(+n + " is not a prime");
				break;
			} else
				System.out.println(+n + " is a prime");
			break;
		} while( i< n - 1);
		i++;
		
	}
}

//public static void main(String[] args) {

//	Scanner sc = new Scanner(System.in);
//	System.out.print("Input Number = ");
//	String n = sc.nextLine();
//	if(!checkString(n)) System.out.println("Available Number");
//	else System.out.println("Inavailable Number");
//	Prime(n);
//	System.out.println(+n.length()+" is a prime");
//	System.out.println(n.length()+" is not a prime");
//}
//private static boolean checkString(String n) {
//	for(int i = 0; i < n.length(); i++)
//		if(n.charAt(i) < 48 || n.charAt(i) > 57 ) 
//			return false;
//	return true;
//}
