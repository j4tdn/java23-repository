package validate_trycatch_throwthrows;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Random;

public class Ex07Finally {

	private static Random rd = new Random();

	public static void main(String[] args) {
		/*
		 * Bai toan +Sau khi xu ly logic --> co N dong du lieu o java Thuc thi ghi N
		 * dong do vao java23_test.txt
		 */
		String[] employees = mockData(100);
		generate("1.Mock Data of employees", employees);
		// Line : id , name, age,factor
		// factor:(age- 18)*2
		try {
			writeFile("java23_test.txt",employees);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	private static void writeFile(String path, String[] employess) throws IOException {
		File file = new File(path);
		if (!file.exists()) {
			System.out.println("file" + file.getName() + "is not existed");
			return;
		}
		FileWriter fw = new FileWriter(file);

		for (String employee : employess) {
			String[] tokens = employee.split(",");
			int factor = (Integer.parseInt(tokens[2]) - 18) * 2;
			String line = employee + "," + factor;

			fw.write(line + "\n");

		}

		// save and close file
		fw.close();
		System.out.println("Finish writing file....");
		//Open file by default text editor
		Desktop.getDesktop().open(file);
	}

	// Employee : id, name, age
	private static String[] mockData(int n) {
		String[] lines = new String[n];
		for (int i = 0; i < n; i++) {
			lines[i] = i + "," + "Name" + i + "," + rd.nextInt(18, 25);
		}
		return lines;
	}

	private static void generate(String prefix, String[] elements) {
		System.out.println(prefix + "{");
		for (String element : elements) {
			System.out.println(" +" + element);
		}
		System.out.println("}\n");
	}
}