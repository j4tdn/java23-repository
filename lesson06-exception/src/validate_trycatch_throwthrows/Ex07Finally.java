package validate_trycatch_throwthrows;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Ex07Finally {

	private static Random rd = new Random();

	public static void main(String[] args) {
		String[] employees = mockData(100);
		generate("1. Mock Data of Employees", employees);
		try {
			writeFile("java23_text.txt", employees);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void writeFile(String path, String[] employees) throws IOException {
		File file = new File(path);
		if (!file.exists()) {
			System.out.println("File " + file.getName() + " is not existed");
			return;
		}
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);

			for (String empoyee : employees) {
				String[] tokens = empoyee.split(", ");
				int factor = (Integer.parseInt(tokens[2]) - 18) * 2;
				String line = empoyee + ", " + factor;
				fw.write(line + "\n");
			}
			// fw.close();
		} catch (NumberFormatException | IOException e) {
			System.out.println("Exception" + e.getMessage());
			// fw.close();
		} finally {
               System.out.println("jump i finally block");
			try {
				fw.close();
				Desktop.getDesktop().open(file);
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("Finish writing file ...");
		}
	}

	private static String[] mockData(int n) {
		String[] lines = new String[n];
		for (int i = 0; i < n; i++) {
			lines[i] = i + ", " + "Name " + i + ", " + rd.nextInt(18, 25);
		}
		return lines;
	}

	private static void generate(String prefix, String[] elements) {
		System.out.println(prefix + "{");
		for (String element : elements) {
			System.out.println("    +" + element);
		}
		System.out.println("}\n");
	}
}
