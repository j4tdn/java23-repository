package loop;

import java.util.Random;

public class Ex02While {
	public static void main(String[] args) {
		//in ra các số là bội của 3 từ a đến b
		Random  rd=new Random(); 
		
		int a = rd.nextInt(3,11);
		int b =rd.nextInt(20,31);
		
		System.out.println("gia trị của a "+a);
		System.out.println("giá trị của b "+b);
		
		System.out.println("su dung for");
		for(int i= a;i<=b;i++) {
			if(i%4==0) {
				System.out.println("i->"+i);;
			}
		}
		System.out.println("su dung while");
		int i=a;
		while(i<=b) {
			if(i%4==0) {
				System.out.println("i->"+i);
			}
			i++;
		}
		System.out.println("sử dụng while/break");
		 i=a;
		while(true) {
			if(i%4 ==0) {
				System.out.println("i->"+i);
			}
			i++;
			if (i>b) {
				// khi gap break se thoat khoi vong lap
				break;
			}
		}
		
	}
}
