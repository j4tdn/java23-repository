Class
	Customer: name, phone, id, address
	Item	: id, os, color, cost
	
B1: Create lists of customers
B2:	Create array of items in store
B3: Shopping function

+ Who is buying 
+ List of items
+ Amount of each item
+ Time
=> Order: customer, item_details[], quantity, datetime
=> ItemDetail: item, quantity

===============================================
c1: KH1, Adam, 123, NewYork
c2: KH2, Kate, 243, California

i1: SS10+, Android, Black, 620
i2: SS20U, Android, Green, 850
i3: IP4, IOS, White, 230
i4: IP12, IOS, Black, 880
i5: WP8, WindowPhone, Blue, 580

Order: 
o1: c1, {id1(i1, 3), id2(i2, 2), id3(i3, 1)}, date_time
o2: c2, {id1(i3, 2), id2(i5, 1)}, date_time
o3: c2, {id1(i4, 1)}, date_time

Function: export(order) => TotalAmount: void

