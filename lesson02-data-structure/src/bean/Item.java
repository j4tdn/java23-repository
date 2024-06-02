package bean;
// Nhắc lại : Class = data structure + methods

// Khai báo KDL đối tượng, chứa các thông tin bên trong
public class Item {
	
	//Item: Kiểu dữ liệu
	
	// class Item chứa 3 biến toàn cục id, name, salesPrice
	// class Item chứa 3 thuộc tính id, name, salesPrice
	
	// lưu ý: non static
	
	public int id;
	public char name;
	public double salesPrice;
	
	// trong 1 class mặc định sẽ có 1 hàm khởi tạo rỗng
	// khi gọi hàm khởi tạo này --> nó sẽ tạo ra 1 ô nhớ(chứa 3 thông tin id, name, salesPrice) cho Item
	// ô nhớ --> đối tượng, giá trị của Item
	
	// Hàm khởi tạo không có KDL trả về --> mặc định nó sẽ trả về KDL class
	// Tên hàm trùng vs tên class
	public Item() {		
	}
	// Hàm khởi tạo, khởi tạo ô nhớ và cho phép gán giá trị cho các thuộc tính của ô nhớ đó
	// sau khi tạo ô nhớ ,biến this sẽ đại diện cho ô nhớ vừa tạo ra
	// biến this đang trỏ đến ô nhớ
	public Item(int pId, char pName, double pSalesPrice) {
		this.id = pId;
		this.name = pName;
		this.salesPrice = pSalesPrice;
		
	}
	
	// sout(i1); i1.toString()
	// sout(i2); i2.toString()
	
	// i1.toString() -> this = i1
	// i2.toString() -> this = i2
	@Override
	public String toString() {
		return this.id + "," + this.name + "," + this.salesPrice; 
	}
}
