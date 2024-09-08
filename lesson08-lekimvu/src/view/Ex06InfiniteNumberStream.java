package view;

import java.util.Arrays;
import java.util.Scanner;

public class Ex06InfiniteNumberStream {

	public static void main(String[] args) {
         int running = 1;
         int findingPos = 18;
         StringBuilder stream = new StringBuilder();
         
         while(true) {
        	 stream.append(running);
        if(stream.length() >= 79) {
        	break;
        }
         }
    	   System.out.println("sb --->" + stream.charAt(findingPos -1));
	}
}	
