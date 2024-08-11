package validate_trycatch_throwthrows;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;


public class Ex07Finally {

	private static Random rd = new Random();
	
	/*
	
	Bài toán
	
	+ Sau khi xử lý logic --> có N dòng dữ liệu ở Java
	
	+ Thực hiện ghi N dòng đó vào file java23_test.txt
	
	 */
	
	public static void main(String[] args) {
		String[] employees = mocData(100);
		// 88: + 88, Name 88, 23
		// 88, name 88, hm
		employees[88] = "88, name 88, hm";
				
		generate("1. Mock Data of Employees", employees);
		
		// Line: id, name, age, factor
		// factor: (age - 18) * 2
		writeFile("java23_text.txt", employees);
	}
	
	private static void writeFile(String path, String[] employees) {
		File file = new File(path);
		if(!file.exists()) {
			System.out.println("File " + file.getName() + " is not existed");
			return;
		}
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			
			// 84, Name 84, 19
			for (String employee : employees) {
				String[] tokens = employee.split(", ");
				int factor = (Integer.parseInt(tokens[2]) - 18) * 2;
				String line = employee + ", " + factor;
				fw.write(line + "\n");
			}
			
			// nếu bị exception --> không save
			// Save & close file
			// fw.close();
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
			// nếu bị exception --> không save
			// Save & close file
			// fw.close();
		} finally {
			System.out.println("Jump in finally block");
			try {
				fw.close();
				
				// open file by default text editor
				Desktop.getDesktop().open(file);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Finished writing file ....");
	}
	
	// id, name, age
	private static String[] mocData(int n) {
		String[] lines = new String[n];
		for(int i = 0; i < n; i++) {
			lines[i] = i + ", " + "Name " + i + ", " + rd.nextInt(18, 25); 
		}
		return lines;
	}
	
	private static void generate(String prefix, String[] elements) {
		System.out.println(prefix + " {");
		for(String element : elements ) {
			System.out.println("    + " + element);
		}
		System.out.println("}\n");
	}
	
}
