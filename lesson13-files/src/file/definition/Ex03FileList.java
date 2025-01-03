package file.definition;

import java.io.File;
import java.util.Arrays;

public class Ex03FileList {

	public static void main(String[] args) {
		
		File file = new File("D:\\Downloads");
		
		if(!file.exists()) {
			System.out.println("!File " + file.getPath() + " is not existed");
			return;
		}
		
		// Xoa cac file la mp4 hoac mov
		
		Arrays.stream(file.listFiles()) // Stream<File>
			  .forEach(subF -> {
				  if (subF.getName().equals("edit (1).docx")) {
					  subF.delete();
					  System.out.println("File " + file.getPath() + "is deleted");
				  }
			  });
	}
}
