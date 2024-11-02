package view;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import bean.CD;
import model.DataModel;
import utils.CollectionUtils;

public class Ex02 {
	public static void main(String[] args) {
		List<CD> cDs = new ArrayList<>(DataModel.mockData());

		CollectionUtils.generate("List CDs: ", cDs);
		// 1.Viết phương thức thêm 1 CD vào danh sách, thêm thành công nếu không trùng
		// mã CD.
		// Demo fail
		CD newCDFail = new CD(04, "Duplicate CD", "Jack", 5, BigDecimal.valueOf(33d));
		addCD(newCDFail, cDs);
		CollectionUtils.generate("List CDs: ", cDs);

		// Demo true:
		CD newCDTrue = new CD(05, "Duplicate CD", "Jack", 5, BigDecimal.valueOf(33d));
		addCD(newCDTrue, cDs);
		CollectionUtils.generate("List CDs: ", cDs);

		// 2.Tìm số lượng CD có trong danh sách.
		System.out.println("Number of CDs in list: " + cDs.size());

		// 3. Tình tổng giá thành của các CD.
		BigDecimal sum = new BigDecimal(0);
//		cDs.forEach(cd -> {
//			 sum.add(cd.getPrice());
//		});
		for (CD cd : cDs) {
			sum = sum.add(cd.getPrice());
		}
		System.out.println("Sum of prices: " + sum);

		// 4.Viết phương thức sắp xếp danh sách giảm dần theo giá thành.
		cDs.sort((a, b) -> b.getPrice().compareTo(a.getPrice()));
		CollectionUtils.generate("sort by price (desc): ", cDs);

		// 5.Viết phương thức sắp xếp danh sách tĕng dần theo mã CD.
		cDs.sort((a, b) -> a.getId().compareTo(b.getId()));
		CollectionUtils.generate("sort by cd (asc): ", cDs);
	}

	private static boolean check(List<CD> datas, Predicate<CD> predicate) {
		for (CD cd : datas) {
			if (predicate.test(cd))
				return true;
		}

		return false;
	}

	private static void addCD(CD newCd, List<CD> cds) {
		if (check(cds, cd -> cd.getId().equals(newCd.getId()))) {
			System.out.println("\nADD CD ---- Duplicate ID --> " + newCd.getId() + "\n");
			return;
		}

		cds.add(newCd);
	}
}
