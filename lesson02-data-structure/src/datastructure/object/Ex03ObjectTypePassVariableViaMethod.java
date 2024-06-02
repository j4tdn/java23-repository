package datastructure.object;

import bean.Item;

public class Ex03ObjectTypePassVariableViaMethod {

	public static void main(String[] args) {
            Item i1 = new Item(55,'Z',555); //H1
            
            System.out.println("i1 before --> " +i1);
            modify(i1);
            
            System.out.println("i1 after -->" +i1);
            
            // i1 id = 55
            // name = z
            // salesPrice = 999
//            System.out.println("item   " +item);
	}
	
	public static void modify(Item item) { //i1
		item.SalesPrice = 999;
		
		// new 1 một ô nhớ mới nên i1 ở trên k bị ảnh hưởng
		item = new Item(1, 'A', 11); //H2
		item.SalesPrice = 777;
		
	}
}


// modify i1 là tạo một ô nhớ stack, 
// Item item trỏ đến H1 nên Item item = i1; item.salesPrice sẽ thay đổi 555 thành 999



