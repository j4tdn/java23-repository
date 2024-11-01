package view;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import bean.CD;
import model.CDDataModel;

public class Ex02CDManagement {
	
	public static void main(String[] args) {
		List<CD> cds = new ArrayList<>();
		cds = CDDataModel.generateCDData();
		
		CD newCD1 = new CD(1, "Pop", "Ca Sy A", 10, 100000.0);
		addCD(cds, newCD1);
		showCD(cds);
		
		System.out.println("=====================================");
		CD newCD2 = new CD(11, "Pop", "Ca Sy B", 10, 10234.0);
		addCD(cds, newCD2);
		showCD(cds);

		System.out.println("=====================================");
		System.out.println("Số lượng đĩa CD : " + numberOfCDs(cds));
		
		System.out.println("=====================================");
		System.out.println("Tổng giá CD : " + sumOfCDsPrice(cds));

		System.out.println("=====================================");
		System.out.println("Sắp xếp theo giá giảm dần : \n" );
		sort(cds, (t1, t2) -> t2.getPrice().compareTo(t1.getPrice()));
		showCD(cds);
		
		System.out.println("=====================================");
		System.out.println("Sắp xếp theo id tăng dần : \n" );
		sort(cds, (t1, t2) -> t1.getId().compareTo(t2.getId()));
		showCD(cds);
		
		
	}
	
	public static boolean addCD(List<CD> cds, CD newCD) {
		for (CD existingCD : cds) {
			if (existingCD.getId() == newCD.getId()) {
				System.out.println("CD "+ newCD.getId() + " tồn tại");
				return false;
			}
		}
		cds.add(newCD);
		return true;
		
	}
	
	public static int numberOfCDs(List<CD> cds) {
		return cds.size();
	}

	public static Double sumOfCDsPrice(List<CD> cds) {
		double sumPrice = 0.0;
		for (CD cd : cds) {
			if (cd.getPrice() == null) continue;
			sumPrice += cd.getPrice();
		}
		return sumPrice;
	}
	
	public static List<CD> sort(List<CD> cds, Comparator<CD> comparator) {
		cds.sort(comparator);
		return cds;
	}
	
	
	public static void showCD(List<CD> cds) {
        for (CD cd : cds) {
            System.out.println(cd);
        }
    }
}
