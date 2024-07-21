package view;

public class Ex03PascalTriangle {
	public static void main(String[] args) {
		int n = 4;
		int[][] triangle = new int [n+1][n+1];
		for (int i = 0; i<= n; i++) {
			triangle[i][0] = 1;
			triangle[i][i] = 1;
			for (int j = 1; j < i; j++) {
				triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
			}
		}
		for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
            	if (triangle[i][j] == 0) continue;
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println(); 
        }
	}
}
