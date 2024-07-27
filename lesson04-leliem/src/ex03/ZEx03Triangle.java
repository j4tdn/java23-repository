package ex03;

public class ZEx03Triangle {

	public static void main(String[] args) {
        int n = 4; 

        PascalTriangle pascalTriangle = new PascalTriangle(n);

        int[][] triangle = pascalTriangle.getTriangle();

        printTriangle(triangle);
    }

    private static void printTriangle(int[][] triangle) {
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}
