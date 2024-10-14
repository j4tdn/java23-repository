package sorting.buble;

import java.util.Arrays;

import org.w3c.dom.css.CSSRule;

import bean.Item;
import functional.ItemComparator;
import model.DataModel;

public class Ex03BubleSortItem {
// so sánh thuộc tính theo đối tượng
	public static void main(String[] args) {
		Item[] items = DataModel.mockItems();
		printf("Initial items",items);
// Sắp xếp tăng dần theo id
// Sắp xếp tăng dần theo name
// sắp xếp giảm dần theo salesPrice
//Sắp xếp giảm dần theo storeId
// Sắp xếp tăng dần theo storeId, giảm dần theo expiredDate
	
		bubleSort(items, (i1, i2) ->{
			if(i1.getId().compareTo(i2.getId()) > 0) {
				return 1;
			}
				return -1;
		});
         printf("Sắp xếp tăng dần theo id: ", items);

         //// Sắp xếp tăng dần theo name
     	bubleSort(items, (i1, i2) -> {
			 return i1.getName().compareTo(i2.getName());
		});
        printf("Sắp xếp tăng dần theo name: ", items);
     
        //Sắp xếp giảm dần theo storeId
        bubleSort(items, (i1, i2) ->{
            if(i1.getSalesPrice() - i2.getSalesPrice() > 0) {
            	return -1;
            }
            	return 1;
        });
        printf("Sắp xếp giảm dần theo salesPrice", items);

        //Giam dan theo storeId
        
        bubleSort(items, (i1, i2) ->{
        	return i2.getStoreId().compareTo(i1.getStoreId());
        });
    	printf("Giam dan theo storeId",items);
     
    	
    	
//      Sắp xếp giảm dần theo storeId, giảm dần theo expiredDate
                 bubleSort(items, (i1, i2) -> {
                Integer storeId1 = i1.getStoreId();
                Integer storeId2 = i2.getStoreId();
                if(storeId1 != storeId2) {
                	return storeId2.compareTo(storeId1);
                }
                return i1.getExpiredDate().compareTo(i2.getExpiredDate());
                 });
                 printf("Giam dần theo storeId và expiredDate", items);
                 
                 // sx tăng dần theo storeId,giảm dần theo salesPrice và expiredDate
                 
                 bubleSort(items, (i1, i2) -> {
                	 Integer storeId1 = i1.getStoreId();
                     Integer storeId2 = i2.getStoreId();
                     Double salesPrices1 = i1.getSalesPrice();
                     Double salesPrices2 = i2.getSalesPrice();
  // Luư ý khi so sánh 2 số thức thì k nên dùng ==,!= vì vì số thực sẽ k trả đúng kq mà ta
                     //nên dùng compareTo của java
                     int salesPrice = salesPrices2.compareTo(salesPrices1);
                     if(storeId1 != storeId2) {
                     	return storeId1.compareTo(storeId2);
                     }else
                    	 if(salesPrice != 0) {
                    	 return salesPrices2.compareTo(salesPrices2);
                     	} else
                     return i2.getExpiredDate().compareTo(i1.getExpiredDate());
                 });
printf("Câu 6 --->",items);
	}
	
	
	
	private static void printf(String prefix, Item[] items) {
		System.out.println(prefix + "---> { ");
		for(Item item:items) {
			System.out.println("        +" +item);
		}
		System.out.println("}\n");
	}
	
	private static void bubleSort(Item[] items, ItemComparator itemComparator) {
		int length = items.length;
		for(int i = 0; i < length; i++) {
			for( int j = 0; j < length -i -1; j++) {
				if(itemComparator.stategy(items[j], items[j+1]) > 0) {
					Item temp = items[j];
					items[j] = items[j+1];
					items[j+1] = temp;
					
				}
			}
		}
		
		
	}
	
}
