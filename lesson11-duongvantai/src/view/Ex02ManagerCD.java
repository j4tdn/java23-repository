package view;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

import bean.CD;
import model.DataModel;

public class Ex02ManagerCD {
	private static List<CD> CD = new ArrayList(DataModel.mockCD());
	public static void main(String[] args) {
		List<CD> result = new ArrayList<>();
		System.out.println("1.Viết phương thức thêm 1 CD vào danh sách, thêm thành công nếu không trùng mã CD.");
		CD CD1 = new  CD(6, "Pop", "Michael Jackson", 10, 15.99);
		if(repeat(CD1) == true) {
			CD.add(CD1);
			generate(CD);
		}else System.out.println(" ==> Trùng mã CD");
		System.out.println("2.Tìm số lượng CD có trong danh sách.");
		generate(trasform(CD, t -> t.getTypeCD()));
		System.out.println("3. Viết phương thức sắp xếp danh sách giảm dần theo giá thành.");
		generate(findCD(CD, (t1,t2) -> t2.getSalesPrice().compareTo(t1.getSalesPrice())));
		System.out.println("4. Viết phương thức sắp xếp danh sách tĕng dần theo mã CD.");
		generate(findCD(CD, (t1,t2) -> t1.getId().compareTo(t2.getId())));
	}
	
	private static boolean repeat(CD cd ) {
		for(CD cds : CD) {
			if(cds.getId() == cd.getId()){
				return false;
			} 
		}  return true;
	}
	private static <R> List<R> trasform(List<CD> cds, Function<CD, R> transformer){
		List<R> result = new ArrayList<>();
		for(var cd : cds) {
			result.add(transformer.apply(cd));
		}
		return result;
	}
	private static List<CD> findCD(List<CD> cds, Comparator<CD> comparator){
		List<CD> result = new ArrayList<>();
		for(var cd : cds) {
			result.add(cd);
		}
		result.sort(comparator);
		
		return result;
	}
	private static <T> void generate(Collection<T> elements) {
		elements.forEach(element -> System.out.println("   " + element));

	}
}
