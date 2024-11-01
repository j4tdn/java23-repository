package view;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import bean.CD;

public class Ex02CDApp {

	private static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		
		var CDs = new ArrayList<>(mockData());
	
		generate("Danh sách CD", CDs);
		
		var newCD = addCDItem();
		
		CDs.add(newCD);
		
		for (CD cd : CDs) 
			if(cd.getId() == null) {
				System.out.println("--> Trùng mã CD, không thể thêm !");
				CDs.remove(cd);
				break;
			}
		
		generate("\n1. Danh sách CD sau khi thêm mới", CDs);
		
		System.out.println("2. Số lượng CD có trong danh sách là: " + CDs.size());
		
		System.out.println("\n3. Tổng giá thành của các CD là: " + findSumOfSalesPrice(CDs));
		
		generate("\n4. Danh sách CD giảm dần theo giá thành", sortBySalesPriceDesc(CDs));
		
		generate("5. Danh sách CD tăng dần theo mã CD", sortByIdAsc(CDs));
		
	}
	
	private static CD addCDItem(){
		
		var copy = new ArrayList<>(mockData());
		
		System.out.println("--Nhập thông tin CD cần thêm--");
		System.out.print("Nhập mã CD: ");
		Integer id = Integer.parseInt(ip.nextLine());
		System.out.print("Nhập loại CD: ");
		String model = ip.nextLine();
		System.out.print("Nhập ca sỹ: ");
		String singer = ip.nextLine();
		System.out.print("Nhập số bài hát: ");
		Integer num = Integer.parseInt(ip.nextLine());
		System.out.print("Nhập giá thành: ");
		Double salesPrice = Double.parseDouble(ip.nextLine());
		
		CD newCD = new CD(id, model, singer, num, salesPrice);
		if(!copy.contains(newCD))
			return newCD;
		else 
			return new CD();
	}
	
	private static double findSumOfSalesPrice(List<CD> CDs) {
		double sum = 0;
		for (CD cd : CDs) 
			sum = sum + cd.getSalesPrice();
		return sum;
	}
	
	private static List<CD> sortBySalesPriceDesc(List<CD> CDs){
		CDs.sort((cd1, cd2) -> {
			return cd2.getSalesPrice().compareTo(cd1.getSalesPrice());
		});
		return CDs;
	}
	
	private static List<CD> sortByIdAsc(List<CD> CDs){
		CDs.sort((cd1, cd2) -> {
			return cd1.getId().compareTo(cd2.getId());
		});
		return CDs;
	}
	
	private static List<CD> mockData(){
		return List.of(
				new CD(12, "Universal Music", "Taylor Swift", 15, 1534d),
				new CD(54, "Sony Music", "Ed Sheeran", 12, 6464d),
				new CD(32, "Warner Music", "Dua Lipa", 10, 2424d),
				new CD(55, "EMI", "Maroon 5", 14, 9783d),
				new CD(36, "Atlantic Records", "Bruno Mars", 11, 3533d),
				new CD(86, "Columbia Records", "Adele", 13, 4632d),
				new CD(35, "RCA Records", "The Weeknd", 9, 8963d),
				new CD(8, "Island Records", "Rihanna", 16, 2353d),
				new CD(91, "Def Jam", "Justin Bieber", 12, 1990d),
				new CD(101, "Republic Records", "Lady Gaga", 15, 6432d)
				);
	}
	
	private static <T> void generate(String prefix, Collection<T> elements) {
		System.out.println(prefix + " --> {");
		elements.forEach(element -> System.out.println("  + " + element));
		System.out.println("}\n");
	}
}
