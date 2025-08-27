package view;

import service.OrderService;
import service.OrderServiceImpl;

import static utils.PrintUtils.*;

public class Ex04OrderView {
	
	private static OrderService orderService;
	
	static {
		orderService = new OrderServiceImpl();
	}
	
	public static void main(String[] args) {
		generate("1. Liệt kê danh sách các ngày bán", orderService.getSalesDate());
	}
	
}