package view;

import java.time.LocalDateTime;

import bean_ex01.Customer;
import bean_ex01.Item;
import bean_ex01.ItemDetail;
import bean_ex01.Order;
import bean_ex01.OrderUtils;

public class Ex01Shopping {
	/*
	 		c1: KH1, Adam, 123, NewYork 
			c2: KH2, Kate, 234, California

			i1: SS10+, Android, Black, 620
			i2: SS20U, Android, Green, 840
			i3: IP4, IOS, White, 280
			i4: IP12, IOS, Black, 880
			i5: WP8, WindowPhone, Blue, 560
			
			=> o1: c1, {id1(i1, 3), id2(i4, 1), i3(i2, 1)}, 10:10:10 08.05.2021
			=> o2: c2, {id1(i3, 2), id2(i5, 1)}, 20:10:12 07.05.2021
			=> o3: c2, {id1(i4, 1)}, 09:28:32 08.05.2021
	 */
	
	public static void main(String[] args) {

		Customer c1 = new Customer("KH1", "Adam", "123", "NewYork");
		Customer c2 = new Customer("KH2", "Kate", "234", "California");

		Item i1 = new Item("SS10+", "Android", "Black", 620);
		Item i2 = new Item("SS20U", "Android", "Black", 840);
		Item i3 = new Item("IP4", "IOS", "White", 280);
		Item i4 = new Item("IP12", "IOS", "Black", 880);
		Item i5 = new Item("WP8", "WindowPhone", "Blue", 560);

		// ItemDetail id1 = new ItemDetail(i1,3);
//		ItemDetail[] ids = new ItemDetail[]{
//				new ItemDetail(i1,3),
//				new ItemDetail(i4,1),
//				new ItemDetail(i2,1)
//		}

		Order o1 = new Order(c1, /* ids, */ 
				new ItemDetail[] { new ItemDetail(i1, 3), new ItemDetail(i4, 1), new ItemDetail(i2, 1) },
				LocalDateTime.of(2021, 5, 8, 10, 10, 10));

		Order o2 = new Order(c2, new ItemDetail[] { new ItemDetail(i3, 2), new ItemDetail(i5, 1) },
				LocalDateTime.of(2021, 5, 7, 20, 10, 12));

		Order o3 = new Order(c2, new ItemDetail[] { new ItemDetail(i4, 1) }, LocalDateTime.of(2021, 5, 8, 9, 28, 32));

//		OrderUtils ou1 = new OrderUtils();
//		OrderUtils ou2 = new OrderUtils();
//		OrderUtils ou3 = new OrderUtils();
		
		System.out.println("Order 1: " + OrderUtils.export(o1));
		System.out.println("Order 2: " + OrderUtils.export(o2));
		System.out.println("Order 3: " + OrderUtils.export(o3));
		
//		System.out.println("Order 1: " + o1.export());
//		System.out.println("Order 2: " + o2.export());
//		System.out.println("Order 3: " + o3.export());
		
		// Write method export in Order class: no-parameter
		// Write method export in Another class: export(order)
	}
}
	
