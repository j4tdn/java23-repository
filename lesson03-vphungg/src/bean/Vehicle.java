package bean;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Vehicle {

	private String owner;
	private String model;
	private Integer capacity;
	private BigDecimal salesPrice;
	
	// private BigDecimal tax; // do tính toán ra(không phải là input)
	
	public Vehicle() {
	}

	public Vehicle(String owner, String model, Integer capacity, BigDecimal salesPrice) {
		this.owner = owner;
		this.model = model;
		this.capacity = capacity;
		this.salesPrice = salesPrice;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	public BigDecimal getSalesPrice() {
		return salesPrice;
	}

	public String getFormattedSalePrice(DecimalFormat df) {
		return df.format(salesPrice.doubleValue());
	}
	
	public void setSalesPrice(BigDecimal salesPrice) {
		this.salesPrice = salesPrice;
	}

	public BigDecimal getTax() {
		BigDecimal taxInpercent = null;
		if (capacity < 100) {
			taxInpercent = new BigDecimal("1");
		} else if (capacity <= 200) {
			taxInpercent = new BigDecimal("3");
		} else {
			taxInpercent = new BigDecimal("5");
		}
		return salesPrice.multiply(taxInpercent, MathContext.DECIMAL64)
				.setScale(0, RoundingMode.HALF_UP);
	}
	
	public String getFormattedTax(DecimalFormat df) {
		return df.format(getTax().doubleValue());
	}

	@Override
	public String toString() {
		return "Vehicle [owner=" + owner + ", model=" + model + ", capacity=" + capacity + ", salesPrice=" + salesPrice
				+ ", tax=" + getTax() + "]";
	}
	
	
	
}
