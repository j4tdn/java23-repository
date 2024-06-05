package loop;

import java.util.Random;

public class Ex02While {

	public static void main(String[] args) {
//		In ra các số là bội của 4 từ a đến b
		
		Random rd = new Random();
		int a = rd.nextInt(5, 10);
		int b = rd.nextInt(20, 30);
		
		System.out.println("Sử dụng lệnh for: ");
		for(int i = a; i <= b ; i++) {
			if(i % 4 ==0) 
				System.out.println("i ---> " +i);			
		}
		
		System.out.println("Sử dụng lệnh while");
		int i = a;
			while(i<=b) {
				if(i % 4 ==0) {
	   System.out.println("i -->" +i); 	

}
			i++;
	}
			
	}
}