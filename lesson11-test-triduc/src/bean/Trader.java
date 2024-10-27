package bean;

import java.util.Comparator;
import java.util.Objects;

public class Trader {
	private Integer id;
	private String name;
	private String city;

	public Trader() {
	}

	public Trader(Integer id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trader other = (Trader) obj;
		return Objects.equals(city, other.city) && Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Trader [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

}
