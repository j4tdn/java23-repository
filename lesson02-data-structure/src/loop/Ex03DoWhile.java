package loop;

public class Ex03DoWhile {
	public static void main(String[] args) {
		//tương tự với while
		//statements bên trong{} luôn thưc thi ít nhất 1 lần (đầu)
		
		//thông thường cứ dùng while
		int a = 8;
		int b = 26;
		
		int running = a;
		do {
			if(running % 5 == 0) {
				System.out.println("bội của 5 --> " + running);
			}
			running++;
			
		}while(running <= b);
		
		//đang duyệt
		//kết thúc vòng lặp -> break
		//kết thúc vòng lặp hiện tại -> continue
		
		 running = a;
		 while(running <= b) {
			 running++;
			 System.out.println("prefix -> " + running);
			 if (running == 10) {
				 continue;
				 
			 }
			 System.out.println("suffix -> " + running);
			
		 }
	}
}

