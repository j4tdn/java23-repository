package loop;

public class Ex03DoWhile {

	public static void main(String[] args) {
		int  a = 8;
		int b = 26;
		int running = a;
		do {
			if (running % 5 == 0) {
				System.out.println(" booi cua 5 --> " + running);
			}
			running ++;
				
		}while (running <= b);
		
		// keets thuc vòng lặp 
		
		running = a;
		while (running <= b) {
			running++;
			System.out.println(" prefix --> " + running );
			if(running == 10) {
				
				continue;
			}
			System.out.println("sunffix -> " + running);
			
		}
		
		
	}
	

}
