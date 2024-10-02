package view;

public class Ex02Matrix {
	
    static int rowLength = 5; // số hàng của mảng
    static int colLength = 4; // số cột của mảng
    
    public static void main(String[] args) {
    	
        int[][] numbers = {
                { 1, 2, 3, 4},
                { 5, 6, 8, 7},
                { 1, 9, 0, 9},
                { 2, 9, 6, 5},
                { 1, 2, 4, 5}
        };
        
        show(numbers);
        System.out.println("========");
        changeToZero(numbers);
        show(numbers);
    }
    
    private static void show(int[][] numbers) {
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    private static void changeToZero(int[][] numbers) {
        boolean[] zeroRows = new boolean[rowLength];
        boolean[] zeroColumns = new boolean[colLength];
        
        // xét phần tử a[i][j] == 0 thì đánh dấu hàng và cột có chứa nó
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                if (numbers[i][j] == 0) {
                    zeroRows[i] = true;
                    zeroColumns[j] = true;
                }
            }
        }
        // chuyển tất cả phần tử thuộc các hàng và cột đã đánh dấu về 0
        for (int i = 0; i < rowLength; i++) {
            if (zeroRows[i]) {
                for (int j = 0; j < colLength; j++) {
                    numbers[i][j] = 0;
                }
            }
        }
        
        for (int j = 0; j < colLength; j++) {
            if (zeroColumns[j]) {
                for (int i = 0; i < rowLength; i++) {
                    numbers[i][j] = 0;
                }
            }
        }
    }
}
