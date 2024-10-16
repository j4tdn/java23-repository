package view;

public class Ex02Main {

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 0, 8, 7},
            {1, 9, 0, 9},
            {2, 0, 6, 5},
            {1, 2, 4, 5}
        };

        printMatrix("\nMa trận ban đầu", matrix);
        transformMatrix(matrix);
        printMatrix("\nMa trận sau khi chuyển đổi", matrix);
    }

    // Phương thức in ma trận
    private static void printMatrix(String message, int[][] matrix) {
        System.out.println(message + " --> ");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    // Phương thức chuyển đổi ma trận theo quy tắc nếu có phần tử bằng 0
    private static void transformMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean[] rowFlag = new boolean[rows];
        boolean[] colFlag = new boolean[cols];

        // Tìm các hàng và cột chứa phần tử bằng 0
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    rowFlag[i] = true;
                    colFlag[j] = true;
                }
            }
        }

        // Chuyển tất cả các phần tử trong hàng và cột có chứa 0 thành 0
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (rowFlag[i] || colFlag[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
