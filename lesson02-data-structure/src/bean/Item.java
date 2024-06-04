package bean;
// class = data structure + methods
// Khai báo kiểu dữ liệu đối tượng, chứa các thông tin bên trong  
public class Item {
	// lưu ý Không sử dụng static 
	public int id;
	public char name ;
	public double salesPrice;
	// Item : kiểu dữ liệu 
	// class Item chứa 3 biến toàn cục id, name, salesPrice
	// Hay còn nói cách khác class Item chứa 3 thuộc tính id, name, salesPrice
	public Item(int pId, char pName, double pSalesPrice) {
		this.id = pId;
		this.name = pName;
		this.salesPrice = pSalesPrice;
		
	}
	public Item() {
		
	}
	@Override
	public String toString() {
		return this.id + ", " + this.name + ", " + this.salesPrice;
	}
}
