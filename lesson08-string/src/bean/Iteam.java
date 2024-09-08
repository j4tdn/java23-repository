package bean;

public class Iteam {

	private Integer id;
	private String name;
	
	public Iteam() {
		// TODO Auto-generated constructor stub
	}

	public Iteam(Integer id, String name) {
		super();
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
		// nếu 2 đối tượng trỏ đến 1 ô nhớ, trùng địa chỉ
		if(this == o) {
			return true;
		}
		// yêu cầu phải là Item
		if(!(o instanceof Iteam)) {
			return false;
		}
		// 2 đối tượng là Iteam
		// 2 đối tượng equals nhau khi trùng id
		Iteam that = (Iteam)o;
		return getId() == that.getId();
	}
	 
	@Override
	public String toString() {
		return "Iteam [id=" + id + ", name=" + name + "]";
	}

}
