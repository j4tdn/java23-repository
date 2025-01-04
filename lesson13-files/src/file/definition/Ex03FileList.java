package file.definition;

import java.io.File;
import java.util.Arrays;

public class Ex03FileList {

	public static void main(String[] args) {
		
		System.out.println("os separator: " + File.separator);
		
		File file = new File("D:\\DATA\\Clip");
		
		if(!file.exists()) {
			System.out.println("File " + file.getPath() + " is not existed.");
		}
		
		// Xóa các file là mp4 hoặc mov
		Arrays.stream(file.listFiles()) // Stream<File>
			  .forEach(f -> {
				  if(f.getName().equals("edit (1).docx")) {
					  f.delete();
					  System.out.println("File " + f.getPath() + "is deleted");
				  }
			  });
		
		
	}
	
}
