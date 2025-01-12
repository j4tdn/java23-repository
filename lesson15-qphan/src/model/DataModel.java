package model;

<<<<<<< HEAD
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import bean.Store;

public class DataModel {

	private DataModel() {
	}

	public static List<Store> getStores() {
		return Arrays.asList(
				new Store(1L, null, bd(18), bd(40), Boolean.TRUE),
				new Store(2L, null, bd(19), bd(20), Boolean.TRUE), 
				new Store(3L, null, bd(21), bd(17), Boolean.TRUE),
				new Store(4L, null, bd(14), bd(31), Boolean.TRUE), 
				new Store(5L, null, bd(14), bd(10), Boolean.TRUE),
				new Store(6L, null, bd(15), bd(30), Boolean.TRUE), 
				new Store(7L, 2L, bd(15), null, Boolean.TRUE),
				new Store(8L, null, bd(12), bd(19), Boolean.TRUE), 
				new Store(9L, null, bd(17), bd(26), Boolean.TRUE),
				new Store(10L, 7L, bd(18), null, Boolean.TRUE), 
				new Store(11L, null, bd(22), null, Boolean.FALSE));
	}

	public static BigDecimal bd(double val) {
		return BigDecimal.valueOf(val);
	}

}
=======
import static utils.NumberUtils.bd;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import bean.Item;
import bean.Store;

/**
 * DataModel: chứa thông tin các dữ liệu đầu vào cho bài toán
 *
 * --> Dữ liệu có thể thay đổi bất kỳ, không được xử lý hardcode khi code
 * Ví dụ: Item A1 có thể thay thế bằng Item A2
 *        Reference Item A55 có thể thay thế bằng các Reference Item A88 B22 với các id khác nhau
 */
public class DataModel {

	// số mặt hàng tối thiểu cần cho một cửa hàng
	public static final Integer minPerStore = 5;

	// số lượng mặt hàng từ country(quốc gia) chuyển đến các warehouse(kho hàng)
	public static final Integer planningAmount = 88;

	// số lượng mặt hàng tối thiểu cần chuyển đi một lần từ country đến warehouse
	public static final Integer requiredMinPlanningAmount = 50;

	private DataModel() {
	}
	
	private static List<Integer> mockItemStoreIds() {
		return IntStream.rangeClosed(1, 14).boxed().toList();
	}

	/**
	 * Dữ liệu test cho store potential của reference item A55
	 */
	public static Map<Item, List<Store>> mockStoresOfRefItemA55() {
		Item itemA55 = new Item(55, "Item A55");
		List<Store> stores = List.of(
			new Store(1, "Store 1", bd(21.9), 2),
			new Store(2, "Store 2", bd(66.885), 1),
			new Store(3, "Store 3", bd(10.5), 1),
			new Store(4, "Store 4", bd(36.4), 1),
			new Store(5, "Store 5", bd(14), 1),
			new Store(6, "Store 6", bd(65.52), 1),
			new Store(7, "Store 7", bd(17.9), 2),
			new Store(8, "Store 8", bd(26.7), 2),
			new Store(9, "Store 9", bd(54.9), 2),
			new Store(10, "Store 10", bd(35), 2),
			new Store(11, "Store 11", bd(22.7), 3),
			new Store(12, "Store 12", bd(1), 3),
			new Store(13, "Store 13", bd(19.1), 3),
			new Store(14, "Store 14", bd(19.4), 3)
		);
		return Map.of(itemA55, stores);
	}
	
	public static Map<Integer, BigDecimal> mockStoreTrendFactors() {
		return Map.of(
			2, bd(1.2),
			7, bd(1.5),
			11, bd(0.9),
			12, bd(0.7)
		);
	}

	/**
	 * Dữ liệu test cho store potential của reference item A77
	 */
	public static Map<Item, List<Store>> mockStoresOfRefItemA77() {
		Item itemA77 = new Item(77, "Item A77");
		List<Store> stores = List.of(
			new Store(1, "Store 1", bd(22.024), 2),
			new Store(2, "Store 2", bd(150.777), 1),
			new Store(3, "Store 3", bd(33.4), 1),
			new Store(4, "Store 4", bd(23.4), 1),
			new Store(5, "Store 5", bd(26.289), 1),
			new Store(6, "Store 6", bd(22.2), 1),
			new Store(7, "Store 7", bd(23.6), 2),
			new Store(8, "Store 8", bd(21.9), 2),
			new Store(9, "Store 9", bd(20.74), 2),
			new Store(10, "Store 10", bd(0), 2),
			new Store(11, "Store 11", bd(26.612), 3),
			new Store(12, "Store 12", bd(0), 3),
			new Store(13, "Store 13", bd(32.1), 3),
			new Store(14, "Store 14", bd(22.5), 3)
		);
		return Map.of(itemA77, stores);
	}

	/**
	 * Dữ liệu test cho 'Reference Stores Data'
	 * + Store 7 có Reference Store 3
	 * + Store 10 có Reference Store 1
	 */
	public static Map<Integer, Integer> mockRefStores() {
		return Map.of(
				7, 3, 
				10, 1
		);
	}

	/**
	 * Dữ liệu test cho 'Weight(trọng số tham chiếu của mặt hàng) Of Reference Item'
	 * + Item A1 liên kết với Item 55(reference) với trọng số là 2.5
	 * + Item A1 liên kết với Item 77(reference) với trọng số là 1.5
	 */
	public static Map<Integer, BigDecimal> mockRefWeights() {
		return Map.of(
			55, bd(2.5),
			77, bd(1.5)
		);
	}

}
>>>>>>> fccdfd1 (initial data 12.01.2025)
