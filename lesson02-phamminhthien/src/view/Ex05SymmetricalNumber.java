package view;

import java.util.Scanner;
// kiểm tra N có phải là số đối xứng hay không
public class Ex05SymmetricalNumber {
	public static int N;
	public static void main(String[] args) {
		input();
	}

	public static void input() {
		int sl = 1;
		Scanner ip = new Scanner(System.in);
		while (sl < 6) {
			System.out.print("Nhập N: ");
			if (ip.hasNextInt()) {
				N = ip.nextInt();
				if (N < 10) {
					System.out.println("Lỗi - " + sl + ", Vui lòng nhập lại\n");
					sl++;
				} else {
					isPalindrome();
//					break;
				}
				
			}
			else {
				System.out.println("Lỗi - " + sl + ", Vui lòng nhập lại\n");
				sl++;
				ip.next();

			}
		}
	}
	
	public static void isPalindrome() {
		int oN = N; // gán vì để so sánh, ko dùng N vì xử lý sẽ thay đổi giá trị
		int rN=0;
		while(N!=0) {
			int digit = N%10; //Lấy số cuối
//			System.out.println("digit -->"+digit); 
			rN = rN*10 + digit;  //Cộng dồn vào để thành só đảo ngược
//			System.out.println("rN -->"+rN);
			N /=10;  // Loại bỏ só cuối
//			System.out.println("N -->" +N+"\n");
//			System.out.println("oN -->" + oN +"\n");
			
		}
//		System.out.println("rN --> "+rN);
		if(oN == rN) System.out.println("--> "+oN + " là số đối xứng\n"); //sout oN là vì nhận giá trị của N ban đầu nhập vào ko bị thay đổi giá trị
		else System.out.println("--> "+oN + " Ko phải là số đối xứng\n");
		
	}
}
