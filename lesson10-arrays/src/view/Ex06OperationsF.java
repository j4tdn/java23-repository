package view;

import bean.Item;
import functional.Transformer;

public class Ex06OperationsF {
	/*
	 * Cho danh sách mặt hàng Viết chương trinh
	 * 
	 * + Tìm id của tất cả các mặt hàng --> "1 2 3 4 5" + Tìm name của tất cả các
	 * mặt hàng --> "Item A1 Item A2 Item A3 Item A4 Item A5" --> Kết quả mỗi câu
	 * trả về KDL String, các phần tử cách nhau bởi 1 space
	 * 
	 */
	public static void main(String[] args) {
		Item[] items = mockData();
		System.out.println("ids -> " + transform(items, item -> item.getId()));
		System.out.println("names -> " + transform(items, item -> item.getName()));
	}

	private static Item[] mockData() {
		return new Item[] { new Item(1, "Item A1", 11d), new Item(2, "Item A2", 12d), new Item(3, "Item A3", 13d),
				new Item(4, "Item A4", 14d), new Item(5, "Item A5", 15d), };
	}

	private static String transform(Item[] items, Transformer transformer) {
		StringBuilder result = new StringBuilder();
		for (Item item : items) {
			result = result.append(transformer.stratergy(item)).append(" ");
		}
		return result.toString();
	}

}