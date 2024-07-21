package view;

import java.util.Scanner;
import bean.Student;

public class Ex01StudentManagement {
    public static void main(String[] args) {
    	
        Student sv1 = new Student(102200131, "Hoang Huan", 9.0, 9.5);
        Student sv2 = new Student(102200143, "Bui Hoang Minh", 9.0, 8.0);
        Student sv3 = new Student();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma sinh vien cho sv3: ");
        sv3.setMaSinhVien(scanner.nextInt());
        scanner.nextLine(); 
        System.out.println("Nhap ho ten sinh vien cho sv3: ");
        sv3.setHoTen(scanner.nextLine());
        System.out.println("Nhap diem ly thuyet cho sv3: ");
        sv3.setDiemLyThuyet(scanner.nextDouble());
        System.out.println("Nhap diem thuc hanh cho sv3: ");
        sv3.setDiemThucHanh(scanner.nextDouble());

        Student[] danhSachSinhVien = {sv1, sv2, sv3};

        System.out.println("Sinh vien co diem trung binh lon hon 8.5:");
        for (Student sv : danhSachSinhVien) {
            if (sv.tinhDiemTrungBinh() > 8.5) {
                System.out.println(sv);
            }
        }

        System.out.println("Sinh vien co diem ly thuyet lon hon diem thuc hanh:");
        for (Student sv : danhSachSinhVien) {
            if (sv.getDiemLyThuyet() > sv.getDiemThucHanh()) {
                System.out.println(sv);
            }
        }
    }
}