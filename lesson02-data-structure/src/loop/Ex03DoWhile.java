package loop;

public class Ex03DoWhile {

	public static void main(String[] args) {
		// tương tự với while 
		// statements bên trong luôn đc thực thi ít nhất một lần ruì mớikiểm tra    
		
		// thông thương luôn dùng while
		// thấy rằng khiểm tra đầu tien luôn đúng\
		int a = 8;
		int b = 26;
		int running = a;
		do {
			if(running%5==0) {
				System.out.println("bội của 5 la "+running);
			}
			running++;
		} while (running<=b);
		
		running = a;
		while (running<b) {
			System.out.println("prefix "+running);
			if(running==10) {
				continue;
			}
			running++;
			System.out.println("suffix "+running);
			
		}

	}

}
