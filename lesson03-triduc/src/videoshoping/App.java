package videoshoping;

import java.time.LocalDateTime;

public class App {
	public static void main(String[] args) {
		Customer c1 = new Customer("KH1","Adam","123","NewYork");
		Customer c2 = new Customer("KH2","Eva","234","HCM");
		
		Item i1 = new Item ("SS10+", "Android","Black",620d);
		Item i2 = new Item ("SS11+", "Android","Green",420d);
		Item i3 = new Item ("SS12+", "Android","Blue",320d);
		Item i4 = new Item ("SS13+", "Android","Black",120d);
		
		Order o1 = new Order(c1, new ItemDetail[] {
				new ItemDetail(i1,3),
				new ItemDetail(i2,4)},
				LocalDateTime.of(2024, 3, 23, 4, 5));
		
		Order o2 = new Order(c2, new ItemDetail[] {
				new ItemDetail(i3,2),
				new ItemDetail(i4,4)},
				LocalDateTime.of(2024, 5, 20, 3, 5));
		
		Order o3 = new Order(c1, new ItemDetail[] {
				new ItemDetail(i2,5)},
				LocalDateTime.of(2024, 3, 25, 4, 5));
		
		System.out.println("Order 1 --> " + o1.export());
		System.out.println("Order 2 --> " + o2.export());
		System.out.println("Order 3 --> " + o3.export());
		
		}
	
		//write method export in Order class: no para
		//write in another class: para.
	}
