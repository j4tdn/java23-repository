package loop;

public class Ex03Dowhile {
	/*
	 Tương tự while
	 Statement bên trong luôn dc thực thi ít nhất 1 lần (đầu)
	 
	 Thông thường cứ while
	 Thầy rằng --> lần kt đầu tiên lun đúng -->do-while
	 */
	public static void main(String[] args) {
		int a=8;
		int b=26;
		
		int running=a;
		do {
			if(running %5==0)
				System.out.println("Bội của 5: " + running );
			running++;
		}while(running<=b);
		
		// Đang duyệt 
		// Kết thúc vòng lặp --> break
		// Kết thúc vòng lặp --> continue
		
		running = a;
		while(running <= b) {
			running ++;
			System.out.println("\nprefix -> " + running);
			if(running ==10)
				continue;
			System.out.println("sufix -> " + running+ "\n");

		}
		
	}
}
