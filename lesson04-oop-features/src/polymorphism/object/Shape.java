package polymorphism.object;

/*
	 
Bài toán đa hình về đối tượng hình học (hình tròn, vuông, tam giác_
Trong mỗi hình cần 2 chức năng: tính diện tích, vẽ hình

Code thông thường
+ Mỗi hình --> class
+ Mỗi hình --> chức năng tính diện tích, vẽ hình

Circle: tinhDientich, veHinh
Square: tinhS, veShape
Triangle: calS, paint

--> Cùng chức năng tính diện tích, mỗi class là 1 tên khác nhau
	--> không đồng bộ
	--> khó nhớ, nhớp
--> Xử lý: tạo ra 1 class cha chứa phần khai bao của 2 hàm
	+ Tính diện tích
	+ Vẽ hình
--> Tạo ra 3 lớp con (Circle, Square, Triangle) override lại 2 hàm tính diện tích và vẽ hình
	từ lớp cha
	 
*/

public class Shape {

	void calS() {
		System.out.println("Shape#calS --> unknown");
	}
	
	void paint() {
		System.out.println("Shape#paint --> unknown");
	}
	
}
