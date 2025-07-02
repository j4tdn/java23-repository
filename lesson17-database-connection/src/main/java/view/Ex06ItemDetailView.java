package view;

import service.ItemDetailService;
import service.ItemDetailServiceImpl;

public class Ex06ItemDetailView {
	
	private static ItemDetailService itemDetailService;
	
	static {
		itemDetailService = new ItemDetailServiceImpl();
	}
	
	public static void main(String[] args) {
		System.out.println("== Start Ex06ItemDetailView ==");
		
		itemDetailService.updateAmounts(1, 2, 10);
		
		System.out.println("\n== End Ex06ItemDetailView ==");
	}
	
<<<<<<< HEAD
}
=======
}
>>>>>>> 5c1e4eb (lesson18-jpahibernate-testing 02.07.2025)
