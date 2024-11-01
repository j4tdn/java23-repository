package view;

import bean.CDStore;
import model.CDData;

public class Ex02CDStoreManagement {

	public static void main(String[] args) {
		
		CDData data = new CDData();
		CDStore cdStore = data.getData();
		
		System.out.println("Number of CD in store: " + cdStore.getCDCount());
		
		System.out.println("Total price of all CDs: " + cdStore.calculateTotalPrice());
		
		System.out.println("CD list: ");
		cdStore.displayCDs();
		
		cdStore.sortByPriceDesc();
		System.out.println("\nCD list after sorting by price descending: ");
		cdStore.displayCDs();
		
		cdStore.sortByIDAsc();
		System.out.println("\nCD list after sorting by ID Ascending: ");
		cdStore.displayCDs();
		
	}
	
}