package deadlock;

public class SuspendResumeDeadLock {

	private static Object data = new Object();
	
	public static void main(String[] args) throws InterruptedException{
		
		final Thread thread1 = new Thread("Thread-1") {
			public void run() {
				System.out.println(Thread.currentThread().getName() + " has started.");
				// synchronized data
				synchronized (data) {
					System.out.println(Thread.currentThread().getName() + " has obtained lock on data " + " & suspended...");
					
					Thread.currentThread().suspend(); // pause
					
					System.out.println(Thread.currentThread().getName() + " has released lock on data");
				}
				System.out.println(Thread.currentThread().getName() + " has ENDED.");
			}
		};
		thread1.start();
		Thread.sleep(2000);

		final Thread thread2 = new Thread("Thread-2") {
			public void run() {
				System.out.println(Thread.currentThread().getName() + " has started.");
				System.out.println(Thread.currentThread().getName() + " is trying to obtain lock on data");
				
				thread1.resume();
				
				synchronized (data) {
					System.out.println(Thread.currentThread().getName() + " has obtained lock on data");
					System.out.println(Thread.currentThread().getName() + " has released lock on data");
				}
				System.out.println(Thread.currentThread().getName() + " has ENDED.");
			}
		};
		thread2.start();
	}
}