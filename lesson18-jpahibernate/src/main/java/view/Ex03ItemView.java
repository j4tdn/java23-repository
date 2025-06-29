package view;

import static utils.PrintUtils.generate;

import service.ItemService;
import service.ItemServiceImpl;

public class Ex03ItemView {
	
	private static ItemService itemService;
	
	static {
		itemService = new ItemServiceImpl();
	}
	
	public static void main(String[] args) {
		System.out.println("==== Bắt đầu chương trình ====\n");
		
		final var items = itemService.getAll();
		
		generate("1. Liệt kê tất cả các mặt hàng", items);
		
		generate("2. Kiểm tra lazy fetch", items.get(4).getGroup());
		
		System.out.println("\n==== Kết thúc chương trình ====");
	}
}
