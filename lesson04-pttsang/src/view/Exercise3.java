package view;

public class Exercise3 {
	private static int[][] pascal;
	
	public static void main(String[] args) {
		printTriangle(4);
	}
	
	public static void printTriangle(int n) {
		pascal = new int[n+2][n+2];
		for(int i=0; i<=n+1; i++) {
			pascal[i][0]=1;
			pascal[i][i]=1;
			for(int j=1; j<i; j++) {
				pascal[i][j]=pascal[i-1][j-1]+pascal[i-1][j];
			}
		}
		
        for (int i = 1; i <= n+1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pascal[i][j] + " ");
            }
            System.out.println();
        }

	}
}
