package view;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import bean.Store;
import static model.DataModel.*;

/**
 	Đọc đề, load dữ liệu cần thiết từ package model.DataModel
 	Bổ sung nếu thông tin chưa có
	Thực hiện các bước tính toán theo đề bài và trả về kết quả
	Yêu cầu: In thông tin chi tiết kết quả cho từng bước tính toán
 */
public class WhAllocatedAmountManager {
    public static void main(String[] args) {
    	
        // B1
        final Integer whAllocationAmount = 300;

        // B2
        final List<Store> stores = getStores();
        
        
        // step one
        fillingMissingExpectedSalesValues(stores);
        stores.forEach(System.out::println);
        
        System.out.println("\n=============================================================\n");
        
        // step two
        stores.forEach(s -> {
        	System.out.println(s + ", allocationKey=" + calculationOfAllocationKey(stores).get(stores.indexOf(s)));
        });
        
        System.out.println("\n=============================================================\n");
        
        // step three
        stores.forEach(s -> {
        	System.out.println("StoreId=" + s.getStoreId() + ", allocationKey=" 
        						+ calculationOfAllocationKey(stores).get(stores.indexOf(s)) + ", stockPreviousDay=" 
        						+ s.getStockPreviousDay() + ", amountAllocated=" 
        						+ convertToInteger(calculationOfAmountAllocated(stores, calculationOfAllocationKey(stores), whAllocationAmount)).get(stores.indexOf(s)));
        });
        
        // B3
        // Map<Long, Integer> storeAllocatedValues = doAllocation(stores, whAllocationAmount);
        // B4
        // In kết quả
    }

    /**
     * Do Allocation.
     * Key: storeId with Long type
     * Value: storeAllocatedAmount after calculation with 4 steps
     * @return map of storeId, storeAllocatedAmount
     */
//    private static Map<Long, Integer> doAllocation(List<Store> data, Integer whAllocationAmount) {
//        // calculation
//    	
//        return null;
//    }
    

    private static void fillingMissingExpectedSalesValues(List<Store> stores) {
    	BigDecimal sum = stores.stream()
                .filter(s -> s.getExpectedSales() != null) 
                .map(Store::getExpectedSales)
                .reduce(new BigDecimal(0), BigDecimal::add);
    	
    	long count = stores.stream()
    		    .filter(s -> s.getExpectedSales() != null)
    		    .count();
    	
    	@SuppressWarnings("deprecation")
		BigDecimal average = sum.divide(new BigDecimal(count), 1, BigDecimal.ROUND_HALF_UP);
    	
    	Map<Long, BigDecimal> data = stores.stream()
                .filter(s -> s.getExpectedSales() != null)
                .collect(Collectors.toMap(Store::getStoreId, Store::getExpectedSales));
    	
    	stores.stream()
    		.filter(s -> s.getExpectedSales() == null)
    		.forEach(s -> {
    			if(s.getReferenceStoreId() == null || (s.getReferenceStoreId() != null && data.get(s.getReferenceStoreId()) == null))
    				s.setExpectedSales(average);
    		});
    	
    	stores.stream()
    		.filter(s -> s.getExpectedSales() == null)
    		.forEach(s -> s.setExpectedSales(data.get(s.getReferenceStoreId()))); // get trong Map lấy value của store có id tương ứng;
    }
    
	private static List<BigDecimal> calculationOfAllocationKey(List<Store> stores) {
    	BigDecimal sum = stores.stream()
    		.map(Store::getExpectedSales)
    		.reduce(new BigDecimal(0), BigDecimal::add);
    	
    	return stores.stream()
    		.map(Store::getExpectedSales)
    		.map(s -> {
    			@SuppressWarnings("deprecation")
				BigDecimal allocationKey = s.divide(sum, 10, BigDecimal.ROUND_HALF_UP);
    			return allocationKey;
    		}).toList();
    }
	
    private static List<BigDecimal> calculationOfAmountAllocated(List<Store> stores, List<BigDecimal> allocationKey, Integer whAllocationAmount)  {
    	BigDecimal sum = stores.stream()
    		.map(Store::getStockPreviousDay)
    		.reduce(bd(0), BigDecimal::add);
    	
    	return stores.stream()
    		.map(s -> {
    			BigDecimal amountAllocated = allocationKey.get(stores.indexOf(s))
    					.multiply(new BigDecimal(whAllocationAmount)
    					.add(sum))
    					.subtract(s.getStockPreviousDay());
    			return amountAllocated;
    		}).toList();
    }
    
    @SuppressWarnings("deprecation")
	private static List<Integer> convertToInteger(List<BigDecimal> amountAllocated) {
    	return amountAllocated.stream()
    		.map(aA -> aA.setScale((0), BigDecimal.ROUND_HALF_UP).intValue())
    		.toList();
    	
    }
}