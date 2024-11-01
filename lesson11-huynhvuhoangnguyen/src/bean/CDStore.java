package bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CDStore {

	private List<CD> cdList;
	
	public CDStore() {
		cdList = new ArrayList<>();
	}
	
	public boolean addCd(CD cds) {
		for(CD cd : cdList) {
			if(cd.getId() == cds.getId()) {
				System.out.println("CD's Id already existed.");
				return false;
			}
		}
		cdList.add(cds);
		System.out.println("CD added successfully");
		return true;
	}
	
	public int getCDCount() {
		return cdList.size();
	}
	
	public double calculateTotalPrice() {
		double total = 0;
		for(CD cd : cdList) {
			total += cd.getPrice();
		}
		return total;
	}
	
	public void sortByPriceDesc() {
		Collections.sort(cdList, (cd1, cd2) -> Double.compare(cd2.getPrice(), cd1.getPrice()));
	}
	
	public void sortByIDAsc() {
		Collections.sort(cdList, (cd1, cd2) -> Integer.compare(cd1.getId(), cd2.getId()));
	}
	
	public void displayCDs() {
		if(cdList.isEmpty()) {
			System.out.println("CD list is empty.");
		} else {
			for(CD cd : cdList) {
				System.out.println(cd);
			}
		}
	}
	
}