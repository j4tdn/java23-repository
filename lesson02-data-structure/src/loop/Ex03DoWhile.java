package loop;

public class Ex03DoWhile {
	public static void main(String[] args) {
       //tương tự while 
		// Statements bên trong {} luôn được thực thi ít nhất môt lần
		
		// thông thường cứ dùng while
		// thấy rằng -> lần kiểm tra đầu tiên luôn đúng --> do while
		int a = 8;
		int b = 26;
		 
		int running = a;
		 do { 
			 if (running % 5 == 0) {
				 System.out.println("Bội của 5 -->" + running);
			 }
			 running++;
		 }while (running <= b);
		 
		 // đang duyệt
		 // kết thúc vòng lặp -> break
		 // kết thúc lặp hiện tại -> continue
		 
		 running = a;
		 while(running <= b) {
			 running++;
			 System.out.println("prefix  -> "+ running);
			 if (running == 10 ) {
				 continue;
			 }
			 System.out.println("suffix" + running);
		 }
	}
}
