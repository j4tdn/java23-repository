package utils;

import java.io.File;
import java.io.IOException;

public class FileUtils {
	
	private FileUtils() {
	}
	
	public static File createFile(String path) {
		File file = new File(path);
		if (!file.exists()) {
			// include check existing of parent folder
			createDir(file.getParent());
			
			try {
				// execute creating file
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
			System.out.println("Folder " + dir.getPath() + " is created successful");
		}
		return dir;
	}
	
	public static void remove(String path) {
		File file = new File(path);
		if (!file.exists()) {
			System.out.println("File " + file.getPath() + " is not existed");
		} else {
			file.delete();
			System.out.println("File " + file.getPath() + " is not deleted");
		}
	}
	
}
