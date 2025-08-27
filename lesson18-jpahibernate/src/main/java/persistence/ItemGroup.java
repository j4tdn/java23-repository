package persistence;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "t04_item_group")
public class ItemGroup {
	
	@Id
	@Column(name = "C04_ITEM_GROUP_ID")
	private Integer id;
	
	@Column(name = "C04_ITEM_GROUP_NAME")
	private String name;
	
	/**
	 * Empty constructor
	 */
	public ItemGroup() {
	}
	
	/**
	 * Required constructor with full parameters
	 */
	public ItemGroup(Integer id, String name) {
		this.id = id;
		this.name = name;
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
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		
		if (!(o instanceof ItemGroup that)) {
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
		return "ItemGroup [id=" + id + ", name=" + name + "]";
	}
}