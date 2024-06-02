package bean;

//Nhăc lại: class = data structe + methods

//Khai báo KDL đối tượng, chứa các thông tin bên trong

public class Item {

	// Item : là KDL

	// class Item chứa 3 thuộc tính id, name, salesPrice

	// lưu ý: non static

//	trong 1 class mặc định sẽ có 1 hàm khởi tạo rỗng
	// khi gọi hàm khởi tạo này --> nó sẽ tạo ra 1 ô nhớ (chứa 3 thông tin id, name,
	// salesPrice)
	// ô nhớ --> đối tượng, giá tri của item
	public int id;
	public char name;
	public double salesPrice;

	public Item() {}

}
