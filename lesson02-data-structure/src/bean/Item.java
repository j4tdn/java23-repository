package bean;

public class Item {
	public int id;
	public String name;
	public double salesPrice;
	
	public Item() {
		
	}
	
	public Item(int pId, String pName, double pSalesPrice) {
		this.id = pId;
		this.name = pName;
		this.salesPrice = pSalesPrice;
	}
	
	@Override
	public String toString() {
		return this.id + " " + this.name + " " + this.salesPrice;
	}
}
