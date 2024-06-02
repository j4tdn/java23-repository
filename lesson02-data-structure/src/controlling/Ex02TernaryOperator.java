package controlling;

import java.util.Random;

public class Ex02TernaryOperator {
	/*
	 * toan tu 3 ngoi --> su dung 100% tuong tu if else 
	 * trong truong hop dieu kien don gian su dung toan tu 3 ngoi
	 *  cu phap: expression 1(boolean)?
	 */
	public static void main(String[] args) {
		Random rd = new Random();
		int a = rd.nextInt();
		int b = rd.nextInt();
		if(a>b) {
			System.out.println("max :"+a);
		}else {
			System.out.println("max : "+b);
		}
		
		//toan tu 3 ngoi
		String text = a>b ? ("max la a= :"+a):("max la b = :"+b);
		System.out.println(text);
	}
}
