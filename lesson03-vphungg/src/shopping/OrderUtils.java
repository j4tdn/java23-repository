package shopping;

import java.time.LocalDate;

/**
 	Utility of Order Class
 	- Normally: Utility is place where contains utility methods
 	No cares created class's objects
 */
public class OrderUtils {
	
	// o1, o2, o3
	public static double export(Order order) {
		double totalOfMoney = 0;
		
		ItemDetail[] ids = order.getItemDetails();
		// for index
		//for (int i = 0; i < ids.length; i++) {
		//	ItemDetail id = ids[i];
		//}
		
		// for each
		for (ItemDetail id: ids) {
			Item item = id.getItem();
			int quantity = id.getQuantity();
			double idCost = item.getCost() * quantity;
			if (item.getCost() > 590 && LocalDate.of(2021, 5, 8).isEqual(order.getDatetime().toLocalDate())) {
				idCost *= 0.9;
			}
			totalOfMoney += idCost;
		}
		return totalOfMoney;
	}

}
