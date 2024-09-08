package view;

import java.util.Scanner;

public class Ex06FindNumber {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vị trí K: ");
        int K = sc.nextInt();
        
        StringBuilder sequence = new StringBuilder();
        int num = 1;
        while (sequence.length() < K) {
            sequence.append(num);
            num++;
        }
        
        System.out.println("Số ở vị trí thứ " + K + "là số:  " + sequence.charAt(K - 1));
    }
	
}
