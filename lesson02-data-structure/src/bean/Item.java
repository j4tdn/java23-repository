package bean;
 //class = data stucture  +method
public class Item {
	//item kieu du lieu
	//class  item  chua 3 
	 public int id;
	 public char name;
	 public  double salesPrice;
	 public Item() {
		
	}
	public Item(int pId, char pName, double pSalesPrice) {
		super();
		this.id = pId;
		this.name = pName;
		this.salesPrice = pSalesPrice;
	}
	@Override
	public String toString() {
		return this.id + ","+this.name+","+this.salesPrice;
	}
	
	
	 
	
}
