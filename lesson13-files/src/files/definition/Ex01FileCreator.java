package files.definition;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Ex01FileCreator {
	
	/*
	 Xử lý bài toán liên quan đến tập tin, thư mục
	 
	 --> Sử dụng : File, Path
	 --> Hỗ trợ : Files
	 
	 1. Tạo file
	 	+ thuộc 1 foder đã tồn tại --> ok
	 	+ thuộc 1 fodẻ chưa tồn taj --> lỗi parent not found
	 	--> tự fix lỗi bằng cách tạo lun foder cha
	 */
	
	public static void main(String[] args) {
		
		File file = new File("bkit/java23/lesson13-files.txt");
		System.out.println("Tên : " +file.getName());
		System.out.println("Đường dẫn tương đối: " + file.getPath());
		System.out.println("Đường dẫn tuyệt đối: " + file.getAbsolutePath());
		try {
			System.out.println("Đường dẫn hệ thống " + file.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
}

