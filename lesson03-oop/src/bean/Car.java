package bean;

public class Car {
		//attribute ( thuoc tinh)
	
		private String model; //hang xe
		private String name; //ten xe
		private String coler; //mau xe
		private Double price; //gia xe
		public Car() {
		}
		public Car(String model, String name, String coler, Double price) {
			super();
			this.model = model;
			this.name = name;
			this.coler = coler;
			this.price = price;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getColer() {
			return coler;
		}
		public void setColer(String coler) {
			this.coler = coler;
		}
		public Double getPrice() {
			return price;
		}
		public void setPrice(Double price) {
			this.price = price;
		}
		public void doublePrice() {
			this.price= this.price*2;
		}
		@Override
		public String toString() {
			return "Car [model=" + model + ", name=" + name + ", coler=" + coler + ", price=" + price + "]";
		}
		
		
		
}
