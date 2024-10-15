package datastructure.object;

import bean.Item;

public class Ex02ObjectTypeAssignValue {
public static void main(String[] args) {
	int a =5;
	System.out.println("a1-->"+a);
	a=7;
	System.out.println("a2-->"+a);
	
	Item i1 = new Item(1,'A', 11);
	System.out.println("i1 address= "+System.identityHashCode(i1));
	//cập  nhật giá trị các thuộc tính 
	i1.salesPrice=99;
	System.out.println("i11-->"+i1);
	System.out.println("i1 address= "+System.identityHashCode(i1));
	// cập nhật địac hỉ controwr đến
	i1 =new Item(3,'C',33);
	System.out.println("i11-->"+i1);
	System.out.println("i1 address= "+System.identityHashCode(i1));
	
	Item i7 = i1;
	
	Item i2 =  new Item(2,'B',22);
	i2 = i1;
	System.out.println("i13-->"+i1);
	System.out.println("i13 address= "+System.identityHashCode(i1));
}
	
}
