/**
 * Created by andy on 17/11/2016.
 */
package com.thewrides.fruitcart;

public class Basket implements BasketInterface {

    public static int getPrice(FruitEnum... fruitList) {
        int price = 0;
        for (FruitEnum fruit : fruitList) {
            price += fruit.getPrice();
        }
        return price;
    }
}
