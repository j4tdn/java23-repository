package view;

public class Ex09PrimeNumber200th {
//	Viết chương trình tìm số nguyên tố thứ 200 trong hệ thống số tự nhiên.
//	Tham khảo công thức: https://bit.ly/3oZDzNm
	public static void main(String[] args) {
		int count = 0;
		int i = 1;
		while(count!=200) { //đếm đến khi tới 200
			if(isPrime(i))
				count++;
			i++;
		}
		System.out.println(i-1); //vì i++ trong while 
	}
	
	private static boolean isPrime(int n) {
		if(n>=2)
		{
			for (int i = 2; i<=n/2;i++) {
				if(n%i == 0)
					return false;
			}
			return true;
		}
		return false;
	}
}
