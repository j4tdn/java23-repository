package bean;

public class textBook extends book{
	private String condition;
	
	
	public textBook(String id, double price, String publisher,String condition) {
		super(id,price,publisher);
		this.condition = condition;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	@Override
	public String toString() {
		return super.toString() + "textBook [condition=" + condition + "]";
	}

}
