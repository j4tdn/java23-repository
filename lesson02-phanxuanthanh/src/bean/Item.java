package bean;

public class Item {
	public int id;
	public String name;
	public double salesPrice;
	public Item() {		
	}
	public Item(int pId, String string, double pSalesPrice) {
		this.id = pId;
		this.name = string;
		this.salesPrice = pSalesPrice;
		
	}
	public String toString() {
		return this.id + "," + this.name + "," + this.salesPrice; 
	}
}