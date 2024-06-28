package shopping;

import java.time.LocalDate;
import java.time.Month;

/*
  Utility of Order class
 */
public class OrderUtils {
	// o1,o2,o3
		public static double export(Order order) {
			double totalOfMoney = 0;
			ItemDetail[] ids = order.getItemDetails();
			/*
			 * ItemDetail[] ids = getItemDetails(); 
			 * for(int i = 0; i< ids.length; i++1) {
			 * ItemDetail id = ids[1]; }
			 */

			for (ItemDetail id : ids) {
				Item item = id.getItem();
				int quantity = id.getQuantity();
				
				double idCost = item.getCost() * quantity;
				if(item.getCost() > 590 && LocalDate.of(2021, Month.MAY, 8).isEqual(order.getOrderDate().toLocalDate())) {
					idCost *= 0.9;
				}
				totalOfMoney += idCost;
			}

			return totalOfMoney;

		}
}
