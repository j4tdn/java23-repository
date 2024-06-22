/*
	Bài 10: Viết chương trình in ra 5 số nguyên ngẫu nhiên từ 20 đến 30 → [20, 30]
	Yêu cầu: 5 số ngẫu nhiên không được trùng nhau
 */
package view;

import java.util.Random;

public class Ex10PrintInteger {
	
	public static void main(String[] args) {
		Random rd = new Random();
		
		while(true){
			int a = rd.nextInt(20,30);
			int b = rd.nextInt(20,30);
			int c = rd.nextInt(20,30);
			int d = rd.nextInt(20,30);
			if ( a == b && a == c && a == d && b == c && b == d && c == d) {
				continue;
			}
			else {
				System.out.println("a: " + a);
				System.out.println("b: " + b);
				System.out.println("c: " + c);
				System.out.println("d: " + d);
				break;
			}
		}
	}
}
