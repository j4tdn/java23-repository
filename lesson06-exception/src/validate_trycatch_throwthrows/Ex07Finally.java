package validate_trycatch_throwthrows;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class Ex07Finally {

	/*
	 * Bài toán + Sau khi xử lý logic --> có N dòng dữ liệu ở Java
	 * 
	 * +Sau khi ghi N dòng đó vào file java23_test.txt
	 */
	private static Random rd = new Random();

	public static void main(String[] args) {
		String[] employees = mockData(100);
		generate("1.Mock Data of employees", employees);

//		line: STT,Name,Number,factor

		try {
			writeFile("java23_test.txt", employees);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void writeFile(String path, String[] employees) throws IOException {
		File file = new File(path);
		if (!file.exists()) {
			System.out.println("File " + file.getName() + "is not existed");
			return;
		}
		FileWriter fw = new FileWriter(file);
		try {
			fw = new FileWriter(file);
			for (String employee : employees) {
				String[] tokens = employee.split(", ");
				int factor = (Integer.parseInt(tokens[2]) - 18) * 2;
				String line = employee + ", " + factor;
				fw.write(line + "\n");
			}

			// nếu bị exception --> ko save
			// save & close file
			// fw.close();
		} catch (NumberFormatException | IOException e) {
			System.out.println(">>> Exception --> " + e.getMessage());

			// nếu ko bị exception --> ko save
			// save & close file
			// fw.close();

		} finally {
			System.out.println("jump in finally block");
			try {
				fw.close();

				// open file by default text editor
				Desktop.getDesktop().open(file);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

// bị exception catch ko bắt được --> ko save
// fw.close();

		System.out.println("Finish writing file ....");
	}

	private static String[] mockData(int n) {
		String[] lines = new String[n];
		for (int i = 0; i < n; i++) {
			lines[i] = i + ", " + "Name " + i + " , " + rd.nextInt(18, 25);
		}
		return lines;
	}

	private static void generate(String prefix, String[] elements) {
		System.out.println(prefix + " {");
		for (String element : elements) {
			System.out.println("  + " + element);
		}
		System.out.println("   \n ");
	}
}
