package thread.core;

import static utils.ThreadUtils.*;

import java.util.concurrent.TimeUnit;

public class Ex01 {

	// thread main
	public static void main(String[] args) {
		
		// Thread t1 = new Thread(runnable);
		// t1.start(); >> t1.run()[native method] >> t1.run() {runnable.run();}
		
		System.out.println("main start");
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				// prepare data took 2s
				doTask(2, TimeUnit.SECONDS);
				
				printCurrentThreaadName();
				System.out.println("running a task ...");
			}
		}, "thread1");
		t1.start(); // automatically call t1.run >> runnable
		// khi gọi start() nó mới tạo ra thread thật sự, độc lập chạy song song với nhau
		// ko gọi làm run() trực tiếp vì nó giống mik tạo 1 hàm trong thread rồi gọi -> kiểu chạy tuần tự từ trên xuống dưới -> chỉ thực thi trong cái thread hiện tại
	    // còn gọi start() trong code nó sẽ làm j đó trong máy ảo java, gọi đến logical processor trên máy mình riêng xong tự động gọi hàm run()

		// current thread
		printCurrentThreaadName();
		
		System.out.println("main end");
	}
	
}


//---------- Cách khác nhưng ko nên
//		Thread t2 = new Thread("thread2") {
//			@Override
//			public void run() {
//				// prepare data took 2s
//				doTask(2, TimeUnit.SECONDS);
//				
//				printCurrentThreaadName();
//				System.out.println("running a task ...");
//			}
//		};
//		t2.start();
		
		