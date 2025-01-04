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
			throw new IllegalArgumentException("File " + file.getAbsolutePath() + " is not exitted");
		}

		FileWriter fw = null;
		BufferedWriter bw = null;

		try {
			fw = new FileWriter(file, append);
			bw = new BufferedWriter(fw);

			for (String line : lines) {
				bw.write(line + "\n");
			}
			System.out.println("Wite File " + file.getAbsolutePath() + "successful");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
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

	public static File createFile(String path) {
		File file = new File(path);
		if (!file.exists()) {
			File parent = file.getParentFile();
			if(file.getParent() != null) {
				createDir(file.getParent());
			}
			try {
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
			System.out.println(" Folder " + dir.getPath() + "is created successful ");
		}
		return dir;
	}

	public static void remove(String path) {
		File file = new File(path);
		if (!file.exists()) {
			System.out.println("File " + file.getParent() + "is not existed");
		} else {
			file.delete();
			System.out.println("File " + file.getParent() + "is not deleted");
		}
	}

}
