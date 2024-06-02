package bean;

// Nhắc lại: class = data structure + methods

// Khai báo KDL đối tượng, chứa các thông tin bên trong
public class Item {

//	class Item chứa 3 biến toàn cục id, name, salesPrice
// class Item chứa 3 thuộc tính id, name, SalesPrice
//	biến luôn nằm trong vùng nhớ stack
//	giá trị nằm trong heap

	public int id;
	public char name;
	public double SalesPrice;

	public Item() {

	}

	public Item(int pId, char pName, double pSalesPrice) {
		this.id = pId;
		this.name = pName;
		this.SalesPrice = pSalesPrice;
	}

	
//	sout(i1) ; i1.toString
//	sout(i2) ; i2.toString
	
//	i1.toString() --> this = i1;
//	i2.toString() --> this = i2;
	
	@Override
//	this.id dai dien cho i1
	public String toString() {
		return this.id + "," + this.name + "," + this.SalesPrice ;

	}
}