package shopping;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;

public class Order {
	private Customer customer;
	private ItemDetail[] itemDetails;
	private LocalDateTime orderDatime;
	
	public Order() {}

	public Order(Customer customer, ItemDetail[] itemDetails, LocalDateTime orderDatime) {
		super();
		this.customer = customer;
		this.itemDetails = itemDetails;
		this.orderDatime = orderDatime;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public ItemDetail[] getItemDetails() {
		return itemDetails;
	}

	public void setItemDetails(ItemDetail[] itemDetails) {
		this.itemDetails = itemDetails;
	}

	public LocalDateTime getOrderDatime() {
		return orderDatime;
	}

	public void setOrderDatime(LocalDateTime orderDatime) {
		this.orderDatime = orderDatime;
	}

	@Override
	public String toString() {
		return "Order [customer=" + customer + ", itemDetails=" + Arrays.toString(itemDetails) + ", orderDatime="
				+ orderDatime + "]";
	}

	public double export() {
		double totolOfMoney = 0;
		// for index
		ItemDetail[] ids = getItemDetails();
//		for(int i=0; i < ids.length; i++) {
//			ItemDetail id	= ids[i];
//		}
		
		//for each(duyệt từng phần tử)
		for(ItemDetail id:ids) {
			Item item = id.getItem();
			int quantity = id.getQuantity();
			
			double idCost = item.getCost()*quantity;
			if(item.getCost() > 590 && LocalDate.of(2024, Month.MAY, 21).isEqual(getOrderDatime().toLocalDate())) {
				idCost *= 0.9;
			}
			totolOfMoney += idCost;
		}
		return totolOfMoney;	
	}

	
}
