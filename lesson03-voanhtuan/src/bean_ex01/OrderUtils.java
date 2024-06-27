package bean_ex01;

import java.time.LocalDate;
import java.time.Month;

/*
 	- Utility of Order Class
 	- Normally: Utility is a place where contains utility methods
 	- Do not care created class's objects
*/

public class OrderUtils {
	// o1, o2, o3
	public static double export(Order order) {
		double totalOfMoney = 0;

		ItemDetail[] ids = order.getItemDetails();
		// vòng lặp for each
			// duyệt từng phần tử id trong mảng ids
			// lấy từng item và quantity
			// mỗi lần lấy thì tính tổng tiền += giá item * số lượng
		for (ItemDetail id : ids) {
			Item item = id.getItem();
			int quantity = id.getQuantity();

			double idCost = item.getCost() * quantity;
			if (item.getCost() > 590 && LocalDate.of(2021, Month.MAY, 8).isEqual(order.getOrderDate().toLocalDate())) {
				idCost *= 0.9;
			}
			totalOfMoney += idCost;
		}
		return totalOfMoney;
	}
}
