package view;

public class Import_Crtreate {
	private String name;
	private String type;
	private int capacity;
	private double value;
	public Import_Crtreate() {
		
	}
	public Import_Crtreate(String name, String type, int capacity, double value) {
		super();
		this.name = name;
		this.type = type;
		this.capacity = capacity;
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Import_Crtreate [name=" + name + ", type=" + type + ", capacity=" + capacity + ", value=" + value + "]" + " compulsory tax "  +tax();
	}
	public double tax() {
		if(this.capacity < 100) return this.value*0.01;
		if(this.capacity < 200) return this.value* 0.03;
		return this.value*0.05;
	}
}
