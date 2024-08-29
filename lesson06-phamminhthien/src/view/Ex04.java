package view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args) {
		readNumber();
	}
	
	private static void readNumber() {
		Scanner ip = new Scanner(System.in);
		int number;
		while (true) {
			try {
				System.out.println("======================================");
				System.out.print("Nhập vào số nguyên có tối đa 3 chữ số: ");
				number = ip.nextInt();
				if (number < 0 || number > 999) {
					throw new Exception("Số không hợp lệ. Vui lòng nhập một số có tối đa 3 chữ số.");
				}
				
				System.out.println("Đọc số " + number + " là: " + convertNumberToWords(number));
				
				System.out.println("======================================");
				break;
			}catch (InputMismatchException e) {
				System.out.println("Lỗi: Vui lòng nhập số nguyên.");
				ip.next();
			}catch (Exception e) {
				System.out.println("Lỗi: " + e.getMessage());
			} 
		}
		ip.close();
	}
	private static String convertNumberToWords(int number) {
		String[] units = {"", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
        String[] tens = {"", "mười", "hai mươi", "ba mươi", "bốn mươi", "năm mươi", "sáu mươi", "bảy mươi", "tám mươi", "chín mươi"};
		
        if(number ==0) return "không";
        
        StringBuilder words = new StringBuilder();
        int hundreds = number/100; 
        int tensPart = (number%100)/10;
        int unitsPart = number%10;
        
        if(hundreds > 0) {
        	words.append(units[unitsPart]).append(" trăm");
        	if(tensPart == 0 && unitsPart == 0)
        		words.append(" linh");
        }
        
        if(tensPart > 0) {
			if (tensPart == 1)
				words.append(" mười");
			else
				words.append(" ").append(tens[tensPart]);
        }
			
        if(unitsPart > 0) {
        	if(tensPart>0) {
        		if(unitsPart==1)
        			words.append(" mốt");
        		else if(unitsPart==5)
        			words.append(" lăm");
        		else
        			words.append(" ").append(units[unitsPart]);
        	}else
        		words.append(" ").append(units[unitsPart]);
        }
        
        return words.toString().trim();
        
	
	}
}
