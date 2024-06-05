package loop;

public class Ex03DoWhile {

	public static void main(String[] args) {
		// Tương tự với ưhile
		// Statement bên trong {} luôn được thực thi ít nhất 1 lần đầu
		
		// Thông thường cứ dùng while
		// Thất rằng -> lần kiểm tra đầu tiên luôn đúng -> do-while
		int a = 8;
		int b = 26;
		
		int running = a;
		do {
			if (running % 5 == 0) {
				System.out.println("Bội của 5 --> " + running);
			}
			running++;
		} while(running <= b);
		
		
		// Đang duyệt
		// Kết thúc vòng lặp -> break
		// Kết thúc vòng lặp hiện tạo -> continue
		
		running = a;
		while (running <= b) {
			running++;
			System.out.println("prefix -> " + running);
			if (running == 10) {
				continue;
			}
			System.out.println("sufix -> " + running);
		}
		
	}
	
}
