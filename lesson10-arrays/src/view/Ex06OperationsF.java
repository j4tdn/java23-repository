package view;


import bean.Item;
import functional.Operator;
import functional.OperatorF;
import functional.Transformer;

public class Ex06OperationsF {

	/*
	 Cho danh sách các mặt hàng 
	 Viết chương trình 
	 + Tìm id của tất cả các mặt hàng
	 + Tìm name của tất cả các mặt hàng
	 --> Kết quả mỗi câu đều trả về String, các phần tử cách nhau bởi dấu " " - 1 space
	 */
	
	public static void main(String[] args) {
		Item[] items = mockData();
		
		System.out.println("--> " + getData(items, source -> source.getId().toString()));
		System.out.println("--> " + getData(items, source -> source.getName()));

		System.out.println("--> " + transform(items, item -> item.getId()));
		System.out.println("--> " + transform(items, item-> item.getName()));

//		System.out.println("--> " + getData(items));
//		System.out.println("--> " + getName(items));
	}
	private static String transform(Item[] items, Transformer transformer) {
		StringBuilder s = new StringBuilder();
		for (Item item: items) {
			s.append(transformer.transform(item)).append(" " );
		}
		return s.toString();
	}
	private static String getData(Item[] source, OperatorF opt) {
		StringBuilder s = new StringBuilder();
		for (Item item: source) {
//			s = s + opt.strategyF(item) + " ";
			s.append(opt.strategyF(item)).append(" " );
		}
		return s.toString();
	}
	private static Item[] mockData() {
		return new Item[] {
				new Item(1, "Item A1", 11d),
				new Item(2, "Item A2", 12d),
				new Item(3, "Item A3", 13d),
				new Item(4, "Item A4", 14d),
				new Item(5, "Item A5", 15d),
		};
	}
//	private static String getData(Item[] source) {
//		String s = "";
//		for (Item i : source) {
//			s = s + i.getId();
//			s += " ";
//		}
//		return s;
//	}
//	private static String getName(Item[] source) {
//		String s = "";
//		for (Item i : source) {
//			s = s + i.getName() + " ";
////			s += " ";
//		}
//		return s;
//	}
}
