package exam;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Hãy Nhập tên tài khoản");
		String Usersname = sc.nextLine();
		
		System.out.println("Nhập maath khẩu");
		String Password =sc.nextLine();
		
		
		
	}
	public static boolean isPassword(String password) {
		if(password.length()<8) {
			System.out.println("Mật khẩu phải có >= 8 kí tư");
			return false;
		}
	if(!Pattern.matches(".*\\d.*"){
		System.out.println("Mật khẩu chứa ít nhất 1 số ");
		return false;
	}
	if(!Pattern.matches("*~!@#$%^&*"){
		  sout
	}
	}
}
