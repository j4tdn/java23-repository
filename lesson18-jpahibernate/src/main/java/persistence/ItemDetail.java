package persistence;

import java.math.BigDecimal;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "t03_item_detail")
public class ItemDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "C03_ITEM_DETAIL_ID")
	private Integer id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "C03_ITEM_ID", referencedColumnName = "C01_ITEM_ID")
	private Item item;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "C03_SIZE_ID", referencedColumnName = "C02_SIZE_ID")
	private Size size;

	@Column(name = "C03_COLOR")
	private String color;

	@Column(name = "C03_SALES_PRICE")
	private BigDecimal salesPrice;

	@Column(name = "C03_AMOUNT")
	private Integer amount;

	/**
	 * Empty constructor
	 */
	public ItemDetail() {
	}

	/**
	 * Constructor with full parameters
	 */
	public ItemDetail(Integer id, Item item, Size size, String color, BigDecimal salesPrice, Integer amount) {
		this.id = id;
		this.item = item;
		this.size = size;
		this.color = color;
		this.salesPrice = salesPrice;
		this.amount = amount;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public BigDecimal getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(BigDecimal salesPrice) {
		this.salesPrice = salesPrice;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (!(o instanceof ItemDetail that)) {
			return false;
		}

		return Objects.equals(getId(), that.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}

	@Override
	public String toString() {
		return "ItemDetail [id=" + id + ", color=" + color + ", salesPrice=" + salesPrice + ", amount=" + amount + "]";
	}
}
