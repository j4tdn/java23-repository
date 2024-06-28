package shopping;

import java.time.LocalDate;
import java.time.Month;

/**
 *  Utility of Order class
 *  Normally: Utility is the place where contain utility methods
 *  No cares created class's objects 
 *  student's shirt  students' shirt
 */
public class OrderUtils {
	public static double export(Order order) {
		double totalOfMoney = 0;
		
		ItemDetail[] ids = order.getItemDetails();
//		for(int i = 0; i < ids.length; i++) {
//			ItemDetail id = ids[i];
//		}
		// hoac
		 for (ItemDetail id: ids) {
			 Item item = id.getItem();
			 int quantity = id.getQuantity();
			 double idCost = item.getCost() * quantity;
			 
			 if(item.getCost() > 590 && LocalDate.of(2021, Month.MAY, 8).isEqual(order.getOrderDate().toLocalDate())) {
				 idCost *= 0.9;
			 }
			 else {
				 totalOfMoney += idCost;
			 }
		 }
		
		return totalOfMoney;
	}
}
