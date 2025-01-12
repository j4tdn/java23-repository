package utils;

import java.io.File;
import java.io.IOException;

public class FileUtils {

	private FileUtils() {
	}

	public static File createFile(String path) {
		File file = new File(path);

		if (!file.exists()) {

			createDir(file.getParent());
			try {
				// excute creating file
				file.createNewFile();
				System.out.println("File " + file.getName() + " is created successful");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("File " + file.getName() + " is existed");
		}
		return file;
	}

	public static File createDir(String path) {
		File dir = new File(path);
		if (!dir.exists()) {
			dir.mkdirs();
			System.out.println("Parent folder " + dir.getPath() + " is created successful");
		}
		return dir;
	}
}
