package files.definition;

import java.io.File;
import java.util.Arrays;

import utils.FileUtils;

public class Ex02FileRemoval {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\admin\\OneDrive\\Pictures\\Screenshots");
		if(!file.exists()) {
			System.out.println("! File " + file.getPath() + " is not existed");
			return ;
		}
		Arrays.stream(file.listFiles())
		.filter(f -> {
			return f.isFile() && (f.getName().endsWith("png"));
		}).forEach(f -> f.delete());
	
	}

}
