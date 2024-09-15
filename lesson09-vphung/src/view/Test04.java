package view;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test04 {

	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Nhập tên tài khoản: ");
		String user = ip.nextLine();
		
		System.out.println("Yêu cầu mật khẩu như sau:\n"
				+ "1. Độ dài mật khẩu: >= 8\r\n"
				+ "2. Có ít nhất 1 chữ số, 1 kí tự in hoa, và một kí tự đặc biệt (~!@#$%^&*)\r\n"
				+ "3. Không được trùng quá 3 ký tự với tên tài khoản");
		System.out.println("Nhập mật khẩu: ");
		String password = ip.nextLine();
		
		if (checkPassword(password, user)) {
			System.out.println("Đăng kí thất bại! Vui lòng nhập mật khẩu khác");
		} else {
			System.out.println("Đăng kí tài khoản thành công");
		}
		
	}
	
	private static boolean checkPassword(String password, String user ) {
		
		// Kiểm tra độ dài mật khẩu
        if (password.length() < 8) {
            return false;
        }
        
        // Kiểm tra một chữ số
        if (!Pattern.compile("[0-9]").matcher(password).find()) {
            return false;
        }
        
        // Kiểm tra ký tự in hoa
        if (!Pattern.compile("[A-Z]").matcher(password).find()) {
            return false;
        }
        
        // Kiểm tra ký tự đặc biệt
        if (!Pattern.compile("[~!@#$%^&*]").matcher(password).find()) {
            return false;
        }
        
        // Kiểm tra không trùng quá 3 ký tự với tên tài khoản
        
        
        return true;
    }
}
	

