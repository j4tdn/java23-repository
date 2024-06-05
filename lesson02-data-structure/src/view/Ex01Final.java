package view;

import bean.Item;

public class Ex01Final {
	public static void main(String[] args) {
        int a = 5;
        int b = 7;
        b =10;
        a=2;
        
        Item item2 = new Item(2,'B',20);
        Item item1 = new Item(1,'A',20);
        item1 = item2;
        item1.salesPrice = 22;
        /*
          khi dùng final không thể gán lại giá trị cho nó ở stack
          không thể dùng toán tử
          
         */
        
	}
}
