package view;

import java.util.Scanner;

import bean.CD;
import model.CDStore;

public class Ex02CDStoreApp {

	public static void main(String[] args) {
        CDStore store = new CDStore();
        Scanner scanner = new Scanner(System.in);

        store.themCD(new CD(1, "Pop", "Ca Sy A", 10, 50000));
        store.themCD(new CD(2, "Rock", "Ca Sy B", 12, 70000));
        store.themCD(new CD(3, "Jazz", "Ca Sy C", 8, 60000));

        System.out.println("Số lượng CD trong danh sách: " + store.soLuongCD());

        System.out.println("Tổng giá thành của các CD: " + store.tongGiaThanh());

        store.sapXepTheoGiaThanhGiamDan();
        System.out.println("Danh sách CD sau khi sắp xếp giảm dần theo giá thành:");
        for (CD cd : store.getDanhSachCD()) {
            System.out.println(cd);
        }

        store.sapXepTheoMaCDTangDan();
        System.out.println("Danh sách CD sau khi sắp xếp tăng dần theo mã CD:");
        for (CD cd : store.getDanhSachCD()) {
            System.out.println(cd);
        }

        scanner.close();
    }
}
