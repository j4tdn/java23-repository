package view.stream;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.Random;

import org.w3c.dom.ls.LSOutput;

import bean.Item;
import model.DataModel;

public class Ex07Optional {

	/*
	  Khi nào dùng Optional
	  + Gọi hàm có sẵn của Java --> return Optional<T>
	  + Lưu trữ giá trị cho biến KDL đối tượng, biến nullable
	  	VD: Item item;
	  		Optional<Item> otpItem; --> generic type
	  	
	 */
	private static Random rd = new Random();
	
	public static void main(String[] args) {
		int id = rd.nextInt(8);
		Optional<Item> otpItem = Optional.ofNullable(findItem(id));  //item có thể ko tìm thấy --> nullable
		
		// cách 1
		if(otpItem.isPresent()) {
			Item item = otpItem.get();
			item.setSalesPrice(new BigDecimal("999"));
			System.out.println("Mặt hàng sau khi cập nhật giá bán : " + item);
		} else {
			System.out.println("Mặt hàng ko tồn tại");
		}
		// Cách 2
		otpItem.ifPresentOrElse(
				item -> {
					item.setSalesPrice(new BigDecimal("999"));
					System.out.println("Mặt hàng sau khi cập nhật giá bán : " + item);
				}, 
					() -> System.out.println("Mặt hàng này ko tồn tại"));
		
		//item.setSalesPrice(new BigDecimal("999"));
		//System.out.println("Mặt hàng sau khi cập nhật giá bán: " + item);
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