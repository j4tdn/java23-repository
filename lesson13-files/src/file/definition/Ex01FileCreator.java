package file.definition;

import java.io.File;
import java.io.IOException;

import static utils.FileUtils.createFile;

public class Ex01FileCreator {

	/*
	 Xử lý bài toán liên quan đến tập tin, thư mục
	 
	 --> Sử dụng: File, Path
	 
	 --> Hỗ trợ: Files
	 
	 1. Tao file
	  	+ Thuoc 1 folder da ton tai --> ok
	  	+ Thuoc 1 folder chua ton tai --> loi parent not found
	  	  --> tu fix loi bang cach tao luon folder cha
	 */
	
	public static void main(String[] args) {
		File file = createFile("bkit/java23/lesson13-files.txt");
		
		System.out.println("\n---------------------------------\n");
		
		System.out.println("Tên: " + file.getName());
		System.out.println("Đường dẫn tương đối: " + file.getPath());
		System.out.println("Đường dẫn tuyệt đối: " + file.getAbsolutePath());
		
		try {
			System.out.println("Đường dẫn hệ thống: " + file.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
