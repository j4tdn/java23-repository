package view;

import bean.Item;

public class Ex01Final {

	public static void main(String[] args) {
		
		//Toan tu = hoat dong o STACK
		//Final --> Final o STACK
		//      --> Khi 1 bien co tu khoa final --> ko the gan lai gia tri cho no o STACK
		//                                      --> ko the dung toan tu =
		
		//Bien --> KDL nguyen thuy
		//De cap nhat gia tri --> su dung toan tu = 
		int a = 5;
		final int b = 7;
		//b = 10;
		a = b;
		
		//Bien --> KDL doi tuong
		//De cap nhat gia tri
		//C1: Su dung toan tu = de cap nhat dia chi ma bien dang tro den
		//C2: Cap nhat gia tri thuoc tinh cua doi tuong o HEAP ma bien dang tro den
		final Item item1 = new Item(1,'A',120);
		final Item item2 = new Item(2,'B',240); 
		
		//C2
		item1.salesPrice = 222;
		//C1
		//item1 = item2;
		
	}
}
