package loop;

public class Ex03DoWhile {
	
	public static void main(String[] args) {
		// Tương tự với while
		// Statemenets bên trong {} luôn được thực thi ít nhất 1 lần
		
		// Thông thường -> cứ dùng while
		// Thấy rằng -> Lần kiểm tra đầu tiên luôn luôn đúng -> chuyển sang dùng -> do while
		int a = 8; 
		int b = 26;
		
		int running = a;
		do {
			if ( running % 5 == 0) {
				System.out.println("Bội của 5 -->" + running);
			}
			running++;
		} while(running <= b);
		
		// Đang duyệt
		// Kết thúc vòng lặp =>
		// Kết thúc vòng lặp hiện tại -> continue();
		
		running  = a;
		while( running <= b) {
			running ++;
			System.out.println("prefix => "+ running);
			if ( running == 10) {
				continue;
			}
			System.out.println("suffix -> " + running );
		}
		
	
	}
	
}
