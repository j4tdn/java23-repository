package bean;

public class CarAdv {
		//attribute ( thuoc tinh)
	
		public static String model; //hang xe dung chung gia tri cho tat ca doi tuong
		public String name; //ten xe
		private String coler; //mau xe
		private Double price; //gia xe
		public CarAdv() {
		}
		public CarAdv( String name, String coler, Double price) {
			this.name = name;
			this.coler = coler;
			this.price = price;
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
