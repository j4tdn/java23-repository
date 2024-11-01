package view;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import bean.CD;
import model.DataModel;

public class Ex02CDStore {

	public static void main(String[] args) {

		List<CD> cdList = new ArrayList<>(DataModel.mockCDs());

		// Viết phương thức thêm 1 CD vào danh sách, thêm thành công nếu không trùng mã CD.
		CD newCD = new CD(9, "Classical", "A.Quyen", 12, 18.75);
		boolean isAdded = true;
		for (CD existingCD : cdList) {
			if (existingCD.getId() == newCD.getId()) {
				isAdded = false;
				System.out.println("Adding new CD false");
				break;
			}
		}
		if (isAdded) {
			cdList.add(newCD);
			System.out.println("Adding new CD successfully" );
		}

		// Tìm số lượng CD có trong danh sách.
		int cdCount = cdList.size();
		System.out.println("Total CDs in store: " + cdCount);

		// Tính tổng giá thành của các CD.
		double totalPrice = 0;
		for (CD cd : cdList) {
			totalPrice += cd.getPrice();
		}
		System.out.println("Total price of CDs: " + totalPrice + " USD");

		// Viết phương thức sắp xếp danh sách giảm dần theo giá thành.
		System.out.println("\n1. CDs sorted by price (Desc):");
		cdList.sort(Comparator.comparingDouble(CD::getPrice).reversed());
		for (CD cd : cdList) {
			System.out.println(cd);
		}

		// Viết phương thức sắp xếp danh sách tăng dần theo mã CD.
		System.out.println("\n2. CDs sorted by ID (Asc):");
		cdList.sort(Comparator.comparingInt(CD::getId));
		for (CD cd : cdList) {
			System.out.println(cd);
		}

	}

}
