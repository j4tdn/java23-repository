package controlling;

import java.util.Random;

public class Ex03SwitchCase {
  
	public static void main(String[] args) {
		Random rd = new Random();
		int wdAsNumber = rd.nextInt(1,5);
		
		switch(wdAsNumber) {
		case 1:
			System.out.println("no.1");
			break;
			
		case 2:
			System.out.println("Week Day");
			break;
			
		case 3:
			System.out.println("Week Day");
			break;
			
		case 4:
			System.out.println("Week Day");
			break;
			
		case 5:
			System.out.println("Week Day");
			break;
			
		case 6:
			System.out.println("Week Day");
			break;
			
		case 7:
			System.out.println("Weekend Day");
			break;
			
		case 8:
			System.out.println("Weekend Day");
			break;
			
		}
		System.out.println("\n============\n");
	String  wdAsString = "";
	switch(wdAsNumber) {
	case 2,3,4,5,6:
		wdAsString = "Week Day";
	    break;
	case 7,8:
		wdAsString = "Weekend Day";
	    break;
	}
	System.out.println(" wdAsString1 --> " +  wdAsString);
	
	System.out.println("\n============\n");
	
	wdAsString = switch(wdAsNumber) {
	case 2,3,4,5,6 ->  "Week Day";
	default -> "Invalid Day";
	};
	System.out.println("wdAsString --> " + wdAsString);
	
	}
		
	}
	
 
