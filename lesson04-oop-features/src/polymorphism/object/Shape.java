package polymorphism.object;

/*
 Bài toán đa hình về đối tượng hình học(hình tròn,vuông, tam giác)
 Trong mỗi hình cần 2 chức năng: tính diện tích và vẽ hình
 
  Code thông thường: 
  Circle: tinhDienTich, veHinh
  Square: tinhS, veShape
  Triangle: calS, paint
  
  --> cùng chức năng tính diện tính mỗi class là 1 tên khác nhau
      ---> không đồng bộ
      ---> khó nhớ, nhớp
      
  --> Xử lý: Tạo ra 1 class cha chứa phần khai báo của 2 hàm
      + tính diện tích 
      + vẽ hình
  --> Tạo ra 3 lớp con(Circle,Square,Triangle) override lại 2 hàm tính diện tích
  và vẽ hình từ lớp cha
 
 */

public class Shape {
 
	 void calS() {
		 System.out.println("Shape#calS --> unknown");
	 }
	 
	 void paint() { 
		 System.out.println("Shape#paint ---> unknown");
	 }
}
