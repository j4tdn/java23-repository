package thread.core;

public class Ex05 {

	// volatile >> read data from memory
	// non-volatile >> read data from each CPU cache >> reduce wrong case
	private static volatile int counter = 2;
	
	// #main
	public static void main(String[] args) {
		System.out.println("Thread main start");
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("#thread1 is running ...");
				counter++;
				System.out.println("#thread1 counter: " + counter);
				
			}
		}, "thread1");
		t1.start();
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("#thread2 is running ...");
				counter *= 2;
				System.out.println("#thread2 counter: " + counter);
				
			}
		}, "thread2");
		t2.start();
		
		counter += 2;
		System.out.println("#main counter: " + counter);
		System.out.println("Thread main end");
		
	}
}