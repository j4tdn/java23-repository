package view;
import java.util.Arrays;

public class Ex02ZeroMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 0,2},
            {4, 0, 6,9},
            {7, 8, 5,3}
        };

        int zeroRow = -1, zeroCol = -1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    zeroRow = i;
                    zeroCol = j;
                    break;
                }
            }
            if (zeroRow != -1) break;
        }

        if (zeroRow != -1 && zeroCol != -1) {
            Arrays.fill(matrix[zeroRow], 0);

            for (int i = 0; i < matrix.length; i++) {
                matrix[i][zeroCol] = 0;
            }
        }

        System.out.println("Ma trận sau khi thay đổi:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
