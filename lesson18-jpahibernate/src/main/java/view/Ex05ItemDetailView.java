package view;

import static utils.PrintUtils.generate;

import service.ItemDetailService;
import service.ItemDetailServiceImpl;

public class Ex05ItemDetailView {
	
	private static ItemDetailService itemDetailService;
	
	static {
		itemDetailService = new ItemDetailServiceImpl();
	}
	
	public static void main(String[] args) {
		System.out.println("==== Bắt đầu chương trình ====\n");
		
		final var details = itemDetailService.getAll();
		
		generate("1. Liệt kê tất cả các mặt hàng và thông tin chi tiết", details);
		
		generate("2. Kiểm tra lazy fetch", details.get(4).getSize());
		
		System.out.println("\n==== Kết thúc chương trình ====");
	}
<<<<<<< HEAD
}
=======
}
>>>>>>> 5c1e4eb (lesson18-jpahibernate-testing 02.07.2025)
