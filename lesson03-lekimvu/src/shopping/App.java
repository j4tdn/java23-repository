package shopping;

import java.time.LocalDateTime;

public class App {

	public static void main(String[] args) {
		
		Customer c1 = new Customer("KH1", "Adam", "123", "NewYork");
		Customer c2 = new Customer("KH2", "Kate", "456", "California");
	
	Item i1 = new Item("SS10+", "Android", "Black", 620);
	Item i2 = new Item("SS20U", "Android", "Green", 840);
	Item i3 = new Item("IP4", "IOS", "Black", 280);
	Item i4 = new Item("IP12", "IOS", "White", 880);
	Item i5 = new Item("WP", "Windowphone", "Black", 560);
	
	Order o1 = new Order(c1, new ItemDetail[] {
			new ItemDetail(i1,3),
			new ItemDetail(i4,5),
			 new ItemDetail(i2,1)
			},LocalDateTime.of(2021,  5, 8, 10, 10, 10));

			Order o2 = new Order(c2, new ItemDetail[] {
			  new ItemDetail(i3,2),
			 new ItemDetail(i5,1)
			}, LocalDateTime.of(2021, 5, 7, 20, 10, 12));

			Order o3 = new Order(c2, new ItemDetail[] {
			  new ItemDetail(i4,1)
			}, LocalDateTime.of(2021, 5, 8, 9, 28, 32));

			OrderUtils oul1 = new OrderUtils();
			
			System.out.println("Order 1: " + oul1.export(o1));
			System.out.println("Order 2: " + oul1.export(o2));
			System.out.println("Order 3: " + oul1.export(o3));
			
	
	}
}
   