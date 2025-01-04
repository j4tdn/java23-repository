package utils;

import java.util.concurrent.TimeUnit;

public class ThreadUtils {

	public ThreadUtils() {
	}
	
	public static void printCurrentThreaadName() {
		// current thread
		System.out.println(">> thread #" + Thread.currentThread().getName());
	}
	
	public static void startThread() {
		// current thread
		System.out.println(Thread.currentThread().getName() + " is running ...");
	}
	
	public static void startThread(long time) {
		// current thread
		System.out.println(Thread.currentThread().getName() + " is running ..." + time);
	}
	
	public static void endThread(long start) {
		System.out.println(Thread.currentThread().getName() + " took " + (System.currentTimeMillis() - start));
	}
	
	public static String getThreadName() {
		return Thread.currentThread().getName();
	}
	
	// virtual task with a certain time
	public static void doTask(long time, TimeUnit unit) {
		try {
			unit.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	// block current thread
	public static void join(Thread thread) {
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}