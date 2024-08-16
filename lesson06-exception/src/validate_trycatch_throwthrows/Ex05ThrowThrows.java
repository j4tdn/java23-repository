package validate_trycatch_throwthrows;

import java.io.File;
import java.io.IOException;

public class Ex05ThrowThrows {

	public static void main(String[] args) {
		
		try {
			createFile("java23_test.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("finished");
	}
	
	private static File createFile(String path) throws IOException {
		File file = new File(path);
		if(!file.exists())
			file.createNewFile(); // hàm có sẵn của Java
		return file;
	}
}
