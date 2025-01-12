package ex_150_java;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		int n=-1;
		
		
		int attempts =0;
		  while (n <= 0 && attempts < 5) {
	            System.out.println("Nhập số nguyên dương n:");

	            if (ip.hasNextInt()) {
	                n = ip.nextInt();
	                
	                if (n <= 0) {
	                    System.out.println("Số phải là số nguyên dương. Vui lòng thử lại.");
	                }
	            } else {
	                System.out.println("Vui lòng nhập một số nguyên hợp lệ.");
	                ip.next();  
	            }
	            
	            attempts++;
	            if (attempts == 5) {
	                System.out.println("Bạn đã nhập sai quá số lần cho phép. Kết thúc chương trình.");
	                break;
	            }
	        }
		if(n>0) {
			if(n%2==0) {
				System.out.println("Đây là bội của 2");
			}
			else {
				System.out.println("Đây không phải là bội của 2");
			}
		}
		
	}
}
