package loop;

public class Ex03DoWhile {

	public static void main(String[] args) {
		
		//Tuong tu voi while
		//Statements ben trong {} luon duoc thuc thi it nhat 1 lan(dau)
		
		//Thong thuong cu dung while
		//Thay rang -> lan kiem tra dau tien luon dung -> do while
		
		int a = 8;
		int b = 26;
		int running = a;
		do {
			if (running % 5 == 0)
				System.out.println("Boi cua 5 --> " + running);
			running++;
		} while (running <= b);

		// Ket thuc vong lap -> break
		// Ket thuc vong lap hien tai -> continue

		running = a;
		while (running <= b) {
			running++;
			System.out.println("prefix -> " + running);
			if (running == 10)
				continue;
			System.out.println("suffix -> " + running);
			running++;
		}
	}
}