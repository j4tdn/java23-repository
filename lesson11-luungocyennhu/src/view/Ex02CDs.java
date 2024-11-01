package view;

import java.util.ArrayList;
import java.util.List;

import bean.CDs;

public class Ex02CDs {
	
	public static void main(String[] args) {
		List<CDs> cds = new ArrayList<>();
		
		cds.add(new CDs(1, "VPop", "AMEE", 8, 300000d));
		cds.add(new CDs(2, "Pop", "Arrimer", 6, 450000d));
		cds.add(new CDs(3, "Rap", "WEAN", 10, 240000d));
		cds.add(new CDs(4, "KPop", "TWICE", 12, 550000d));
		cds.add(new CDs(5, "VPop", "LyLy", 5, 210000d));
		
		CDs newCDs = new CDs(6, "VPop", "LyLy", 5, 210000d);
		CDs newCDs1 = new CDs(6, "VPop", "LyLy", 5, 210000d);
		
		System.out.println("- Thêm 1 CD (6, \"VPop\", \"LyLy\", 5, 210000d)  --> ");
		addCDs(cds, newCDs);
		printf("Danh sách CDs sau khi thêm", cds);

		System.out.println("- Thêm 1 CD (6, \"VPop\", \"LyLy\", 5, 210000d)  --> ");
		addCDs(cds, newCDs1);
		
		System.out.println("- Số lượng CD --> " + cds.size());
		
		System.out.println("\n- Tổng giá thành của các CD --> " + sumPrice(cds));
		
		cds.sort((c1, c2) -> c2.getPrice().compareTo(c1.getPrice()));
		printf("\n- Sắp xếp danh sách giảm dần theo giá thành", cds);
		
		cds.sort((c1, c2) -> c1.getId().compareTo(c2.getId()));
		printf("- Sắp xếp danh sách tăng dần theo mã CD", cds);
	}
	
	private static void addCDs(List<CDs> cds, CDs c) {
		for (CDs cd: cds) {
			if (cd.getId() == c.getId()) {
				System.out.println("Thêm không thành công !\n");
				return;
			}
		}
		
		cds.add(c);
		System.out.println("Thêm thành công !\n");
	}

	private static double sumPrice(List<CDs> cds) {
		double sum = 0;
		for(CDs cd: cds) {
			sum += cd.getPrice();
		}
		return sum;
	}
	
	private static void printf(String prefix, List<CDs> cds) {
		System.out.println(prefix + " --> {");
		for(CDs cd: cds) {
			System.out.println(cd);
		}
		System.out.println("}\n");
	}
}
