package persistence;

import java.util.Objects;

import common.SizeDef;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "t02_size")
public class Size {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "C02_SIZE_ID")
	private Integer id;

	@Enumerated(EnumType.STRING)
	@Column(name = "C02_SIZE_NAME")
	private SizeDef name;

	@Column(name = "C02_GENDER")
	private Boolean gender;

	@Column(name = "C02_SIZE_DESC")
	private String description;

	/**
	 * Empty constructor
	 */
	public Size() {
	}

	/**
	 * Constructor with full parameters
	 */
	public Size(Integer id, SizeDef name, Boolean gender, String description) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public SizeDef getName() {
		return name;
	}

	public void setName(SizeDef name) {
		this.name = name;
	}

	public Boolean getGender() {
		return gender;
	}

	public void setGender(Boolean gender) {
		this.gender = gender;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (!(o instanceof Size that)) {
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
		return "Size [id=" + id + ", name=" + name + ", gender=" + gender + ", description=" + description + "]";
	}
}
