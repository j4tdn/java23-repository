package bean;

// nhắc lại: class = date structure + methods

//khai báo kdl đối tượng , chứa các thông tin bên trong 
public class Item {
	
	// Item: kiểu dữ liệu 
	
	// class Item chứa 2 biến toàn cục: id name salePrice
	// class Item chứa 3 thuộc tính id, name, salePrice
	
	//lưu ý: non static
	
	public int id;
	public char name;
	public double salePrice;
	
	// trong 1 class mặc định sẽ có 1 hàm khởi tạo trống
	//khi gọi hàm khởi tạo này --> nó tao ra 1 ô nhớ (chứa 3 thông tin id name salePrice) ở vùng nhớ Head cho cái class Item
	//ô nhớ --> đối tượng, giá trị của item
	
	// hàm khởi tạo, không có kdl trả về --> mặc định nó trả về kdl của class
	//tên hàm trùng với tên class
	
	public Item() {
		
	}

}
