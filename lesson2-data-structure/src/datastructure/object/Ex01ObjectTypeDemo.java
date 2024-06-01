package datastructure.object;

import bean.Item;

public class Ex01ObjectTypeDemo {
	
	
      public static void main(String[] args) {
    	  
    	  char v1 = '@';
    	  int v2 = 22;
    	  
		System.out.println("v1 --> " + v1);
		System.out.println("v2 --> " + v2);
		
		Item i1 = new Item();
		i1.id = 1;
		i1.name = 'N';
		
		
		System.out.println("i1 --> " + i1);
		
		System.out.println("i1 toString --> " + i1.toString());
		System.out.println("i1 id ---> " + i1.id);
		System.out.println("i1 name  --> " + i1.name);
		
	}
}
