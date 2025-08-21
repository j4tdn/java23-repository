package view;

import service.ItemGroupService;
import service.ItemGroupServiceImpl;

public class Ex02ItemGroupView {
	
	private static ItemGroupService itemGroupService;
	
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	
	public static void main(String[] args) {
		System.out.println("==== Bắt đầu chương trình ====\n");
		
		itemGroupService.testHibernateCache();
		
		// Với hàm merge, khi truyền object nếu chưa tồn tại thì nên để id là null
		// Nếu có tồn tại thì mới truyền id vào
		// itemGroupService.delete(Set.of(19, 20, 21));
		
		// generate("1. Liệt kê tất cả các loại hàng", itemGroupService.getAll());
		
//		final var group3 = itemGroupService.get(3);
//		
//		generate("2. Liệt kê loại hàng theo mã loại", group3);
//		
//		generate("3. Liệt kê các mặt hàng của loại hàng group3", group3.getItems());
//		
//		generate("4. Liệt kê loại hàng theo tên loại", itemGroupService.get("Áo"));
//		
//		generate("5. Thống kê số lượng mặt hàng cho từng loại hàng", itemGroupService.statisticItemsOfEachGroup());
		
		System.out.println("\n==== Kết thúc chương trình ====");
	}
}
