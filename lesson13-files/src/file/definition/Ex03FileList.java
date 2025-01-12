package file.definition;

import java.io.File;
import java.util.Arrays;

public class Ex03FileList {
	
	public static void main(String[] args) {
		
		System.out.println("os separator: " + File.separator);
		
		File file = new File("C:\\Users\\Desktop");
		
		if(!file.exists()) {
			System.out.println("!File " + file.getPath() + " is not existed");
			return;
		}
		
		// xóa các file là mp4 hoặc mov
		Arrays.stream(file.listFiles()) // Stream<File
			 .forEach(subF -> {
				 if (subF.getName().equals("edit (1).dox")) {
					 subF.delete();
					 System.out.println("File " + subF.getPath() + " is deleted");
				 }
			 });
	}
	
}
