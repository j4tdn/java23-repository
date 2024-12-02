package bean;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Item {
	
	private Integer id;
	private String name;
	private BigDecimal salePrice;
	private LocalDate expiredDate;
	
	public  Item() {
		
	}

	public Item(Integer id, String name, BigDecimal salePrice, LocalDate expiredDate) {
		this.id = id;
		this.name = name;
		this.salePrice = salePrice;
		this.expiredDate = expiredDate;
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

	public BigDecimal getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(BigDecimal salePrice) {
		this.salePrice = salePrice;
	}

	public LocalDate getExpiredDate() {
		return expiredDate;
	}

	public void setExpiredDate(LocalDate expiredDate) {
		this.expiredDate = expiredDate;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", salePrice=" + salePrice + ", expiredDate=" + expiredDate + "]";
	}
	
	
}
