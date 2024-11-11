package bean;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Item {

	private Integer id;
	private String name;
	private LocalDate expiredDate;
	private BigDecimal salesPrice;
	
	public Item() {
	}

	public Item convert(String lines) {
		var tokens = lines.split(", ");
		this.id = Integer.parseInt(tokens[0]);
		this.name = tokens[1];
		this.expiredDate = LocalDate.parse(tokens[2], DateTimeFormatter.ofPattern("dd.MM.yyyy"));
		this.salesPrice = new BigDecimal(tokens[3]);
	}
	
	public Item(Integer id, String name, LocalDate expiredDate, BigDecimal salesPrice) {
		this.id = id;
		this.name = name;
		this.expiredDate = expiredDate;
		this.salesPrice = salesPrice;
	}

	public static Item init() {
		return new Item();
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

	public LocalDate getExpiredDate() {
		return expiredDate;
	}

	public void setExpiredDate(LocalDate expiredDate) {
		this.expiredDate = expiredDate;
	}

	public BigDecimal getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(BigDecimal salesPrice) {
		this.salesPrice = salesPrice;
	}

	@Override
	public boolean equals(Object o) {
		if(this == o)
			return true;
		if(!(o instanceof Item))
			return false;
		Item that = (Item)o;
		return getId() == that.getId();
	}
	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}
	
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", expiredDate=" + expiredDate + ", salesPrice=" + salesPrice
				+ "]";
	}

}
