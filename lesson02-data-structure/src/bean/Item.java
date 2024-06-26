package bean;

// class = data structure + methods
// khai báo kiểu dữ liệu đối tượng, chứa các thông tin bên trong
public class Item {
	
	// Item : kiểu dữ liệu
	// class item chứa 3 biến toàn cục id, name, salesPrice
	// 				   3 thuộc tính id, name, salesPrice
	
	// lưu ý: non static
	
	// cứ 1 lần dùng từ khóa new gọi hàm khởi tạo để tạo ra ô nớ để lưu trữ 1 Item
	// thì ô nhớ đó luôn có 3 thuộc tính id, namen, slaesPrice với giá trị mặc định
	public int id;
	public char name;
	public double salesPrice;
	
	// trong 1 class mặc định sẽ có 1 hàm khởi tạo rỗng
	// khi gọi hàm khởi tạo này --> nó sẽ tạo ra 1 ô nhớ (chuwssa 3 thông tin id, name, slaesPrice) ở vùng nhớ Heap
	// ô nhớ --> đối tượng, giá trị của Item
	
	// Hàm khởi tạo, ko có KDL trả về --> mặc định nó sẽ trả về KDL của class
	// Tên hàm trùng với tên class
	
	// Hàm khởi tạo, khởi tạo ô nhớ và cho phép gán giá trị cho các thuộc tính của ô nhớ đó
	
	// Item i3 = new Item(3, 'C', 33);
	
	// Sau khi tạo ô nhớ, biến this sẽ đại diện cho ô nhớ vừa tạo ra
	// biến this đang trỏ đến ô nhớ
	public Item(int pId, char pName, double pSalesPrice) {
		this.id = pId;
		this.name = pName;
		this.salesPrice = pSalesPrice;
	}
	
	// sout(i1); i1.toString()
	// i1.toString() --> this = i1
	@Override
	public String toString() {
		return this.id + ", " + this.name + ", " + this.salesPrice;
	}
	
	public Item() {
	}
}