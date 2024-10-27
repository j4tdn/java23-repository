package bean;

import java.util.Objects;

public class Apple {
	private Integer id;
	private String color;
	private Double weight;
	private String country;

	public Apple() {
		// TODO Auto-generated constructor stub
	}

	public Apple(Integer id, String color, Double weight, String country) {
		this.id = id;
		this.color = color;
		this.weight = weight;
		this.country = country;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}


	@Override
	public int hashCode() {
		return Objects.hash(color, country, id, weight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Apple other = (Apple) obj;
		return Objects.equals(color, other.color) && Objects.equals(country, other.country)
				&& Objects.equals(id, other.id) && Objects.equals(weight, other.weight);
	}

	@Override
	public String toString() {
		return "Apple [id=" + id + ", color=" + color + ", weight=" + weight + ", country=" + country + "]";
	}

}
