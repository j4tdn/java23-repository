package ex_150_java;

public class Ex08 {
	public static void main(String[] args) {
		int month =2;
		switch (month) {
		case 1:
			System.out.println("Tháng "+month+"có 31 nagyf");
			break;
		case 2:
			System.out.println("Tháng "+month+"có 28 nagyf");
			break;
		case 3:
			System.out.println("Tháng "+month+"có 31 nagyf");
			break;
		case 4:
			System.out.println("Tháng "+month+"có 31 nagyf");
			break;	
		default:
			System.out.println("Không hợp lệ");
			break;
		}
	}
}
