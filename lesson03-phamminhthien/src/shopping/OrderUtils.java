package shopping;

import java.time.LocalDate;
import java.time.Month;

/*
 	Utility of Order class
 	Normally: Utility is place where contains methods
 */
public class OrderUtils {
	
	private OrderUtils() {} // ko quan tâm đối tượng đang gọi thì dùng private để ko cho tạo đối tượng
	
	public static double export(Order order) {
		double totolOfMoney = 0;
		// for index
		ItemDetail[] ids = order.getItemDetails();
//		for(int i=0; i < ids.length; i++) {
//			ItemDetail id	= ids[i];
//		}
		
		//for each(duyệt từng phần tử)
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
