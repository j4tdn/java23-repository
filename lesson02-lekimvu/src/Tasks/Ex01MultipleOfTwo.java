	package Tasks;

import java.util.Scanner;

public class Ex01MultipleOfTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		while (i <= 5) {
			System.out.println("Input Interger N = ");

			try {
				int N = Integer.parseInt(sc.nextLine());
				if (N % 2 == 0) {
					System.out.println(+N + " is multiple of two");
					break;
				} else
					System.out.println(+N + " is not multiple of two");
				break;
			} catch (Exception e) {
				System.out.println("Please input again interger N: ");
			}
			i++;
			if (i == 5)		{	

		
		sc.close();
			System.out.println("Over the number of entries");
			break;
	}
			
		}
}
}
