package polymorphism.object;
/*
 * Bài toán đa hình về đối tượng hình học
 * Trong mỗi hình 2 chức năng: tính S, vẽ hình
 * 
 * Code thường:
 * + Mỗi hình --> class
 * + Mỗi hình --> code 2 hàm tính S, vẽ hình 
 * --> không đồng bộ, khó nhớ
 * 
 * Xử lí: tạo ra 1 class chứa khai báo 2 hàm
 * + tính S
 * + vẽ hình
 * --> Tạo ra 3 lớp con (Circle, Square, Triangle) override lại 2 hàm từ lớp cha
 */
public class Shape {
	//Vấn đề 1: khi tạo calS, paint ở KDL cha hàon toàn chưa biết nội dung
	//		  : body chưa biết, thừa
	//Vấn đề 2: khi class con kế thừa từ class cha, 0 bắt buộc phải override hàm ở cha
	
	//Muốn: hàm ở cha ko có body, bắt buộc override ở con
	//Cha -> interface
	
	void calS() {
		System.out.println("Shape#calS --> Unknown");
	}
	
	void paint() {
		System.out.println("Shape#paint --> Unknown");
	}
}
