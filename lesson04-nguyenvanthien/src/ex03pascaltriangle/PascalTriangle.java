package ex03pascaltriangle;

public class PascalTriangle {
	 public static void printPascalTriangle(int n) {
	        // Create an array to store previous row
	        int[] previousRow = new int[n + 1];
	        
	        for (int line = 0; line <= n; line++) {	            
	            int[] currentRow = new int[line + 1];	        
	            currentRow[0] = currentRow[line] = 1;	            
	            for (int j = 1; j < line; j++) {
	                currentRow[j] = previousRow[j - 1] + previousRow[j];
	            }

	            
	            for (int j = 0; j <= line; j++) {
	                System.out.print(currentRow[j] + " ");
	            }
	            System.out.println();

	           
	            previousRow = currentRow;
	        }
	    }

	   
	    public static void main(String[] args) {
	        int n = 4; 
	        printPascalTriangle(n);
	    }
	}