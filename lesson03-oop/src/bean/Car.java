package bean;


/*
 * Car là 1 class 
 *     là 1 KDl
 */
public class Car {
	//attribute(thuộc tính)
	//mỗi cái đối tượng được tạo ra từ cái class car luôn có 4 thông tin
	//mỗi cái giá trị của KDl car luôn có 4 thông tin 
	private String model;// hãng xe
	private String name;//tên xe
	private String color;//màu xe
	private Double price;//giá xe
	
	//constructor with no parameter
	public Car() {
		
	}
	public void setModel(String model) {
		this.model=model;
	}
	public void setColor(String color) {
		this.color=model;
	}
	public void setPrice(Double price) {
		this.price=price;
	}
	//c1 setName("A22")
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getPrice() {
		return price;
	}
	public void doublePrice() {
		this.price = this.price*2;
	}
	//constructor with all parameters
	public Car(String model,String name,String color,Double price) {
		this.model = model;
		this.name	=name;
		this.color = color;
		this.price = price;
	}
	
	//sout(c1)-->sout(c1.toString())--> this = c1
	//sout(c1)-->sout(c2.toString())--> this = c2	
	
	
	@Override
	public String toString() {
		return model +" ,"+name +","+color+","+price;
	}
	
	
	
}
