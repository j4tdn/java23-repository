package view;

public class Ex03PascalTriangle {
	public static void main(String[] args) {
        int n = 6;
        printPascalTriangle(n);
    }

    public static void printPascalTriangle(int n) {
        int[][] triangle = new int[n][];

        // Sinh tam giác Pascal
        for (int i = 0; i < n; i++) {
            triangle[i] = new int[i + 1];
            triangle[i][0] = 1;
            triangle[i][i] = 1;

            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }

        for (int[] row : triangle) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
