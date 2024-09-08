package view;

import java.util.Scanner;

public class Ex01StringSpace {
	public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi kí tự: ");
        String chuoi = scanner.nextLine();

       
        System.out.println("\nMỗi kí tự trên một dòng:");
        for (int i = 0; i < chuoi.length(); i++) {
            System.out.println(chuoi.charAt(i));
        }

       
        System.out.println("\nMỗi từ trên một dòng:");
        String[] tuList = chuoi.split(" ");
        for (String tu : tuList) {
            System.out.println(tu);
        }

        StringBuilder chuoiDaoNguocKyTu = new StringBuilder(chuoi);
        System.out.println("\nChuỗi đảo ngược theo kí tự:");
        System.out.println(chuoiDaoNguocKyTu.reverse());

       
        System.out.println("\nChuỗi đảo ngược theo từ:");
        for (int i = tuList.length - 1; i >= 0; i--) {
            System.out.print(tuList[i] + " ");
        }
        System.out.println();
	}
}
