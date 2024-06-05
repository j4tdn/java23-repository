package loop;

import java.util.Random;

public class Ex02While {

	public static void main(String[] args) {
		
		Random rd = new Random();
	final int a = rd.nextInt(5,11);
	final int b = rd.nextInt(20,30);
		
		System.out.println(" gia tri a = " + a);
		System.out.println(" gia tri b = " + b);
		
		for (int i = a; i <= a; i++){
			if( i % 4 == 0 ) {
				System.out.println(" i --> " + i);
			}
		}
		
		int i = a;
		while (i <= b){
			if( i % 4 == 0 ) {
				System.out.println(" i --> " + i);
			}
			i++;
		}
	
		
		i = a;
		while (true){
			if( i % 4 == 0 ) {
				System.out.println(" i --> " + i);
			}
			i++;
			if (i > b) {
				break;
			}
			
		}
		
		
		
	}
	
}
