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
	
	void calS() {
		System.out.println("Shape#calS --> unknown");
	}
	void paint() {
		System.out.println("Shape#paint --> unknown");
	}
}
