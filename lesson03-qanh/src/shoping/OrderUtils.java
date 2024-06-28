package shoping;

import java.time.LocalDate;
import java.time.Month;

public class OrderUtils {
	
	private OrderUtils() {} 
	
	public static double export(Order order) {
		double totolOfMoney = 0;
	
		ItemDetail[] ids = order.getItemDetails();

		for(ItemDetail id:ids) {
			Item item = id.getItem();
			int quantity = id.getQuantity();
			
			double idCost = item.getCost()*quantity;
			if(item.getCost() > 590 && LocalDate.of(2024, Month.MAY, 21).isEqual(order.getOrderDatime().toLocalDate())) {
				idCost *= 0.9;
			}
			totolOfMoney += idCost;
		}
		return totolOfMoney;	
	}
}
