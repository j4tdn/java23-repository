package view;

import service.ItemGroupService;
import service.ItemGroupServiceImpl;

import static utils.PrintUtils.*;

import persistence.ItemGroup;

public class Ex02ItemGroupView {
	
	private static ItemGroupService itemGroupService;
	
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	
	public static void main(String[] args) {
		itemGroupService.save(new ItemGroup(8, "Balô"));
		
		System.out.println();
		
		generate("1. Liệt kê tất cả các loại hàng", itemGroupService.getAll());
		
		generate("2. Liệt kê loại hàng theo mã loại", itemGroupService.get(5));
		
		generate("3. Liệt kê loại hàng theo tên loại", itemGroupService.get("Thắt lưng"));
		
		generate("4. Thống kê số lượng mặt hàng của từng loại hàng", itemGroupService.statisticItemGroups());
	}
	
}
