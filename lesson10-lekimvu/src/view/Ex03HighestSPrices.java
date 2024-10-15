package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import bean.Item;

public class Ex03HighestSPrices {

	public static void main(String[] args) {
 System.out.println("Mặt hàng có giá bán cao nhất ở mỗi cửa hàng: " +Arrays.toString(highestSalesPrice(mockData())));	
	
	}
		private static Item[] mockData() {
		 return new Item[] {
		            new Item(1, "B", 25, "101"),
		            new Item(2, "C", 90, "102"),
		            new Item(3, "D", 88, "102"),
		            new Item(4, "E", 40, "101"),
		            new Item(5, "F", 60, "102"),
		            new Item(6, "G", 18, "101")
		        };
	}
//	  public static String[] storeId(Item[] item) {
//		  String[] storeId = new String[2];
//		   storeId[0] = "101";
//		   storeId[1] = "102";
//		return storeId;
//	  }
//		
	  private static Item[] highestSalesPrice(Item[] items) {
		  String[] storeIds = new String[2];
		   storeIds[0] = "101";
		   storeIds[1] = "102";
		  Item[] highestSPrices = new Item[storeIds.length];
		  int count = 0;
      for(int i =0; i < storeIds.length;i++) {
			Item highestSPrice = null;
			for(Item item: items) {
				if(item.getStoreId().equals(storeIds[i])) {
				if(highestSPrice == null || item.getSalesrice() > highestSPrice.getSalesrice()) {
				 highestSPrice = item;		
					}
				}
			}
			highestSPrices[count++] = highestSPrice;
		}
	return	Arrays.copyOfRange(highestSPrices, 0, count);
	  }
	}
