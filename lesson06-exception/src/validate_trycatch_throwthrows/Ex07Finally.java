package validate_trycatch_throwthrows;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class Ex07Finally {
	
	private static Random rd = new Random();

	public static void main(String[] args) {
		String[] employees = mockData(100);
		employees[88] = "88, Name 88, hm";
		
		generate("1. Mock Data of Employees", employees);
		
		writeFile("java23_test.txt", employees);
	}
	
	private static void writeFile(String path, String[] employees) {
		File file = new File(path);
		if (!file.exists()) {
			System.out.println("File " + file.getName() + " is not existed");
			return;
		}
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			for (String employee: employees) {
				String[] tokens = employee.split(", ");
				int factor = (Integer.parseInt(tokens[2]) - 18) * 2;
				String line = employee + ", " + factor;
				fw.write(line + "\n"); 
			}
		
			
		 finally {
			System.out.println("jump in finally block"); 
			try {
				fw.close();
				Desktop.getDesktop().open(file);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try {

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Finish writing file ....");
	}
	
	private static String[] mockData(int n) {
		String[] lines = new String[n];
		for (int i = 0; i < n; i++) {
			lines [i] = i + ", " + "Name " + i + ", " + rd.nextInt(18, 25); 
		}
		return lines;
	}
	
	private static void generate(String prefix, String[] elements) {
		System.out.println(prefix + " {");
		for (String element: elements) {
			System.out.println("     + " + element);
		}
		System.out.println("}\n");
	}
	
}
