package loop;

public class Ex03DoWhile {

	public static void main(String[] args) {
		
//		Tương tự với while 
//		statements bên trong {} luôn được thực thi ít nhất 1 lần
//	thong thường cứ dùng while
//thấy rằng -> lần kiểm tra đầu tiên luôn dùng -> do while
		
		int a = 8;
		int b = 26;
		
		int running = a;
		do {
			if(running % 5 == 0) {
				System.out.println("Boi so cua 5 --> " +running);
			}
			running++;
		}			while(running <= b);
//			Dang duyet 
//			ket thuc vong lap --> break
//			ket thuc vong lap hien tai -->continue
		
		running = a;
		while(running <= b) {
			System.out.println("prefix --> " +running);
			if(running == 10) {
				break;
// continue khi sử dụng continue thì khi tới running = 10 thì vòng lặp sẽ vòng lại lên trên và cứ lặp lại tuần hoàn prefix = 10
		       		
			}
			System.out.println("surfix -->" +running);
		}
	}
}
