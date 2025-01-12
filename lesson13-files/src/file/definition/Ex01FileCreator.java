package file.definition;

import static utils.FileUtils.*;
import java.io.File;
import java.io.IOException;

public class Ex01FileCreator {

	/*
	  Xử lý bài toán liên quan đến tập tin, thư mục
	  
	  --> Sử dụng: File, Path
	  
	  --> Hỗ trợ: Files
	 */
	
	public static void main(String[] args) {
		File file = createdFile("bkit/java23/lesson13-files.txt");
		
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