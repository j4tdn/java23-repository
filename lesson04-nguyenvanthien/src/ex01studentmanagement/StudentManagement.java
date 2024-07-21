package ex01studentmanagement;

import java.util.Scanner;

public class StudentManagement {
	public static void main(String[] args) {
		Student sv1 = new Student(1,"Nguyen Van Thien",9.0,8.5);
		Student sv2 = new Student (2,"Thien Nguyen Van",7.5,8.0);
		Student sv3 = new Student();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hãy nhập mã sinh cho sv3");
		int MaSv = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Nhập Tên Sinh Viên cho sv3");
		String ten = scanner.nextLine();
		
	
		System.out.println("Nhập Điểm lý thuyết cho sv3");
		double lythuyet = scanner.nextDouble();
		
		
		System.out.println("Hãy nhập điểm thực hành cho sv3");
		double thuchanh= scanner.nextDouble();
		
		sv3.setMaSinhVien(MaSv);
		sv3.setHoTen(ten);
		sv3.setDiemLyThuyet(lythuyet);
		sv3.setDiemThucHanh(thuchanh);
		
		Student [] students= {sv1,sv2,sv3};
		timSinhVienDiemCao(students);
		timSinhVienLyThuyetCaoHonThucHanh(students);
		
		scanner.close();
	}
		public static void timSinhVienDiemCao(Student[] students) {
		    System.out.println("Sinh viên có điểm cao tb cao hơn 8.5:");
		    for (Student sv : students) {
		        if (sv.TinhDiemTrungBinh()>8.5) {
		            System.out.println(sv);
		        }
		    }
		}

		public static void timSinhVienLyThuyetCaoHonThucHanh(Student[] students) {
		    System.out.println("Sinh viên có điểm lí thuyết cao hơn điểm thực hành là:");
		    for (Student sv : students) {
		        if (sv.getDiemLyThuyet() > sv.getDiemThucHanh()) {
		            System.out.println(sv);
		        }
		    }
		}
	}

