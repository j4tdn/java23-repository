package shopping;

import java.time.LocalDateTime;
public class App {
	
		public static void main(String[] args) {
			Customer c1 = new Customer("KH1", "Adam", "123", "DaNang");
			Customer c2 = new Customer("KH2", "Kate", "234", "California");

			Item i1 = new Item("SS10+", "Android", "Black", 620);
			Item i2 = new Item("SS20U", "Android", "Green", 840);
			Item i3 = new Item("IP4", "IOS", "White", 280);
			Item i4 = new Item("IP12", "IOS", "Black", 880);
			Item i5 = new Item("WP8", "WindowPhone", "Blue", 560);

			ItemDetail id = new ItemDetail(i1, 3);

			Order o1 = new Order(c1, new ItemDetail[] { 
					new ItemDetail(i1, 3), 
					new ItemDetail(i4, 5), 
					new ItemDetail(i2, 1), 
			},LocalDateTime.of(2024, 6, 21, 5, 56, 20));
			
			Order o2 = new Order(c2, new ItemDetail[] {
					new ItemDetail(i3, 2),
					new ItemDetail(i5, 1) 
			},LocalDateTime.of(2024, 6, 22, 20, 5, 20));
			
			Order o3 = new Order(c2, new ItemDetail[] {
					new ItemDetail(i4, 1) 
			},LocalDateTime.of(2024, 6, 22, 21, 20, 20));

			
			// Viết phương thức export trong class Order: ko có tham số
			// Viết phương thức export trong class khác: có tham só export(order)
			
//			System.out.println("Order 1 : "+o1.export());
//			System.out.println("Order 2 : "+o2.export());
//			System.out.println("Order 3 : "+o3.export());

			System.out.println("Order 1 : "+ OrderUtils.export(o1));
			System.out.println("Order 2 : "+ OrderUtils.export(o2));
			System.out.println("Order 3 : "+ OrderUtils.export(o3));
			
		}


}	
