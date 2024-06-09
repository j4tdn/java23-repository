package bean;

import java.security.PublicKey;

public class Item {
	
		public int itemId;
		public String name;
		public double price;
		
		public Item() {
		}
		
		public Item(int itemIdPr, String namePr, double pricePr) {
			this.itemId = itemIdPr;
			this.name = namePr;
			this.price = pricePr;
		}
} 
