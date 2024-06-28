package Ex01Shopping;

import java.util.Scanner;

public class Ex03Horse {
		
		private static Scanner scanner = new Scanner(System.in);
		private static int[][] matrix;
		private static boolean hasSaddlePoints = false;
		
		public static void main(String[] args) {
	        System.out.print("Nhập số hàng: ");
	        int m = scanner.nextInt();

	        System.out.print("Nhập số cột: ");
	        int n = scanner.nextInt();
	        
	        inputMatrix(m, n);
	        int[][] saddlePoints = findSaddlePoints(m, n);
	        
	        if (hasSaddlePoints) {
	        	System.out.println("Phần tử yên ngựa:");
	        	for (int[] row : saddlePoints) {
	        		if (row[1] != -1) {
		        		System.out.println("==> Hàng " + row[0] + ": " + row[1]);
	        		}
	        	}	
	        } else {
	        	System.out.println("Không có phần tử yên ngựa");
	        }
	    }
		
		private static void inputMatrix(int m, int n) {
			matrix = new int[m][n];
	        System.out.println("Nhập giá trị cho từng phần tử của ma trận:");

			for (int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++) {
	                System.out.print("matrix[" + i + "][" + j + "]: ");
	                matrix[i][j] = scanner.nextInt();
	            }
	        }
	        
			System.out.println("Ma trận " + m + "x" + n + " đã nhập:");
	        for (int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++) {
	                System.out.print(matrix[i][j] + "\t");
	            }
	            System.out.println();
	        }
		}
		
		private static int[][] findSaddlePoints(int m, int n) {
			int[][] result = new int[m][2];

			for (int i = 0; i < m; i++) {
				int min = matrix[i][0];
				int colIndex = 0;

	            for (int j = 1; j < n; j++) {
	            	if (min > matrix[i][j])  {
	            		min = matrix[i][j];
	            		colIndex = j;
	            	}
	            }
	            
	            boolean isSaddlePoint = true;
	            for (int k = 0; k < m; k++) {
	                if (min < matrix[k][colIndex]) {
	                    isSaddlePoint = false;
	                    break;
	                }
	            }

	            if (isSaddlePoint) {
	            	hasSaddlePoints = true;
	                result[i][0] = i;
	                result[i][1] = min;
	            } else {
	                result[i][0] = -1;
	                result[i][1] = -1;
	            }
	        }
			
			return result;
		}
	}



