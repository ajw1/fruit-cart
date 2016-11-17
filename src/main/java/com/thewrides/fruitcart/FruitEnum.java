/**
 * Created by andy on 17/11/2016.
 */
package com.thewrides.fruitcart;

public enum FruitEnum {

    APPLE(60),ORANGE(25);

    private int price;

    FruitEnum(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
