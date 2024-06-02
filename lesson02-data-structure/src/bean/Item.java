package bean;

public class Item {

	// Item : là KDL
	// Gồm ba thuộc tính id, name, salesPrice
    // class mặc định sẽ có một hàm khởi tạo rỗng
	// một ô nhớ (chứa 3 thông tin id, name, salesPrice)

	public int id;
	public char name;
	public double salesPrice;
	public Item() { }
	
	public Item(int pId, char pName, double pSalesPrice) {
		this.id = pId;
		this.name = pName;
		this.salesPrice = pSalesPrice;		
	}
		
	@Override
	public String toString() {
		return this.id + " , "+this.name + " , "+ this.salesPrice;
	}
}
