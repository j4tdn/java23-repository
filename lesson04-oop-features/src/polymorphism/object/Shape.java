package polymorphism.object;

/*
 	Bài toán đa hình về đối tượng hình học(tròn, vuông, tam giác)
 	 - trong mỗi hình cần 2 chức năng: tính diện tích, vẽ hinh
 	 
 	 Code thông thường:
 	  + Mỗi hình là 1 class và 2 phương thức
 	  
 	  Circle: tinhDientich, veHinh
 	  Square: tinhS, veShape
 	  Triangle: calS, paint
 	  
 	  --> Cùng chức năng tính S, mỗi class là 1 tên khác nhau:
 	  	+ Ko đồng bộ
 	  	+ Khó nhớ
 	  --> Xử lý: Tạo ra 1 class cha chứa phần khai báo của 2 hàm
 	  	+ Tính diện tích
 	  	+ Vẽ hình
 	  --> Tạo ra 3 lớp con(Circle,Square, Triangle) override lại 2 hàm tính S và vẽ ra từ lớp cha
 	  	
 */
public class Shape {
	// Vấn đề 1: khi tạo hàm calS, paint ở KDL cha hoàn toàn chưa biết nội dung nhưu nào
	//		   : body chưa biết, thừa
	// Vấn đề 2: Khi class con kế thừa từ class cha, ko bắt buộc phải Override cái hàm ở class cha
	
	// Muốn: Hàm ở cha ko có body, bắt buộc override ở con
	// Cha -> interface
	
	void calS() {
		System.out.println("Shape#calS --> unknown");
	}
	void paint() {
		System.out.println("Shape#paint --> unknown");
	}
}
