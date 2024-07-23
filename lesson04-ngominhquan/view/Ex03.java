package view;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		int n;
        int x;
        int output;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter hight of the triangle: ");
        n = scanner.nextInt();

        for(int i = 1;i<= n; i++){
            for(int j = 0; j<= 2*n; j++){
                x = j-n;
                if(x < 0){
                    x *= -1;
                }
                output = i - x;

                if(output > 0){
                    System.out.printf("%3d", output);
                } else{
                    System.out.printf("   ");
                }
            }
            System.out.println();

        }
	}
}