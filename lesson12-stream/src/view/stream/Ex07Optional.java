package view.stream;

import java.util.Optional;
import java.util.Random;

import bean.Item;

public class Ex07Optional {

	/*
	 Khi nào dùng Optional
	 + Gọi các hàm có sẵn của Java --> return Optional<T>
	 + Lưu trữ giá trị cho biến KDL đối tượng, biến nullable
	   VD: Item item;
	   	   Optional<Item> otpItem;
	 */
	
	private static Random rd = new Random();
	
	public static void main(String[] args) {
		int id = rd.nextInt(22);
//		Optional<Item> optItem = Optional.ofNullable(findItem(id));
//		// Cách 1
//		/*
//		 if(optItem.isPresent()) {
//		 	Item item = optItem.get();
//		 	item.setSalesPrice(new BigDecimal("999"));
//		 */
//	}
	
//	private static Item findItem(int id) {
//		Item result = null;
//		
//	}
}}
