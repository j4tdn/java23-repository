package Ex04Admin;

public class Main {
	public static void main(String[] args) {
		String username = "byztkhx256";
		String password = "admin123@ ";


	}

	private static void checkPassWord(String pass) {
		if (pass.length() < 8) {
			throw new IllegalArgumentException(" Mật khẩu phải dài hơn 8 ký tự ");
		}
		if (!isA_Z(pass) || !isChar(pass) || !isNum(pass)) {
			throw new IllegalArgumentException(
					" Mật khẩu phải có ít nhất 1 chữ số, 1 kí tự in hoa, và một kí tự đặc biệt (~!@#$%^&*)");
		}

	}

	private static boolean isA_Z(String pass) {
		for (char c : pass.toCharArray()) {
			if (c >= 'A' && c <= 'Z') {
				return true;
			}
		}
		return false;
	}

	private static boolean isNum(String pass) {
		for (char c : pass.toCharArray()) {
			if (c >= '0' && c <= '9') {
				return true;
			}
		}
		return false;
	}

	private static boolean isChar(String pass) {
		for (char c : pass.toCharArray()) {
			if (c == '~' || c == '!' || c == '@' || c == '#' || c == '$' || c == '%' || c == '^' || c == '&'
					|| c == '*') {
				return true;
			}
		}
		return false;
	}

}
