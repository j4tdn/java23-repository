package bean;

public class Item {
	public int id = 88;
	public char name;
	public double salesPrice;
	
	public Item() {};
	
	public Item(int pId, char pName, double pSalePrice) {
		this.id = pId;
		this.name = pName;
		this.salesPrice = pSalePrice;
	}
	// trong 1 class mặc định sẽ có 1 hàm khởi tạo rỗng
	// khi gọi hàm khởi tạo này => nó sẽ tạo ra 1 đối tượng(giá trị) cho Item
	//
	@Override
	public String toString() {
		return ("id: "+ this.id + ", name: " + this.name + ", salePrice: "+ this.salesPrice);
	}
}
