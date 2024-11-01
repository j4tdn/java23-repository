package model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import bean.CD;

public class DataModel {

	private DataModel() {
	}
	
	 public static List<CD> mockCDs() {
	        List<CD> cds = new ArrayList<>();
	        cds.add(new CD(1, "Nhạc Trẻ", "Sơn Tùng", 10, bd("100.00")));
	        cds.add(new CD(2, "Nhạc Rap", "Đen vâu", 8, bd("200.00")));
	        cds.add(new CD(3, "Nhạc Vàng", "Thắng", 6, bd("300.00")));
	        cds.add(new CD(4, "Nhạc Đỏ", "Tuấn", 2, bd("400.00")));
	        cds.add(new CD(5, "Nhạc Rock", "Anh Tú", 5, bd("70.00")));
	        return cds;
	    }
	 public static BigDecimal bd(String value) {
			return new BigDecimal(value);
			}
	}
