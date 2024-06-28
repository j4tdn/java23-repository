package vehicle;

public class Order {
	private Customer customer;
	private Car car;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(Customer customer, Car car) {
		super();
		this.customer = customer;
		this.car = car;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "Order [customer=" + customer + ", car=" + car + "]";
	}
	
}
