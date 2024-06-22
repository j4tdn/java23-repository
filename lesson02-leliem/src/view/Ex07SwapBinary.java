package view;

import java.util.Scanner;

public class Ex07SwapBinary {
    public static void main(String[] args) {
    	Scanner ip = new Scanner(System.in);
        System.out.println("Enter a number :");
        
        int number = Integer.parseInt(ip.nextLine());
        String query = "";
        do {
            int binaryNum = number%2;
            number = number/2;
            query = query + binaryNum;
            
        } while (number>0);
        String [] queryArr = query.split("");
        String result ="";
        for (int i = queryArr.length-1; i >= 0; i--) {
			String add = queryArr[i];
			result = result + add;
			
		}
        System.out.println("The binary number of the input is :" + result);
    }
}

