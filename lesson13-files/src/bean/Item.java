package bean;

import java.math.BigDecimal;
import java.util.Objects;

public class Item {
	
	private Integer id;
	private String name;
	private BigDecimal salesPrice;
	
	public Item() {
	}

	public Item(Integer id, String name, BigDecimal salesPrice) {
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(BigDecimal salesPrice) {
		this.salesPrice = salesPrice;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		
		if (!(o instanceof Item that)) {
			return false;
		}
		
		return getId() == that.getId();
	}
	
	public String toLine() {
		return getId() + ", " + getName() + ", " + getSalesPrice();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", salesPrice=" + salesPrice + "]";
	}
}
