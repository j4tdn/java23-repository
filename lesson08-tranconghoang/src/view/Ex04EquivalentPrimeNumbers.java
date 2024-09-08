package view;

public class Ex04EquivalentPrimeNumbers {

	public static void main(String[] args) {

		int n = 60;
		int m = 30;
		if(isEquivalentPrimeNumbers(n, m))
			System.out.println("YES");
		else
			System.out.println("NO");
	}

	private static boolean isPrimeNumber(int n) {
		for (int i = 2; i < Math.sqrt(n); i++)
			if (n % i == 0)
				return false;
		return n > 1;
	}

	private static boolean isEquivalentPrimeNumbers(int a, int b) {
		for(int i = 2; i < Math.sqrt(a); i++)
			for(int j = 2; j < Math.sqrt(b); j++)
				if(isPrimeNumber(i) && isPrimeNumber(j)) 
					if(a % i == 0 && b % j == 0)
						if(i == j)
							return true;
		return false;
	}

}
