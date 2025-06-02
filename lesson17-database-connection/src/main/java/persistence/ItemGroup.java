package persistence;

import java.util.Objects;

/**
 * ItemGroup class chứa các thuộc tính dùng để mapping với table T04_ITEM_GROUP
 * với các column tương ứng Người ta gọi nó là entity(hiểu rõ khi học sang ORM
 * framework)
 */
public class ItemGroup {

	private Integer id;
	private String name;

	public ItemGroup() {
	}

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

		return getId().equals(that.getId());
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
