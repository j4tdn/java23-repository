package bean;

import java.math.BigDecimal;
import java.util.Objects;

public class Item {

	private Integer id;
	private String name;
	private BigDecimal salesPreice;
	
	public Item() {
	}

	public Item(Integer id, String name, BigDecimal salesPreice) {
		this.id = id;
		this.name = name;
		this.salesPreice = salesPreice;
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

	public BigDecimal getSalesPreice() {
		return salesPreice;
	}

	public void setSalesPreice(BigDecimal salesPreice) {
		this.salesPreice = salesPreice;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if(!(o instanceof Item that)) return false;
		return getId() == that.getId();
	}
	
	public String toLine() {
		return getId() + ", " + getName() + ", " + getSalesPreice();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", salesPreice=" + salesPreice + "]";
	}
	
}
