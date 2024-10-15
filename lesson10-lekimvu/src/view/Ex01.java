package view;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		int[] elements = {1,2,3,4,3,1};
      System.out.println("--> " +max_3(elements));
delCommonNumber(elements);
	}

	
	private static void delCommonNumber(int[] elements) {
		boolean check;
		int[] newNumber = new int[elements.length];
		int count = 0;
		for(int i =0; i< elements.length;i++) {
			check = false;
			for(int j = 0;j < elements.length  ;j++) {
				if(elements[i] == newNumber[j]) {
                      check = true;
                          break;
				}
			}
					//1 2 3 4 3 1 
					// 1 2 3 4 3 1 
                   if(!check) {
                	  newNumber[count++] = elements[i];
					}
			
		}
              System.out.println("Mảng mới sau khi loại bỏ phần tử trùng: ");
              for(int i = 0;i<newNumber.length;i++) {
            	  System.out.print(newNumber[i] + " ");
              }
	}

		
		
	
	private static int max_3(int[] elements) {
		int max_1 = 0;
		int max_2 =  0;
		int max_3 = 0;
	      for(int i =0; i < elements.length; i++) {
	    	  if(elements[i] > max_1) {
	    		  max_1 = elements[i];
	    	  }
	      }
	    	  for( int i = 0; i < elements.length; i++) {
	    		  if(elements[i] == max_1) {
	    			  continue;
	    		  } else
	    			  if(elements[i] > max_2) {
	    				  max_2 = elements[i];
	    			  }
	    	  }
	    	  
	    	  for(int i = 0; i< elements.length;i++) {
	    		  if(elements[i] == max_1  ) {
	    			  continue;
	    		  } else
	    		  if( elements[i] == max_2) {
	    			  continue;
	    		  }
	    		  else
	    			  if(elements[i] > max_3) {
	    				  max_3 = elements[i];
	    			  }
	    	  }
		return max_3;
	}
}
