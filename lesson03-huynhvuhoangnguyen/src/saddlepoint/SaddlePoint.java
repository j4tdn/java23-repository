package saddlepoint;
import java.util.Random;
import java.util.Scanner;

public class SaddlePoint {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of rows (M): ");
		int M = scanner.nextInt();
		System.out.println("Enter number of columns (N): ");
		int N = scanner.nextInt();
		
		int[][] table = generateRandomTable(M, N);
		
		System.out.println("Random generated table: ");
		printTable(table);
		
		findAndPrintSaddlePoint(table);
		
		scanner.close();
	}
	
	// Hàm tạo bảng ngấu nhiên [0, 99]
	public static int[][] generateRandomTable(int M, int N) {
		Random random = new Random();
		int[][] table = new int [M][N];
		
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				table[i][j] = random.nextInt(99) + 1;
			}
		}
		return table;
	}
	
	// Hàm in bảng ra
	public static void printTable(int[][] table) {
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[0].length; j++) {
				System.out.print(table[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	// Hàm tìm và in ra phần tử yên ngựa trong bảng
	// Phần tử lớn nhất của cột và nhỏ nhất của hàng
	public static void findAndPrintSaddlePoint(int[][] table) {
		boolean foundSaddlePoint = false;
		int M = table.length;
		int N = table[0].length;
		
		for (int i = 0; i < M; i++) {
			int minRowValue = table[i][0];
			int minColumnIndex = 0;
			
			// Tìm phần tử nhỏ nhất trong hàng i
			for (int j = 1; j < N; j++) {
				if (table[i][j] < minRowValue) {
					minRowValue = table[i][j];
					minColumnIndex = j;
				}
			}
			
			// Kiểm tra phần tử nhỏ nhất trong hàng i có phải là 
			// phần tử lớn nhất trong cột của nó không
			boolean isSaddlePoint = true;
				for (int k = 0; k < M; k++) {
					if (table[k][minColumnIndex] > minRowValue) {
						isSaddlePoint = false;
						break;
					}
				}
				
				// Nếu đúng, đó là phần tử yên ngựa
				if (isSaddlePoint) {
					System.out.println("Saddle point found at (" + i + ", " 
							+ minColumnIndex + "): " + minRowValue);
					foundSaddlePoint = true;
				}
			}
		
			if (!foundSaddlePoint) {
				System.out.println("No saddle point found.");
			}
		}
		
}
