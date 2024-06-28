package view;

import java.util.Scanner;

public class HorseSaddle {
	int m,n;
	int [][]H;
	
	public void saddlepoint() {
	    boolean saddlepoint = false;
	    
	    for (int i = 0; i < m; i++) {
	        int giatri = H[i][0];
	        int v = 0;
	
	        for (int j = 1; j < n; j++) {
	            if (H[i][j] < v) {
	            	giatri = H[i][j];
	                v = j;
	            }
	        }
	        boolean isSaddlePoint = true;
	        for (int k = 0; k < m; k++) {
	            if (H[k][v] > giatri) {
	                isSaddlePoint = false;
	                break;
	            }
	        }   
	        if (isSaddlePoint) {
	            System.out.println("\nPhần tử yên ngựa là: " + giatri );
	            saddlepoint = true;
	        }
	    }
	    if (!saddlepoint) {
	        System.out.println("\nNULL.");
	    }
	}
	public void input() {
		Scanner ip = new Scanner(System.in);
			
		System.out.print("số hàng ma trận: ");
		m =  ip.nextInt();
		System.out.print("số cột ma trận: ");
		n =  ip.nextInt();
		H = new int[m][n];
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.print("\nNhập giá trị cho mảng thứ - " + i+": ");
				H[i][j] =  ip.nextInt();
				
			}
		}
	}
	public int output() {
			
			System.out.println("\nMa trận: ");
			for(int i=0; i<m; i++) {
				for(int j=0; j<n; j++) {
					System.out.print(H[i][j]+ "  ");
				}
				System.out.println();
			}
			return 0;
		}
	public static void main(String[] args) {
		HorseSaddle hr = new HorseSaddle();
	    hr.input();
		hr.output();
		hr.saddlepoint();
		hr.output();
	}
	
	
}

