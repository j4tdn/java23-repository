+ Class
	Customer: name, phone, id, address
	Item	: id, os(hệ điều hành), color, cost
	ItemDetail: item, quantity
	Order: customer, items_details[], quantity, datetime
	
-> B1: Tạo list khách hàng
-> B2: Tạo mảng chứa các item trong cửa hàng
-> B3: Thực hiện chức năng mua hàng	(đối tượng)
	+ Ai đang mua				   |
	+ Ds của mặt hàng đã mua	   |
	+ Số lượng của mỗi item đã mua | ->thuộc tính
	+ Thời gian mua				   |

==> Order: Customer, items_details[], quantity(số lượng), datetime
==> Items:	Item[] items
==> ItemDetail: item, quantity
====================================================
+ Object

- Customer
	c1: KH1, Adam, 123, DaNang
	c2: KH2, Kate, 234, California
	
- Item
	i1: SS10+, Android, Black, 620
	i2: SS20U, Android,, Green 840
	i3: IP4, IOS, White, 280
	i4: IP12, IOS, Black, 820
	i5: WP8, WindowPhone, Blue, 560

Order: c1 {id1(i1,3), id2(i2,2), id3(i3,1)}; date_time: 10:10:10 21.06.2024
Order: c2 {id1(i3,3), id2(i5,2)}; date_time:20:10:10 22.06.2024

Funciton: Export(oder)	==> TotalOfAmount:Void
	