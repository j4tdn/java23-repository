package view;

import bean.Item;

public class Ex03 {
    public static void main(String[] args) {
        Item[] items = {
            new Item(1, "A", 25, 101),
            new Item(2, "B", 90, 102),
            new Item(3, "C", 88, 102),
            new Item(4, "D", 40, 101),
            new Item(5, "E", 60, 102),
            new Item(6, "F", 18, 101)
        };


        HighestPricedItem(items);
    }

    public static void HighestPricedItem(Item[] items) {
        int[] maxPrices = new int[111];
        int[] maxItemIds = new int[111];

        for (int i = 0; i < maxPrices.length; i++) {
            maxPrices[i] = -1;  
        }
        for (Item item : items) {
            int storeId = item.getStoreId();
            if (item.getSalesPrice() > maxPrices[storeId]) {
                maxPrices[storeId] = item.getSalesPrice();
                maxItemIds[storeId] = item.getItemId();
            }
        }
        System.out.println("The highest priced item in each store");
        for (int i = 0; i < maxPrices.length; i++) {
            if (maxPrices[i] != -1) {
                System.out.println("shop " + i + ":product code " + maxItemIds[i] + " with price " + maxPrices[i]);
            }
        }
    }
}

