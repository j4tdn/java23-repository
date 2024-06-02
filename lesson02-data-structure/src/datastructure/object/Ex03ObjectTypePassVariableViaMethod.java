package datastructure.object;

import bean.Item;

public class Ex03ObjectTypePassVariableViaMethod {
	public static void main(String[] args) {
		Item i1 = new Item(55, "hum", 555);
		System.out.println(i1);
		modify(i1);
		System.out.println(i1);
	}
	
	private static void modify (Item item) {
		Item i2 = new Item(33,"b",666);
		i2 = item;
		item.salesPrice = 999;
		item = new Item(1,"a",11);
		item.salesPrice = 777;
		item = i2;
		i2.id = 44;
	}
}
