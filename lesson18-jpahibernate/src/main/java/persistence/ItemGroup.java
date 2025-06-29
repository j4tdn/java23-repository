package persistence;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQueries;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "t04_item_group")
@NamedNativeQueries(
	@NamedNativeQuery(
		name = ItemGroup.Q_GET_ALL,
		query = "SELECT * FROM t04_item_group",
		resultClass = ItemGroup.class
	)
)
public class ItemGroup {
	
	public static final String Q_GET_ALL = "Q_GET_ALL";
	
	@Id
	@Column(name = "C04_ITEM_GROUP_ID")
	private Integer id;
	
	@Column(name = "C04_ITEM_GROUP_NAME")
	private String name;
	
	// OneToMany: Mặc định lazy fetch
	
	// mappedBy = "Tên của thuộc tính đã mapping quan hệ N-1 bên Entity 1"
	@OneToMany(mappedBy = "group")
	
	private List<Item> items = new ArrayList<>();
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
	
	public List<Item> getItems() {
		return items;
	}
	
	public void setItems(List<Item> items) {
		this.items = items;
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
