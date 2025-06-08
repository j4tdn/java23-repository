package view;

import service.ItemDetailService;
import service.ItemDetailServiceImpl;

public class Ex06ItemDetailView {

	private static ItemDetailService itemDetailService;
	
	static {
		itemDetailService = new ItemDetailServiceImpl();
	}
	
	public static void main(String[] args) {
		System.out.println();
	}
	
}
