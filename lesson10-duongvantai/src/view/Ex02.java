package view;

public class Ex02 {
	public static void main(String[] args) {
		int [][] matri = {
				{1,2,3,4},
				{5,6,8,7},
				{1,9,0,9},
				{2,9,6,5},
				{1,2,4,5}
		};
		System.out.println("Ma tran truoc khi chuyen doi");
		print(matri);
		System.out.println("Ma tran sau khi chuyen doi");
		returnValue0(matri);
	}
	private static void returnValue0(int [][] matri) {
		int rows = matri.length;
		int cols = matri[0].length;
		int zeroRows = -1;
		int zeroCols = -1;
		for(int i = 0; i < rows; i ++) {
			for(int j = 0; j < cols; j++) {
				if(matri[i][j] == 0) {
					zeroRows = i;
					zeroCols = j;
					break;
				}
			}
		}
		if(zeroCols != -1 && zeroRows != -1) {
			for(int i = 0 ; i < rows; i++) {
				matri[i][zeroCols] = 0;
			}for(int j = 0 ; j < cols; j++) {
				matri[zeroRows][j] = 0;
			}
		}
		print(matri);
	}
	private static void print(int [][] matri) {
		int rows = matri.length;
		int cols = matri[0].length;
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				System.out.print(matri[i][j] + " ");
			}
			System.out.println();
		}
	}
}
