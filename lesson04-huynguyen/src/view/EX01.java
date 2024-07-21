package view;
import java.util.Scanner;

import bean.Student;


public class EX01 {
	public static void main(String[] args) {
		
		Student s1 = new Student(1,"Nguyen Quoc Huy",8.8f,9.2f);
		Student s2 = new Student(2,"Le Anh Tai",6.7f,7.2f);
		Student s3 = new Student();
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã SV: ");
        s3.setId(scanner.nextInt());
        scanner.nextLine(); // Clear the buffer
        System.out.print("Nhập họ tên: ");
        s3.setName(scanner.nextLine());
        System.out.print("Nhập điểm lý thuyết: ");
        s3.setTheoreticalpoint(scanner.nextFloat());
        System.out.print("Nhập điểm thực hành: ");
        s3.setPracticepoint(scanner.nextFloat());
        
        Student[] list = {s1, s2, s3};
        
        System.out.println("Sinh viên có điểm trung bình lớn hơn 8.5:");
        for (Student sv : list) {
            if (sv.calculateAvgPoint() > 8.5) {
                System.out.println(sv);
            }
        }

        // Tìm thông tin sinh viên có điểm lý thuyết lớn hơn điểm thực hành
        System.out.println("Sinh viên có điểm lý thuyết lớn hơn điểm thực hành:");
        for (Student sv : list) {
            if (sv.getTheoreticalpoint() > sv.getPracticepoint()) {
                System.out.println(sv);
            }
        }
	}

}
