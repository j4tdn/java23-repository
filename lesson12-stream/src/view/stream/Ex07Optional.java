package view.stream;

import java.lang.foreign.Linker.Option;
import java.math.BigDecimal;
import java.util.Optional;
import java.util.Random;

import bean.Item;
import model.DataModel;

public class Ex07Optional {
	/*
	   khi nào dùng optional
	   + Gọi các hàm có sắn trong Java --> return Option<T>
	   + Lưu trữ giá trị cho biến KDL đối tượng ,  biến nullable
	   VD: Item item;
	   Optional<Item> opItem;
	 */
	private static Random rd = new Random();
	
	public static void main(String[] args) {
		int id = rd.nextInt(22);
		
		
		Optional<Item> optItem =Optional.ofNullable(findItem(id)) ;
	//	item.setSalesPrice(new BigDecimal("22"));
		//System.out.println("Mặt hàng sau khi cập nhật " + item);
		
		// Cach 1:
		if(optItem.isPresent() ) {
			Item item = optItem.get();
			System.out.println("Mặt hàng sau khi cập nhật " + item);
		}else {
			System.out.println("Mặt hàng không tồn tại");
		}
		
		// Cach 2:
		optItem.ifPresentOrElse(
				item -> {
					item.setSalesPrice(new BigDecimal("999"));
					System.out.println("Mặt hàng sau khi cập nhật " + item);
				},
				() -> System.out.println("Mặt hàng không tồn tại")
				);
		
	}

	private static Item findItem(int id) {
		
		Item result = null;
		for(Item item : DataModel.getItem()) {
			if(item.getId() == id) {
				result = item;
				break;
			}
		}
		return result;
	}

}
