
package view;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import bean.Item;
import bean.Store;
import model.DataModel;

public class WhAllocationDemo {

	public static void main(String[] args) {
		// use data from DataModel
		final BigDecimal weightRef1 = new BigDecimal("2.5");

		final BigDecimal weightRef2 = new BigDecimal("1.5");

		var trendFactor = DataModel.trendFactor();

		Map<Item, List<Store>> ItemsA55 = DataModel.mockStoresOfRefItemA55();

		Map<Item, List<Store>> ItemsA77 = DataModel.mockStoresOfRefItemA77();

		// do calculation
 
		// print result step by step
	}

	
	private static Map<Integer, BigDecimal> doSumDemand(List<Store> data1, List<Store> data2, BigDecimal weit1,
			BigDecimal wei2, List<BigDecimal> trendFactor) {
		Map<String, BigDecimal> itemsA55 = updatePotential(data1);
		Map<String, BigDecimal> itemsA77 = updatePotential(data2);
		Map<Integer, BigDecimal> result = new LinkedHashMap<>();
//		Map<Integer, BigDecimal> sumOfDemand = new LinkedHashMap<>();


		BigDecimal demand = new BigDecimal("0");
		int count = 1;
		for (Map.Entry<String, BigDecimal> entry : itemsA55.entrySet()) {
			String key = entry.getKey();
			BigDecimal potenRef1 = entry.getValue();

			if (itemsA77.containsKey(key)) {
				BigDecimal potenRefn = itemsA77.get(key);
				demand = ((potenRef1.multiply(weit1)).add(potenRefn.multiply(wei2)))
						.divide((weit1.add(wei2)).multiply(trendFactor.get(count)));
				count++;
				result.put(data1.get(count).getWhId(), demand);
			}
		}
		  BigDecimal WH1 = new BigDecimal("0");
		  BigDecimal WH2 = new BigDecimal("0");
		  BigDecimal WH3 = new BigDecimal("0");

		for(var k : result.entrySet()) {
			if(k.getKey() == 1) {
			   WH1 = WH1.add(k.getValue());
			} else 
				if(k.getKey() == 2) {
					   WH2 = WH2.add(k.getValue());
					} else
						WH3 = WH3.add(k.getValue());
		}
		
		return result;
	}

	private static Map<String, BigDecimal> updatePotential(List<Store> data) {
		Map<String, BigDecimal> result = new LinkedHashMap<>();
		// Nếu dùng stream thì cập nhật 1 th của referen
//		Map<Integer,BigDecimal> result = data.entrySet()
//				       .stream()
//				       .flatMap(t -> t.getValue().stream())
//				       .filter(t -> 
//				    	    t.getDesc() != null && 
//				                    t.getPotential().compareTo(BigDecimal.ZERO) == 0 
//				       )
//				       .collect(Collectors.toMap(Store::getId, Store::getPotential));

		// Cap nhat du lieu potential
		for (int i = 0; i < data.size(); i++) {
			for (int j = i + 1; j < data.size(); j++) {
				if (data.get(i).getDesc() != null && data.get(i).getPotential().compareTo(BigDecimal.ZERO) == 0
						&& data.get(i).getDesc().equals(data.get(j).getDesc())) {
					result.put(data.get(i).getDesc(), fillPotential(data, data.get(j).getDesc()));
				} else if (data.get(i).getDesc() == null
						&& data.get(i).getPotential().compareTo(BigDecimal.ZERO) == 0) {
					result.put(data.get(i).getDesc(), averagePotential(data));
				} else
					result.put(data.get(i).getDesc(), data.get(i).getPotential());
			}
		}

		return result;
	}

	private static BigDecimal fillPotential(List<Store> data, String desc) {
		// Tìm mặt hàng chưa có poten nhưng có referenId
		return data.stream().filter(t -> t.getDesc().equals(desc)).map(t -> t.getPotential()).findFirst().orElse(null);
	}

	// Tính giá trị trung bình của potential
	private static BigDecimal averagePotential(List<Store> data) {
		BigDecimal count = new BigDecimal("0");
		BigDecimal one = BigDecimal.ONE;
		BigDecimal averagePoten = new BigDecimal("one");

		for (var k : data) {
			if (k.getPotential() != null) {
				averagePoten = averagePoten.add(k.getPotential());
				count = count.add(one);
			}
		}
		return averagePoten.divide(count);
	}

}
