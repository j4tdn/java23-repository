package polymorphism.object;

/*
 Bài toán đa hình về đối tượng hình học (hình tròn, vuông, tam giác)
 Trong mỗi hình cần 2 chức năng: tính diện tích, vẽ hình
 
 + Code thông thường  
 	+ mỗi hình --> class
 	+ mỗi hình --> chứa 2 hàm tính diện tích, vẽ hình
 	
 Circle: tinhDienTich, veHinh
 Square: tinhS, veShape
 Triangle: calS, paint
 
 --> Cùng chức năng tính diện tích, mỗi class là 1 tên khác nhau
 	--> k đồng bộ
 --> Xử lý: Tạo ra 1 class cha chứa phần khai báo của 2 hàm
 	+ tính diện tích
 	+ vẽ hình
 	
 --> Tạo ra 3 lớp con (Circle, Square, Triangle) override lại 2 hàm
 tính diện tích và vẽ hình từ lớp cha
 
 */
public class Shape {
	// Vấn đề 1 : Khi tạo hàm calS, paint ở KDL cha hoàn toàn chưa biết nội dung 
	// 			: body chưa biết, thừa 
	// Vấn đề 2 :  Khi class con kế thừa từ class cha, k bắt buộc phải override
	// 				hàm ở class cha
	
	// Muốn: Hàm ở cha không có body, bắt buộc override ở con
	// Cha  -> interface
	void calS() {
		System.out.println("Shape#calS --> unknown");
	}
	void paint() {
		System.out.println("Shape#paint --> unknown");

	}
}
