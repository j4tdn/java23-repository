package loop;

import java.util.Random;

public class Ex02While {
	public static void main(String[] args) {
		// In ra các số là bội của 3 từ a[5,10] đến b[20,30]
		Random rd = new Random();
		final int a=rd.nextInt(5,11); // khi ko muốn cập nhật giá trị biến thêm từ khóa final vào
		int b=rd.nextInt(20,31);
		
		System.out.println("Giá trị a: " + a);
		System.out.println("Giá trị b: " + b);
		
		// dùng for
//		for(int i=a; i<=b; i++)
//		{
//			if(i%4 ==0)
//				System.out.println("i -->" +i);
//		}
//		
		// dùng while
		int i = a;
		while (i <= b) {
			if (i % 4 == 0)
				System.out.println("i -->" + i);
		}
		i++;

		// dùng while/break
		i = a;
		while (true) {
			if (i % 4 == 0)
				System.out.println("i -->" + i);
			i++;
			if (i > b) {
				break;
			}
		}
	}
}
