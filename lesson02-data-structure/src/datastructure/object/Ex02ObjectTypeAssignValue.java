package datastructure.object;

import bean.Item;

public class Ex02ObjectTypeAssignValue {
	
	public static void main(String[] args) {
	
		// Đẻe cập nhật giá trị cho biến KDL nguyên thủy
		// --> Dừng toán tử =
		int a = 5;
		System.out.println("a1 --> " + a);
		a = 7;
		System.out.println("a2 --> " + a);
		
		// Để cập nhập giá trị cho biến KDL đối tượng
		Item i1 = new Item(1, 'A', 11);//H1
		System.out.println("i1 address = " + System.identityHashCode(i1));
		
		// Cách 1: cập nhập giá trị các thuộc tính của ô nhớ hiện tại mà biến đang trỏ đến
		i1.salesPrice = 99;
		System.out.println("i11 -->" + i1);
		System.out.println("i11 address = " + System.identityHashCode(i1));
		
		// Cách 2:Cập nhập địa chỉ mà biến trỏ đến
		i1 = new Item(3, 'C', 33);//H3   
		System.out.println("i12 -->" + i1);
		System.out.println("i12 address = " + System.identityHashCode(i1));
		
		Item i7 = i1;
		
		Item i2 = new Item(2, 'B', 22);//H2
		System.out.println("i12 address --> " + System.identityHashCode(i2));
		
		i1 = i2;
		System.out.println();
	}

}
