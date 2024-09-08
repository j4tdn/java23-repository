package validate_trycatch_throwthrows;

import java.io.File;

public class Ex05ThrowThrows {

	public static void main(String[] args) {
		
		
		
	}
	
	private static File createFile(String path) {
		File file = new File(path);
		if (!file.exists()) {
			file.createNewFile(); // hàm có sẵn của Java
		}
		return file;
	}
	
}
