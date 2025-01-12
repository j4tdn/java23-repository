package model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Apple;
import bean.BankTransaction;
import bean.Dish;
import bean.Item;
import bean.Store;
import common.Category;

public class DataModel {
	private DataModel() {

	}

	public static List<BankTransaction> mockBankTransaction() {
		return List.of(
				new BankTransaction("A1", "B1", bd("200"), time("02/03/2022 20:52:50"), true),
				new BankTransaction("A2", "B2", bd("100"), time("01/03/2022 20:52:50"), true),
				new BankTransaction("A3", "B3", bd("432"), time("18/03/2022 20:52:50"), false),
				new BankTransaction("A4", "B4", bd("522"), time("02/03/2022 20:52:50"), false),
				new BankTransaction("A5", "B5", bd("222"), time("03/03/2022 20:52:50"), true));
	}
	
	public static BigDecimal bd(String value) {
		return new BigDecimal(value);
	}

	public static LocalDateTime time(String value) {
		return LocalDateTime.parse(value, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
	}

	public static List<Item> mockItems() {
		Store s1 = new Store(1, "Store 1");
		Store s2 = new Store(2, "Store 2");
		Store s3 = new Store(3, "Store 3");
		Store s4 = new Store(4, "Store 4");
		Store s5 = new Store(5, "Store 5");
		Store s6 = new Store(6, "Store 6"); // chưa bán hàng
		Store s7 = new Store(7, "Store 7"); // chưa bán hàng

		return List.of(new Item(101, "Item 101", new BigDecimal("202"), List.of(s1, s2)),
				new Item(102, "Item 102", new BigDecimal("303"), List.of(s1, s2, s3)),
				new Item(103, "Item 103", new BigDecimal("404"), List.of(s1, s4, s5)),
				new Item(104, "Item 104", new BigDecimal("505"), List.of(s1, s2, s7, s4, s5)));
	}

	public static Map<Integer, String> mockVehicles() {
		var vehicles = new HashMap<Integer, String>();

		vehicles.put(92, "A Quảng Nam");
		vehicles.put(43, "Z Đà Nẵng");
		vehicles.put(75, "K Thừa Thiên Huế");
		// vehicles.put(null, "B Việt Nam");
		vehicles.put(74, "F Quảng Trị");
		vehicles.put(73, "C Quảng Bình");
		vehicles.put(73, "Z Quảng Bình");
		vehicles.put(11, "Cao Bằng");

		return vehicles;
	}

	public static List<Apple> getApples() {
		return List.of(
				new Apple(1, "green", 200d, "Vietnam"),	
				new Apple(16, "green", 300d, "Vietnam"),	
				new Apple(22, "red", 300d, "Lao"),	
				new Apple(4, "yellow", 400d, "Thailand"),	
				new Apple(17, "red", 600d, "Vietnam"),	
				new Apple(6, "green", 100d, "Thailand")	
		);
	}
	
	public static List<Dish> mockDishes() {
		return List.of(new Dish("D01", "Dish A1", 220, Category.FISH), new Dish("D02", "Dish A2", 782, Category.MEAT),
				new Dish("D03", "Dish A3", 100, Category.VEGGIE), new Dish("D04", "Dish A4", 150, Category.EGG),
				new Dish("D05", "Dish B5", 220, Category.FISH), new Dish("D06", "Dish B6", 782, Category.MEAT),
				new Dish("D07", "Dish C7", 111, Category.VEGGIE), new Dish("D08", "Dish C8", 1020, Category.EGG),
				new Dish("D09", "Dish D9", 220, Category.FISH), new Dish("D10", "Dish D10", 777, Category.MEAT),
				new Dish("D11", "Dish E11", 111, Category.EGG), new Dish("D12", "Dish E12", 1500, Category.EGG));
	}
//	
//	public static List<Transaction> getTransactions() {
//		Trader raoul = new Trader("Raoul", "Cambridge");
//		Trader mario = new Trader("Mario", "Milan");
//		Trader alan = new Trader("Alan", "Cambridge");
//		Trader brian = new Trader("Brian", "Cambridge");
//		List<Transaction> transactions = Arrays.asList(
//			new Transaction(brian, 2011, 300),
//			new Transaction(raoul, 2012, 1000), 
//			new Transaction(raoul, 2011, 400),
//			new Transaction(mario, 2012, 710), 
//			new Transaction(mario, 2012, 700), 
//			new Transaction(alan, 2012, 950)
//		);
//		return transactions;
//	}
}
