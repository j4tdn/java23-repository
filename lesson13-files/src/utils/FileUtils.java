package utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;

public class FileUtils {

	private FileUtils() {
		
	}
	
	public static void writeFile(String path, Collection<String> lines, boolean append) {
		File file = new File(path);
		
		if (!file.exists()) {
			throw new IllegalArgumentException("File " + file.getAbsolutePath() + " is not existed.");
		}
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			// file mới append
			fw = new FileWriter(file, append);
			bw = new BufferedWriter(fw);
			
			for (String line: lines) {
				bw.write(line + "\n");
			}
			System.out.println("Write file " + file.getAbsolutePath() + " successful.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// save & close
			close(bw, fw);
		}
	}
	
	public static void close(AutoCloseable... objectsToBeClosed) {
		try {
			for (AutoCloseable objectToBeClosed : objectsToBeClosed) {
				if (objectToBeClosed != null) {
					objectToBeClosed.close();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static File createdFile(String path) {
		File file = new File(path);
		// include check existing of parent folder
		if (!file.exists()) {
			if (file.getParent() != null) {
				createdDir(file.getParent());
			}
			
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
	
	public static File createdDir(String path) {
		File dir = new File(path);
		if (!dir.exists()) {
			dir.mkdirs();
			System.out.println("Folder " + dir.getPath() + " is created successful");
		}
		return dir;
	}
	
	public static void remove(String path) {
		File file = new File(path);
		if(!file.exists()) {
			System.out.println("File " + file.getPath() + " is not existed");
		} else {
			file.delete();
		}
	}
}
