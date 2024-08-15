package validate_trycatch_throwthrows;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

import org.w3c.dom.ls.LSOutput;

public class Ex07Finally {
	
	/*
	  Bài toán
	  
	  + sau khi xử lý logic --> có N dòng dữ liệu ở java
	  + Thực hiện ghi N dòng đó vào file java23_test.txt
	  
	 */
	
	private static Random rd = new Random();
	
	public static void main(String[] args) {
		String[] employees = mockData(100);
		generation("1. Mock data of Employees", employees);
		
		// 88:  + 88, Name 88, 21
		// 88:  + 88, Name 88, hm
		employees[88] = "88, Name 88, hm";
		
		// Line: id, name, age
		// Factor: (age - 18) * 2
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
			
			// khi n lines ko bị exception --> OK
			// save & close file
			// fw.close();
			
		} catch (NumberFormatException | IOException e) {
			System.out.println(">> Exception --> " + e.getMessage());
		} finally {
			System.out.println("jump in finally block");
			try {
				fw.close();
				// open file by default 
				Desktop.getDesktop().open(file);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}


		System.out.println("finish writing file...");
	}
	
	// id, name, age
	private static String[] mockData(int n) {
		String[] lines = new String[n];
		for (int i = 0; i < n; i++) {
			lines[i] = i + ", " + "Name " + i + ", " + rd.nextInt(18, 25);
		}
		return lines;
	}
	
	private static void generation(String prefix, String[] elements) {
		System.out.println(prefix + " {");
		for (String element: elements) {
			System.out.println("   + " + element);
		}
		System.out.println("}\n");
	}
}
