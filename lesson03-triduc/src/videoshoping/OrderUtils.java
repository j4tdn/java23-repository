package videoshoping;

public class OrderUtils {
	private OrderUtils() { //hạn chế việc tạo bừa bãi
	}
	
	public static Double export(Order order) {
		double totalOfMoney = 0;
		for (ItemDetail i : order.getItemDetails()) {
			totalOfMoney += Double.valueOf(i.getItem().getCost()) * i.getQuantity();
		}
		return totalOfMoney;
	}
}
