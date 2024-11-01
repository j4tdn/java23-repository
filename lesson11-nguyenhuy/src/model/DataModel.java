package model;

import java.util.List;

import bean.CD;

public class DataModel {
	public DataModel() {
    }
    
    public static List<CD> mockCD() {
        return List.of(
        		new CD(1, "Pop", "Sơn Tùng", 10, 150.0),
        		new CD(2, "Hip Hop", "Đen Vâu", 12, 200.0),
        		new CD(3, "Ballad", "Mỹ Tâm", 15, 180.0),
        		new CD(4, "Pop", "Minh Hằng", 8, 120.0),
        		new CD(5, "R&B", "Noo Phước Thịnh", 9, 140.0)
        );
    }
}
