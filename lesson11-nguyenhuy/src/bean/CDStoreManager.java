package bean;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class CDStoreManager {
	private Map<Integer, CD> dsCD;
	public CDStoreManager() {
	this.dsCD = new HashMap<>();
	}
	
// Phương thức thêm CD vào danh sách
public boolean themCD(CD cd) {
    if (dsCD.containsKey(cd.getId())) {
        System.out.println("Mã CD đã tồn tại, không thể thêm vào danh sách.");
        return false;
    }
    dsCD.put(cd.getId(), cd);
    System.out.println("Thêm CD thành công.");
    return true;
}

// Phương thức lấy số lượng CD
public int soLuongCD() {
    return dsCD.size();
}

// Phương thức tính tổng giá thành các CD
public double tongGiaThanh() {
    double tongGia = 0;
    for (CD cd : dsCD.values()) {
        tongGia += cd.getPrice();
    }
    return tongGia;
}

// Phương thức sắp xếp danh sách giảm dần theo giá thành
public void sapXepGiamTheoGia() {
    ArrayList<CD> dsCDList = new ArrayList<>(dsCD.values());
    dsCDList.sort(new Comparator<CD>() {
        @Override
        public int compare(CD cd1, CD cd2) {
            return Double.compare(cd2.getPrice(), cd1.getPrice());
        }
    });
    System.out.println("Danh sách CD đã được sắp xếp giảm dần theo giá thành:");
    for (CD cd : dsCDList) {
        System.out.println(cd);
    }
}

// Phương thức sắp xếp danh sách tăng dần theo mã CD
public void sapXepTangTheoMa() {
    ArrayList<CD> dsCDList = new ArrayList<>(dsCD.values());
    dsCDList.sort(new Comparator<CD>() {
        @Override
        public int compare(CD cd1, CD cd2) {
            return Integer.compare(cd1.getId(), cd2.getId());
        }
    });
    System.out.println("Danh sách CD đã được sắp xếp tăng dần theo mã CD:");
    for (CD cd : dsCDList) {
        System.out.println(cd);
    }
}

// Phương thức hiển thị danh sách CD
public void hienThiDSCD() {
    for (CD cd : dsCD.values()) {
        System.out.println(cd);
    }
}}
