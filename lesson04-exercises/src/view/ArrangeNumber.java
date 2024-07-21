package view;

public class ArrangeNumber {
	package view;

	import java.util.Arrays;
	import java.util.Random;
	import java.util.Scanner;

	public class ArrangeNumber {

		public static void main(String[] args) {
	// nhập n bao nhiêu số nguyên 
//			ngẫu nhiên	
//			đếm bao nhiêu số chia cho 7
//			                           5
//			                        5 và 7
//			                         còn lại
//			duyệt mảng từng cái: mảng chia cho số bằng tưng úng số lần đếm 
//			
			
			Random rd = new Random();
			Scanner sc = new Scanner(System.in);
				System.out.println("Input n: ");
				int n = sc.nextInt();
				if( n < 5 || n > 100) {
					System.out.println("Input again: ");
					return;
				}
				
				int[] number = new int[n];
				int countdiv5 =0;
				int countdiv7 =0;
				int countdiv57 =0;
				int countdiv =0;

				int[] numbers = int[n];
	for( int i = 0; i<100;i++) {
		numbers[i] = rd.nextInt(5,100)+1;
				}
	    System.out.println("Input: " +Arrays.toString(number));	
	    
	    for(int number : numbers) {
	    	if(number % 7 ==0) {
	    		countdiv7++;
	    	} else if(number % 5 ==0) {
	    		countdiv5++;
	    }else if(number % 57 ==0) {
			countdiv57++;
	    }	else 
				countdiv++;
	    }
	    
	    int[] div7 = new int[countdiv7];
	    int[] div5 = new int[countdiv5];
	    int[] div57 = new int[countdiv57];
	    int[] div = new int[countdiv];
	    
	    int index7=0;
	    int index5=0;
	    int index57=0;
	    int index=0;
	    
	    for(int number : numbers) {
	    	if(number % 7 ==0) {
	    		div7[index7] = number;
	    		index7++;
	    	}else 
	    		if(number % 5 ==0) {
	        		div5[index5] = number;
	        		index5++;
	    }else
	    	if(number % 57 ==0) {
	    		div7[index57] = number;
	    		index57++;
	    	} 
	    	index++;
	    
	    	int[] result = new int[n];
	    	int indexs =0;
	    	
	    	for(int numbers1 : div7) {
	    		result[indexs] = numbers1;
	    	}
	    		
	    	for(int number : div5) {
	    		result[indexs] = number;
	    	}
	    	for(int number : div57) {
	    		result[indexs] = number;
	    	}
	    	for(int number : div) {
	    		result[indexs] = number;
	    	}
	    		
		
	    
	    

	    }}}

}
