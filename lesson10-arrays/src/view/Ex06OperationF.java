package view;

import bean.Item;
import functional.Transformer;

public class Ex06OperationF {

	/*
	 * Cho danh sách mặt hàng
	 * Viết Chương trình
	 * 
	 * +Tìm  id của tất cả các mặt hàng --> "1 2 3 4 5"
	 * +Tìm  name của tất cả các mặt hàng  --> "Iteam A1 Item A2 Iteam A3 Iteam A4 Iteam A5"
	     
	     --> Kết quả mỗi câu trả về KDL String, các phần tử cách nhau bởi 1 space
	 */

	public static void main(String[] args) {
   		Item[] items = mockData();
   		
   		System.out.println("ids ==> " +transform(items, item -> item.getId()));
   		System.out.println("ids ==> " +transform(items, item -> item.getName()));
   		
	}
	
	private static String transform(Item[] items, Transformer transformer) {
		StringBuilder result = new StringBuilder();
		for(Item item:items) {
			result = result.append(transformer.strategy(item)).append(" ");
		}
		return result.toString();
		
		
		
	}

	private static String getIds(Item[] items) {
		StringBuilder  result = new StringBuilder();
		for(Item item:items) {
               result = result.append(item.getId()).append(" ");	
		}
		return result.toString();
	}
	
	private static String getNames(Item[] items) {
		StringBuilder  result = new StringBuilder();
		for(Item item:items) {
               result = result.append(item.getName()).append(" ");	
		}
		return result.toString();
	}
	
	private static Item[] mockData() {
		return new Item[] {
				new Item(1,"Iteam A1", 11d),
				new Item(2,"Iteam A1", 11d),
				new Item(3,"Iteam A1", 11d),
				new Item(4,"Iteam A4", 11d),
				new Item(5,"Iteam A5", 11d),
		};
	}
}

