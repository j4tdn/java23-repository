package view;

import bean.CarAdv;

public class Ex04UsingStaticAttribute {
	public static void main(String[] args) {
		CarAdv c1 = new CarAdv("A1", "Red", 202d);
		CarAdv c2 = new CarAdv("A2", "Green", 2202d);
		CarAdv c3 = new CarAdv("A3", "Red", 2032d);
		
		//c2.setModel("MG"); //-> cập nhập tất cả
		
		//non-static: thuộc phạm vi đối tượng -> mỗi đối tượng mỗi biến
		
		//static: thuộc phạm vi class -> tất cả đối tượng trong class đều có giá trị đó --> nên để public
		//-> không nến lấy biến để thay đổi giá trị cho biến static -> misunderstanding
		CarAdv.model = "MG";
		
		System.out.println("c1 --> " + c1);
		System.out.println("c2 --> " + c2);
		System.out.println("c3 --> " + c3);
	}
}
