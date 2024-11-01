package view;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import bean.CD;
import model.CDManager;

public class Ex02 {

	public static void main(String[] args) {
		CDManager cdManager = new CDManager();
		Scanner scanner = new Scanner(System.in);

		// Sử dụng Map để lưu trữ các chức năng và điều hướng
		Map<Integer, Runnable> actions = new HashMap<>();
		actions.put(1, () -> addCD(cdManager, scanner));
		actions.put(2, () -> displayCDCount(cdManager));
		actions.put(3, () -> displayTotalPrice(cdManager));
		actions.put(4, () -> sortCDsByPrice(cdManager));
		actions.put(5, () -> sortCDsByID(cdManager));

		while (true) {
			System.out.println("\n Mânger");
			System.out.println("1. Thêm CD ");
			System.out.println("2.  Số lượng CD");
			System.out.println("3.  giá thành các CD");
			System.out.println("4.  CD theo giá giảm dần");
			System.out.println("5.  CD theo mã tăng dần");
//            System.out.println("6.  Danh sách CD");

			System.out.print("Chọn chức năng (1-7): ");

			int choice = scanner.nextInt();
			scanner.nextLine();

			Runnable action = actions.get(choice);
			if (action != null) {
				action.run();
				if (choice == 7)
					break;
			} else {
				System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
			}
		}
	}

	public static void addCD(CDManager cdManager, Scanner scanner) {
		System.out.print("Nhập mã CD: ");
		int id = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Nhập loại CD: ");
		String type = scanner.nextLine();

		System.out.print("Nhập tên ca sĩ: ");
		String artist = scanner.nextLine();

		System.out.print("Nhập số bài hát: ");
		int songCount = scanner.nextInt();

		System.out.print("Nhập giá thành: ");
		double price = scanner.nextDouble();

		CD newCD = new CD(id, type, artist, songCount, price);
		if (cdManager.addCD(newCD)) {
			System.out.println("Thêm CD mới thành công.");
		} else {
			System.out.println("Mã CD đã tồn tại. Thêm CD thất bại.");
		}
	}

	public static void displayCDCount(CDManager cdManager) {
		System.out.println("Tổng số lượng CD: " + cdManager.getCDCount());
	}

	public static void displayTotalPrice(CDManager cdManager) {
		System.out.println("Tổng giá trị của các CD: " + cdManager.getTotalPrice() + " USD");
	}

	public static void sortCDsByPrice(CDManager cdManager) {
		cdManager.sortByPriceDesc();
		System.out.println("Danh sách CD đã được sắp xếp theo giá giảm dần.");
	}

	public static void sortCDsByID(CDManager cdManager) {
		cdManager.sortByIDAsc();
		System.out.println("Danh sách CD đã được sắp xếp theo mã tăng dần.");
	}

}
