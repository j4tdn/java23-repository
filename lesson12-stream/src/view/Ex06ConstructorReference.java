package view;

import java.util.HashMap;
import java.util.Map;

public class Ex06ConstructorReference {
	public static void main(String[] args) {
		// 1. Implementation
		// 2. Anonymous class
		// 3. Anonymous function
		// 4. Method/Constructor reference:
		// 4.1 Method
		// --> Chỉ cần có lambda vs danh sách tham số,body, return type
		// -> đều có thể chuyển sang method reference
		// Cách gọi: TenClass::tenHam

		// 4.2 Constructor Reference:
		// --> Có lambda, danh sách tham số bất kì và body gọi đến hàm khởi tạo
		// --> của class nào return type chính là KDL của class đó
		// Cách gọi: TenClass::new

	}

	private static Map<Integer,String> mockVehicles(){
		// dynamic hash map
		return new HashMap<Integer, String>() {
			private static final long serialVersionUID = 1L;
			{
				put(92, "Quảng Nam");
				put(43, "Đà Nẵng");
				put(75, "Huế");
				put(74, "Quảng Trị");
				put(73, "Quảng Bình");
			}
		};
	}
}
