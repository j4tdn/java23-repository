package shopping;

import java.time.LocalDate;
import java.time.Month;

import bean.Item;
import bean.ItemDetail;
import bean.Order;

/*	
 *  Utility of Order Class
 *  Normally: Utility là nơi chứa các phương thức tiện ích
 *  Không quan tâm đến objects được tạo ra của class 
 *  
 */

public class OrderUtils {
	
	private OrderUtils() {
	}

	public static double export(Order order) {
		double totalOfMoney = 0;

		ItemDetail[] ids = order.getItemDetails();
		// for each
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
