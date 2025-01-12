package view;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import bean.Item;
import bean.Store;
import model.DataModel;

public class WhAllocationDemo {

	public static void main(String[] args) {
		// Step 1: Check for planning amount
		boolean stepContinue = checkPlanningAmount(DataModel.planningAmount, DataModel.requiredMinPlanningAmount);
		if (stepContinue) {
			// Step 2:Filling gaps by references or average
			Map<Integer, Integer> refStores = DataModel.mockRefStores();
			List<Store> storesA77 = DataModel.mockStoresOfRefItemA77().get(new Item(77, "Item A77"));
			fillPotentialGraps(storesA77, refStores);
			List<Store> allStores77 = new ArrayList<Store>();
			// Step 3:Calculate Store Demand of current Item(Item A1)
			Map<Integer, BigDecimal> storeTrends = DataModel.mockStoreTrendFactors();
			Map<Item, List<Store>> storeProtentialA55 = DataModel.mockStoresOfRefItemA55();
			Map<Item, List<Store>> storeProtentialA77 = DataModel.mockStoresOfRefItemA77();
			Map<Integer, BigDecimal> refWeight = DataModel.mockRefWeights();
			calculateStoreDemand(storeProtentialA55.get(new Item(55, "Item 55")),
					storeProtentialA77.get(new Item(77, "Item 77")), refWeight, storeTrends);
			// Step 4 Sum up Demand to WH Level
			Map<Integer, BigDecimal> whDemand = sumUpDemandToWH(storesA77);
			whDemand.forEach((whId, demand) -> System.out.println("WH " + whId + ": " + demand));
			// Step 5 Calculate Shares
			calculateShares(whDemand);
		} else {
			System.out.println("Stopping calculation.");
			System.exit(0);
		}
	}

	private static boolean checkPlanningAmount(int planningAmount, int requiredMinPlanningAmount) {
		return planningAmount > requiredMinPlanningAmount;
	}

	private static void fillPotentialGraps(List<Store> stores, Map<Integer, Integer> refStores) {
		BigDecimal averagePotential = calculationAveragePotential(stores);
		for (Store store : stores) {
			if (store.getPotential().compareTo(BigDecimal.ZERO) == 0) {
				Integer refStoreId = refStores.get(store.getId());
				if (refStoreId != null) {
					Store refStore = stores.stream().filter(s -> s.getId().equals(refStoreId)).findFirst().orElse(null);
					if (refStore != null && refStore.getPotential().compareTo(BigDecimal.ZERO) > 0) {
						store.setPotential(refStore.getPotential());
					} else {
						store.setPotential(averagePotential);
					}
				} else {
					store.setPotential(averagePotential);
				}
			}
		}

	}

	private static BigDecimal calculationAveragePotential(List<Store> stores) {
		BigDecimal totalPotential = BigDecimal.ZERO;
		int count = 0;
		for (Store store : stores) {
			if (store.getPotential().compareTo(BigDecimal.ZERO) > 0) {
				totalPotential = totalPotential.add(store.getPotential());
				count++;
			}
		}

		return count > 0 ? totalPotential.divide(BigDecimal.valueOf(count), 1, RoundingMode.HALF_UP) : BigDecimal.ZERO;
	}

	private static void calculateStoreDemand(List<Store> storesA55, List<Store> storesA77,
			Map<Integer, BigDecimal> refWeights, Map<Integer, BigDecimal> storeTrends) {
		for (int i = 0; i < storesA55.size(); i++) {
			Store storeA55 = storesA55.get(i);
			Store storeA77 = storesA77.get(i);

			BigDecimal potentialA55 = storeA55.getPotential();
			BigDecimal potentialA77 = storeA77.getPotential();
			BigDecimal weightA55 = refWeights.getOrDefault(55, BigDecimal.ONE);
			BigDecimal weightA77 = refWeights.getOrDefault(77, BigDecimal.ONE);

			BigDecimal storeTrend = storeTrends.getOrDefault(storeA77.getId(), BigDecimal.ONE);

			BigDecimal totalWeight = weightA55.add(weightA77);
			if (totalWeight.compareTo(BigDecimal.ZERO) == 0) {
				throw new ArithmeticException("Weight not 0");
			}

			BigDecimal demand = (potentialA55.multiply(weightA55).add(potentialA77.multiply(weightA77)))
					.divide(totalWeight, RoundingMode.HALF_UP).multiply(storeTrend);
			storeA77.setPotential(demand);
			System.out.println("Store" + storeA77.getId() + "Demand: " + demand);
		}

	}

	private static Map<Integer, BigDecimal> sumUpDemandToWH(List<Store> stores) {
		return stores.stream().collect(Collectors.groupingBy(Store::getWhId,
				Collectors.reducing(BigDecimal.ZERO, Store::getPotential, BigDecimal::add)));
	}

	private static void calculateShares(Map<Integer, BigDecimal> whDemand) {
		BigDecimal totalDemand = whDemand.values().stream().reduce(BigDecimal.ZERO, BigDecimal::add);

		if (totalDemand.compareTo(BigDecimal.ZERO) > 0) {
			whDemand.forEach((whId, demand) -> {
				BigDecimal share = demand.multiply(BigDecimal.valueOf(100)).divide(totalDemand, RoundingMode.HALF_UP);
				System.out.println("WH " + whId + " Share: " + share + "%");
			});
	   }
	}

}