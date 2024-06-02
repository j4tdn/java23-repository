package datastructure.object;

import bean.Item;

public class Ex02ObjectTypeAssignValue {
	public static void main(String[] args) {
		
		//để cập nhật giá trị cho biến kdl nguyên thủy
		//--> dùng toán tử = 100% hoạt động ở stack
		int a=5;
		a=2;	
		System.out.println("a1 -->"+a);
		a=7;
		System.out.println("a2 -->"+a);
		
		//để cập nhật giá trị cho viến kdl đối tượng
		Item i1 = new Item(1,'A',11);//h1
		System.out.println("i1 address ="+System.identityHashCode(i1));
		
		//cách 1 cập nhật giá trị của các thuộc tính của ô nhớ(HEAP) hiện tại mà biến đang trỏ đến
		i1.salePrice = 99;
		System.out.println("i11 -->"+i1);
		System.out.println("i11 address ="+System.identityHashCode(i1));
		//cách 2 cập nhật địa chỉ mà biến trỏ đến
		i1 = new Item(3,'C',33);//h3
		System.out.println("i12-->"+i1);
		System.out.println("i12 address ="+System.identityHashCode(i1));
		
		Item i7=i1;// 100% hoạt động ở stack
		
		Item i2 = new Item(2, 'B',22);
		System.out.println("i2 address-->"+System.identityHashCode(i2));
		
		i1 = i2;
		System.out.println("i13 address-->"+System.identityHashCode(i2));
		
		System.out.println("i7-->"+i7);
		
		//stack: biến nguyên thủy -> giá trị
		//     : biến đối tưởng -> địa chỉ ở vùng nhớ HEAP
	}
}
