/*Bài 1: Viết chương trình(hàm)	 kiểm tra số nguyên N có phải là bội của 2 hay không	
	Yêu cầu: N là số nguyên dương được nhập từ bàn phím, bắt buộc nhập lại nếu N không hợp lệ (tối
			đa 5 lần)
			VD: Nhập N = abc → báo lỗi, yêu cầu nhập lại

			= 4 → true
			= 6 → true
			= 7 → false
*/
package view;

import java.util.Scanner;

public class Ex01Multiple {
	   public static void main(String[] args) {
	        Scanner ip = new Scanner(System.in);
	        int count = 1;
	        while (true) {
	            System.out.print("ENTER N: ");
	            String input = ip.nextLine().trim();
	            if (count == 5) {
	                System.out.println("ENTER MORE THAN 5 TIMES , END");
	                break;
	            }
	            if (isValidNumber(input)) {
	                int number = Integer.parseInt(input);
	                if (number % 2 == 0) {
	                    System.out.println(input + " -->True");
	                } else {
	                    System.out.println(input + " -->False");
	                }
	            } else {
	                System.out.println("ERROR, PLEASE RE-ENTER.");
	                count++;
	            }
	        }
	        ip.close();
	    }

	    private static boolean isValidNumber(String str) {
	        if (str.isEmpty()) {
	            return false;
	        }
	        for (int i = 0; i < str.length(); i++) {
	            if (!Character.isDigit(str.charAt(i))) {
	                return false;
	            }
	        }
	        return true;
	    }
	}
