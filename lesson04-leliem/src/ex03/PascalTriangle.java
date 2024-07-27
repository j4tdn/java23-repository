package ex03;

public class PascalTriangle {

	 private int n; 
	    private int[][] triangle; 


	    public PascalTriangle(int n) {
	        this.n = n;
	        this.triangle = new int[n][];
	        buildTriangle();
	    }

	    // Phương thức xây dựng tam giác Pascal
	    private void buildTriangle() {
	        for (int i = 0; i < n; i++) {
	            triangle[i] = new int[i + 1];
	            triangle[i][0] = 1; // Phần tử đầu tiên của mỗi hàng luôn là 1
	            triangle[i][i] = 1; // Phần tử cuối cùng của mỗi hàng luôn là 1
	            
	            // Tính các phần tử ở giữa
	            for (int j = 1; j < i; j++) {
	                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
	            }
	        }
	    }

	    public int[][] getTriangle() {
	        return triangle;
	    }
	}