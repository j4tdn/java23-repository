package bean;

//Nhăc lại: class = data structe + methods

//Khai báo KDL đối tượng, chứa các thông tin bên trong

public class Item {

	// Item : là KDL

	// class Item chứa 3 thuộc tính id, name, salesPrice

	// lưu ý: non static


	public int id;
	public char name;
	public double salesPrice;
	
	//	trong 1 class mặc định sẽ có 1 hàm khởi tạo rỗng
	// khi gọi hàm khởi tạo này --> nó sẽ tạo ra 1 ô nhớ (chứa 3 thông tin id, name, salesPrice)
	// ô nhớ --> đối tượng, giá tri của item
	
	//Hàm khởi tạo thì ko có kiểu dữ liệu trả về, tên hàm khởi tạo trùng tên vs Class
	 public Item() {
	}
	
	

	//Hàm khởi tạo, tạo ô nhớ và cho phép gán giá trị cho các thuộc tính
	public Item(int pId, char pName, double pSalesPrice){
		this.id = pId;		//biến this đại diện cho ô nhớ dc tạo ra, biến this đang trỏ đến ô nhớ
		this.name = pName;
		this.salesPrice = pSalesPrice;
	} 

	//
	@Override //định nghĩa lại
	public String toString() {
		return this.id + ", " + this.name + ", " + this.salesPrice; //this là đại diện cho biến đang gọi
	}
}
