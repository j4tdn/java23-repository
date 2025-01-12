package utils;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class FileUtils {
	private FileUtils() {
	}

	public static File createNewFile(String path) {
		File file = new File(path);

		if (file.exists()) {
			System.out.println("File --> " + path + " is existed");
		} else {
			createNewDir(file.getParent());
			try {
				boolean isSuccess = file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("File " + file.getAbsolutePath());
		}

		return file;
	}

	public static void open(File file) {
		try {
			Desktop.getDesktop().open(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static File createNewDir(String path) {
		File root = new File(path);
		if (!root.exists()) {
			root.mkdirs();
		}
		return root;
	}

	public static void close(AutoCloseable... autoCloseables) {
		for (AutoCloseable autoCloseable : autoCloseables) {
			if (autoCloseables != null) {
				try {
					autoCloseable.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
