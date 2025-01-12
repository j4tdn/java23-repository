package thread.core;

public class Ex05 {
	private static int counter =2;
	
	//main
	
	
	//dự đoán
	//m12 >> 4.5.10
	//m21
	//12m
	//1m2
	//21m
	//2m1
	public static void main(String[] args) {
			System.out.println("thread main start");
			
			Thread t1 = new Thread(new Runnable() {
				
				@Override
				public void run() {
					System.out.println("#thread 1 is running ...");
					counter++;
					System.out.println("#thread1 counter :" +counter);
				}
			});
			t1.start();
			
			Thread t2= new Thread(new Runnable() {

				@Override
				public void run() {
					System.out.println("#thread 2 is running ...");
					counter *=2;
					System.out.println("#thread 2 counter :" + counter);
				}
			});
			t2.start();
			
			counter +=2;
			System.out.println("#main counter :"+ counter);
			System.out.println("thread main ends");
	}
}
