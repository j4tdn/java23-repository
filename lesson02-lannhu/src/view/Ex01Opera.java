package view;

import java.io.IOException;

public class Ex01Opera {

public static void main(String[] args) throws IOException, NumberFormatException {
	
	 int N = 0;
	 int attempts = 0;
	 boolean isValid = false;
	while (!isValid && attempts < 5) {
		 System.out.println("nhập N: ");
		 StringBuilder input = new  StringBuilder();
		 int b;
		 
		 try {
			 while ((b = System.in.read()) != '\n') {
				 input.append((char) b);
				 
			 }
			 N = Integer.parseInt(input.toString().trim());
		
			 if (N > 0) {
				
				 isValid = true;
			 }else {
				 System.out.println("N là số nguyên dương. vui lòng nhập lại.");
				
			 }	
			}catch (NumberFormatException c) {
			  System.out.println("giá trị không hợp lệ. vui lòng nhập lại");
			  
		  }
		 catch (IOException d) {
			  System.out.println("đã xảy ra lỗi khi đọc giá trị nhập. vui lòng nhập lại.");
		  }
		 
		 attempts++;
		 
	 }
	 if (isValid) {
		 if (N % 2 == 0) {
			 System.out.println("true");
		 }else {
			 System.out.println("false");
			 
		 }
		 
	 }else {
		 System.out.println("bạn đã vượt quá số lần nhập tối đa.");
	 }		
					 }
}