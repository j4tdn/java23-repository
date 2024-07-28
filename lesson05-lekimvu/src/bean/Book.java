package bean;

public abstract class Book {

      private int id;
      private double salesPrice;
      private String owner;
      
      public Book() {

      }

	public Book(int id, double salesPrice, String owner) {
		this.id = id;
		this.salesPrice = salesPrice;
		this.owner = owner;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(double salesPrice) {
		this.salesPrice = salesPrice;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public abstract double sum();
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", salesPrice=" + salesPrice + ", owner=" + owner + "]";
	}

	
      
}
