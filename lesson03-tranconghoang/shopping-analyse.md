A. Classes
Customer: id, name, phone, address
Item:     id, os, color, cost
=> ItemDetail: item, quantity
=> Order: customer, item_details[], date_time

B1: Create list of customers
B2: Create array of items in store
B3: Shopping function
+ Who is buying ?
+ List of items
+ Amount of each item
+ DateTime
=============================

B. Objects 
c1: KH1, Adam, 123, NewYork
c2: KH2, Kate, 243, California

i1: SS10+, Android, Black, 620
i2: SS20U, Android, Green, 840
i3: IP4+, IOS, White, 280
i4: IP12, IOS, Black, 880
i5: WP8, WindowPhone, Blue, 560

o1: c1, {id1(i1, 3), id2(i3, 1), id3(i2, 1)}, 10:20:31 21.06.24
o2: c2, {id1(i3, 2), id2(i2, 1)}, 21:49:17 15.06.24
o3: c2, {id1(i2, 5)}, 13:02:55 23.06.24

C. Function
export(order) => TotalOfAmount: Void