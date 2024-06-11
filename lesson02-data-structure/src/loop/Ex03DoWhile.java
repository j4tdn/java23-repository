package loop;

public class Ex03DoWhile {
	public static void main(String[] args) {
		//tuong tuu vs while
		//statements ben trong{} luon duocj thuc thi it nhat 1 lan
		
		//thong thuong cu dung while
		//thay rang -> lan dau ktra luon dung -> do while
		int a=8;
		int b=26;
		
		int running =a;
		do {
			if(running %5== 0) {
				System.out.println("Boi cua 5->"+running);
			}
			running++;
		}while(running <=b);
		
		//dang duyet
		//ket thuc vong lap->break
		//ket thuc vong lap hien taij ->continue
		
		running = a;
		while (running <= b) {
			System.out.println("prefix ->" + running);
			if (running == 10) {
				continue;
			}
			System.out.println("suffix->" + running);
			running++;
		}
	}
}
