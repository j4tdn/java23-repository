package videoshoping;

import java.time.LocalDateTime;

public class Order {
	private Customer customer;
	private ItemDetail[] itemDetails;
	private LocalDateTime datetime; //worstcase
	
	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(Customer customer, ItemDetail[] itemDetails, LocalDateTime datetime) {
		super();
		this.customer = customer;
		this.itemDetails = itemDetails;
		this.datetime = datetime;
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

	public LocalDateTime getDatetime() {
		return datetime;
	}

	public void setDatetime(LocalDateTime datetime) {
		this.datetime = datetime;
	}
	
	
	public Double export() {
		double totalOfMoney = 0;
		for (ItemDetail i : this.itemDetails) {
			totalOfMoney += Double.valueOf(i.getItem().getCost()) * i.getQuantity();
		}
		return totalOfMoney;
	}
}
