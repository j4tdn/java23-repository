package datastructure.object;

import bean.Item;

public class Ex01ObjectTypeDemo {
	
   
    public static void main(string[] arge) {
	   // primitive type
	   char v1 = '@';
	   int v2 = 22;
	   System.out.println("v1 --> " + v1);
	   System.out.println("v2 --> " + v2);
	   
	   //với 1 biến là KDL đối tượng 
	   // khi mình in biến ra tự động gọi hàm toString() trong class oject
	   
	   //trong java có class 'object'--> class cha của tất cả class
	   //dùng để chứa các hàm có sẵn của java ví dụ toString
	   
	   // new Item() -> tạo ra 1 đối tượng trong class Item (OOP)
	   //new Item() -> taọ ra 1 ô nhớ để lưu trữ giá trị cho 1 Item
	   // đối tượng( ô nhớ tại HEAP) --> luôn có đầy đủ thông tin của các thuộc tính bên trong class Item 
	    
	   // object type
	   Item i1 = new Item();
	   System.out.println("i1 --> " + i1);
       System.out.println("i1 toSting --> " + i1.toString());
       System.out.println("i1 id = " + i1.id);
       System.out.println("i1 name = " + i1.name); 
       System.out.println("i1 salePrice = " + i1.salePrice);
       }
}
