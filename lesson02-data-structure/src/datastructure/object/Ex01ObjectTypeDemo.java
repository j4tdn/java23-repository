package datastructure.object;

//class này sử dụng class kia
//nếu 2 class khác package thì phải import
import bean.Item;

public class Ex01ObjectTypeDemo {
	public static void main(String[] args) {
		char v1= '@';
		int v2=22;
		System.out.println("v1 -->" +v1);
		System.out.println("v2 -->" +v2);
		
		//object type
		Item i1 = new Item();
		i1.id = 1;
		i1.name = 'A';
		i1.salesPrice = 11;
		System.out.println("i1 id ->"+i1);//bean.Item@5577140b
		System.out.println("i1 id = "+i1.id);
		System.out.println("i1 name = "+i1.name);
		System.out.println("i1 salesPrice = "+i1.salesPrice);
	}
}
