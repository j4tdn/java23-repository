package view.stream;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.Random;

import bean.Item;
import model.DataModel;

public class Ex07Optional {
	
	/*
	 
	 Khi nào dùng Optional
	 + Gọi các hàm có sẵn của Java --> return Optional<T>
	 + Lưu trữ giá trị cho biến KDL đối tượng, biến nullable
	   VD: Item item;
	       Optional<Item> optItem;
	 
	 */
	
	private static Random rd = new Random();
	
	public static void main(String[] args) {
		// item có thể ko tìm thấy --> nullable
		
		int id = rd.nextInt(22);
		Optional<Item> optItem = Optional.ofNullable(findItem(id));
		// Cách 1
		/*if (optItem.isPresent()) {
			Item item = optItem.get();
			item.setSalesPrice(new BigDecimal("999"));
			System.out.println("Mặt hàng sau khi cập nhật giá bán: " + item);
		} else {
			System.out.println("Mặt hàng không tồn tại");
		}*/
		
		// Cách 2
		optItem.ifPresentOrElse(
			item -> {
				item.setSalesPrice(new BigDecimal("999"));
				System.out.println("C2 Mặt hàng sau khi cập nhật giá bán: " + item);
			},
			() -> System.out.println("C2 Mặt hàng không tồn tại")
		);
	}
	
	// Hàm có sẵn trả về T
	private static Item findItem(int id) {
		Item result = null;
		for (Item item: DataModel.getItems()) {
			if (item.getId() == id) {
				result = item;
				break;
			}
		}
		return result;
	}
	
}