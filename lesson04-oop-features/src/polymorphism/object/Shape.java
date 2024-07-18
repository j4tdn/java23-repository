package polymorphism.object;


/*
  Bài toán đa hình về đối tượng hình học 
  Trong mỗi hình cần 2 chức năng:Tính diện tích, vẽ hình
  
  Code thông thường
  +Mỗi hình là một class
  +Mỗi class  chưa 2 hàm tính diện tích và vẽ hình
  
  Circle :tính s, vẽ hình
  Square :tinh s, vẽ shape
  
  -->Cùng chức năng tính diện tính,mỗi class là 1 tên khác nhau 
  -->không đồng bộ
  -->khó nhớ , nhớp
  
  -->Xử lý :Tạo ra 1 class cha thừa kế phần khai báo của 2 hàm
  
  +tính diện tích
  +vẽ hình
  -->Tạo ra 3 lớp con(Circle, Square,Triangle) override lại 2 hàm tính diện tích và vẽ hình từ lớp cha
  
 */
public class Shape {
	//Vấn đề 1 :Khi đó tạo hàm cals , paint ở kdl cha hoàn toàn chưa biết nội dung
	//		: body chưa biết , thừa
	//Vấn đề 2
	void callS() {
		System.out.println("Shape#cals --> unknown");
	}
	void Pain() {
		System.out.println("Shape#paint --> unknown");
	}
	
}
