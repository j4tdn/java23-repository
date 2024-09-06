package bean;

public class Item {

	private Integer id;
	private String name;
	
	public Item() {

	}
	
	

	public Item(Integer id, String name) {
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
//        Nếu 2 đối tượng cùng trỏ đến 1 ô nhớ,trùng địa chỉ      
		if( this == o) { 
            	 return true;
             }
             
//		Yêu cầu phải chung đối tượng Item
		if(!(o instanceof Item) ) {
			return false;
		}
//		2 đối tượng để là Item 
//		2 đối tượng equals nhau khi trùng id
		Item that = (Item)o;
		return this.getId() == that.getId();
	}
	
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + "]";
	}

	
}
