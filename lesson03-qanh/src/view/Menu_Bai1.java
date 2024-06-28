package view;

import java.util.Scanner;
public class Menu_Bai1 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int n = 0;
		Input_Vehicle[] vs = new Input_Vehicle[n];
		
        do {
        	System.out.println("2. In danh sách xe"); 
            System.out.println("1. Nhập thông tin xe");
            System.out.println("0. Thoát");   
            
            int chon= sc.nextInt();
            sc.nextLine(); 
            if (chon == 1) {
                do {
                    System.out.print("Nhập số lượng xe: ");
                    n = sc.nextInt();
                    sc.nextLine();
                    if (n <= 0) {
                        System.out.println("Số lượng xe phải lớn hơn 0. Vui lòng nhập lại.");
                    }
                } while (n <= 0);
                vs = new Input_Vehicle[n];
                for (int i = 0; i < n; i++) {
                    Input_Vehicle xe = new Input_Vehicle();
                    System.out.println("\nNhập thông tin xe - " + i);
                    xe.input();
                    vs[i] = xe;
                }

            } else if(chon == 2 ){
            	CarTable cr = new CarTable();
            	cr.InTable(vs);
            
            	
            }else if (chon == 0) {
                System.out.println("Chương trình kết thúc.");
                sc.close();
                return;
            } else {
                System.out.println("chọn lại chọn sai .");
            }
        } while (true);
    }
}
				      
					
	
	