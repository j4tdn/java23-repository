package Exercise2;
import java.util.ArrayList;
import java.util.Scanner;

public class SaddlePoint {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of rows of the matrix (M): ");
        int M = scanner.nextInt();
        System.out.print("Enter the number of columns of the matrix (N): ");
        int N = scanner.nextInt();

        // Tạo ma trận
        int[][] matrix = new int[M][N];
        System.out.println("Enter the elements of the matrix:");

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        scanner.close();

        // Hiển thị ma trận đã nhập
        System.out.println("Imported matrix:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        ArrayList<String> saddlePoints = findSaddlePoints(matrix);

        // Hiển thị kết quả
        if (saddlePoints.size() > 0) {
            System.out.println("\\The saddle elements in the matrix are:");
            for (String point : saddlePoints) {
                System.out.println(point);
            }
        } else {
            System.out.println("\\nThere are no saddle elements in the matrix.");
        }
    }

    public static ArrayList<String> findSaddlePoints(int[][] matrix) {
        ArrayList<String> saddlePoints = new ArrayList<>();
        int numRows = matrix.length;
        int numCols = matrix[0].length;

        for (int i = 0; i < numRows; i++) {
            int rowMin = matrix[i][0];
            int colIndex = 0;

            // Tìm phần tử nhỏ nhất trong hàng
            for (int j = 1; j < numCols; j++) {
                if (matrix[i][j] < rowMin) {
                    rowMin = matrix[i][j];
                    colIndex = j;
                }
            }

            // Kiểm tra xem phần tử nhỏ nhất trong hàng có phải là phần tử lớn nhất trong cột không
            boolean isSaddlePoint = true;
            for (int k = 0; k < numRows; k++) {
                if (matrix[k][colIndex] > rowMin) {
                    isSaddlePoint = false;
                    break;
                }
            }

            if (isSaddlePoint) {
                saddlePoints.add("Saddle element at row " + i + ", column " + colIndex + ": value " + rowMin);
            }
        }

        return saddlePoints;
    }
}
