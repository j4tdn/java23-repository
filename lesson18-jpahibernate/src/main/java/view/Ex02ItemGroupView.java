package view;

import static utils.PrintUtils.generate;

import service.ItemGroupService;
import service.ItemGroupServiceImpl;

public class Ex02ItemGroupView {
	
	private static ItemGroupService itemGroupService;
	
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	
	public static void main(String[] args) {
		System.out.println("==== Bắt đầu chương trình ====\n");
		
		generate("1. Liệt kê tất cả các loại hàng", itemGroupService.getAll());
		
		System.out.println("\n==== Kết thúc chương trình ====");
	}
}