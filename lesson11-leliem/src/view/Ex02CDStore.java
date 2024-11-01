package view;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static utils.CollectionUtils.*;


import bean.CD;
import model.DataModel;

public class Ex02CDStore {
	private static List<CD> listCD = DataModel.mockCDs();

	public static void main(String[] args) {
		CD cd6 = new CD(1, "Nhac thieu nhi", "Xuan Mai",10, bd("100.00"));
		
		addCD(cd6);
   
		int quantity = listCD.size();
		System.out.println("2. quantity of CD in list = " + quantity + "\n");
		
		System.out.println("3. Total cost of CDs : " + sum(listCD) + "\n");

		Collections.sort(listCD, Comparator.comparing(CD::getPrice).reversed());
		generate("4. Descending of price", listCD);
	}
	private static void addCD(CD cds) {
		for (CD cd : listCD) {
			if (cd.getId() == cds.getId()) {
				System.out.println("Mã CD đã tồn tại. Không thể thêm vào!");
				return;
			}
		}
		listCD.add(cds);
	}
	
	public static BigDecimal bd(String value) {
		return new BigDecimal(value);
	}
	
	public static BigDecimal sum(List<CD> cds){
		BigDecimal sum = BigDecimal.ZERO ;
		for(CD cd:cds) {
			sum = sum.add(cd.getPrice());
		}
		
		return sum;
	}
}
