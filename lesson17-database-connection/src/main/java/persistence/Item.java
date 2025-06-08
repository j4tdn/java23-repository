package persistence;

import java.util.Objects;

/**
 * Item class chứa các thuộc tính dùng để mapping với table T01_ITEM với các
 * column tương ứng Người ta gọi nó là entity (hiểu rõ khi học sang ORM
 * framework)
 */

public class Item {

	private Integer id;
	private String name;
	private ItemGroup group;

	public Item() {
	}

	public Item(Integer id, String name, ItemGroup group) {
		this.id = id;
		this.name = name;
		this.group = group;
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

	public ItemGroup getGroup() {
		return group;
	}

	public void setGroup(ItemGroup group) {
		this.group = group;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (!(o instanceof Item that)) {
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
		return "Item [id=" + id + ", name=" + name + ", group=" + group + "]";
	}
	

}
