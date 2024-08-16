package validate_trycatch_throwthrows;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Ex07Finally {

	/*
	 * Bài toán
	 * 
	 * + Sau khi xử lý logic -> có N dòng dữ liệu ở Java
	 * 
	 * + Thực hiện ghi N dòng đó vào file java23_test.txt
	 * 
	 */
	private static Random rd = new Random();

	public static void main(String[] args) {
		// Employee: id, name,age
		String[] employees = mockData(100);
		generate("Mock data of employees ", employees);

		writeFile("java23_test.txt", employees);
	}

	private static void writeFile(String path, String[] employees) {
		File file = new File(path);
		if (!file.exists()) {
			System.out.println("File " + file.getName() + " is not exists");
			return;
		}
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			for (String employee : employees) {
				String[] tokens = employee.split(", ");
				int factor = (Integer.parseInt(tokens[2]) - 18) * 2;
				String line = employee + ", " + factor;
				fw.write(line + "\n");
			}
		} catch (IOException | NumberFormatException e) {
			System.out.println("NumberFormatException");
		} finally {
			try {
				fw.close();
				Desktop.getDesktop().open(file);
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		System.out.println("Finish writing file");
	}

	private static String[] mockData(int n) {
		String[] lines = new String[n];
		for (int i = 0; i < n; i++) {
			lines[i] = i + ", " + "Name " + i + ", " + rd.nextInt(18, 25);
		}
		return lines;
	}

	private static void generate(String prefix, String[] elements) {
		System.out.println(prefix + " {");
		for (String element : elements) {
			System.out.println("  + " + element);
		}
		System.out.println("}\n");
	}
}
