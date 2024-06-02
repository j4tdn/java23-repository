package bean;

public class Item {
	
	
	public int id ;
	public char name;
	public double salePrice;
	public Item () {
		
	}
	public Item(int pId, char pName, double pSalesPrice) {
		this.id = pId;
		this.name = pName;
		this.salePrice = pSalesPrice;
		
	}
	
	//i1.toString() --> this =i1;
	//i2.toString() --> this = i2;
	@Override
	public String toString() {
		return this.id + " ,"+this.name + " ,"+ this.salePrice;
	}
}
