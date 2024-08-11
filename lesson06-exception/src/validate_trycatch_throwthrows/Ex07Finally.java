package validate_trycatch_throwthrows;

import java.io.File;
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
		
		writeFile("java23_test.txt", employees);
	}
	
	private static void writeFile(String path, String[] employees) {
		File file = new File(path);
		if(!file.exists()) {
			System.out.println("File " +file.getName() + "is not existed");
		return;
		}
           FileWrite fw = new FileWrite(file);		
           for(String employee :employees) {
        	   
           }
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
