/**
 * Created by andy on 17/11/2016.
 */
package com.thewrides.fruitcart;

import java.util.HashMap;
import java.util.Map;

public class BasketWithDiscounts implements BasketInterface {

    public static int getPrice(FruitEnum... fruitList) {

        // Count how many we have of each fruit and add to a map
        Map<FruitEnum, Integer> fruitCountMap = new HashMap<FruitEnum, Integer>();
        for (FruitEnum fruit : fruitList) {
            int count = fruitCountMap.getOrDefault(fruit, 0) + 1;
            fruitCountMap.put(fruit, count);
        }

        int price = 0;
        for (FruitEnum fruit : fruitCountMap.keySet()) {

            int count = fruitCountMap.get(fruit);
            int freebieCount = count / fruit.getOneFreeFrequency();
            price += ((count - freebieCount) * fruit.getPrice());

        }
        return price;
    }
}
