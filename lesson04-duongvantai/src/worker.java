
public class worker {
	private String name;
	private Integer date;
	private String position;
	public worker() {
		// TODO Auto-generated constructor stub
	}
	public worker(String name, Integer date, String position) {
		super();
		this.name = name;
		this.date = date;
		this.position = position;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getDate() {
		return date;
	}
	public void setDate(Integer date) {
		this.date = date;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	@Override
	public String toString() {
		return "worker [name=" + name + ", date=" + date + ", position=" + position + "]";
	}
	
}
