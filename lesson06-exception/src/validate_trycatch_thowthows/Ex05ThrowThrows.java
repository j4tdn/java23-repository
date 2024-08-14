package validate_trycatch_thowthows;

import java.io.File;
import java.io.IOError;
import java.io.IOException;

public class Ex05ThrowThrows {

	public static void main(String[] args) {
			
		try {
			createFile("java23_text.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("finished");
		
	}

	private static File createFile(String path) throws IOException{
		File file = new File(path);
		if(!file.exists()) {
			file.createNewFile(); // Hàm có sẵn của Java
		}
		return file;
	}
}
