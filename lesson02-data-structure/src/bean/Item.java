package bean;

//Khai bao KDL doi tuong
public class Item {

	//Item : KDL
	//non static
	
	//cu 1 lan dung tu khoa new goi ham
	public int id ;
	public char name;
	public double salesPrice;
	
	//trong 1 class mac dinh se co 1 ham khoi tao rong
	//khi goi ham khoi tao nay --> no se tao ra 1 o nho (chua 3 thong tin id, name, salesPrice) o vung nho HEAP	
	//o nho --> doi tuong, gia tri cua item
	
	//Ham khoi tao, khong co KDL tra ve --> mac dinh no se tra ve KDL cua class
	//Ten ham trung voi ten class
	public Item() {
		
	}
	
	public Item(int pId, char pName, double pSalesPrice) {
		this.id = pId;
		this.name = pName;
		this.salesPrice = pSalesPrice;
	}
	
	@Override
	public String toString() {
		return this.id + ", " + this.name + ", " + this.salesPrice;
	}
	
}
