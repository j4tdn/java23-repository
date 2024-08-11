package validate_trycatch_throwthrows;

import java.io.File;

public class Ex05ThrowThrows {


	public static void main(String[] args) {
		}
		
		
	
	private static int creatFile(String path) {
		File file = new File(path);
		if(!file.exists()) {
			file.createNewFile(); // Hàm có săn của java
 		}
		return false;
		
	}
}
