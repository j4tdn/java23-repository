package validate_trycatch_throwthrows;

import java.io.File;
import java.io.IOException;

public class Ex05ThrowThrows {

	public static void main(String[] args) {
		try {
			creatFile("java23_text.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Finished");
	}

	private static File creatFile(String path) throws IOException {
		File file = new File(path);
		if (!file.exists()) {
			file.createNewFile(); // Hàm có săn của java
		}
		return file;

	}
}
