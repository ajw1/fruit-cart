/**
 * Created by andy on 17/11/2016.
 */
package com.thewrides.fruitcart;

public enum FruitEnum {

    APPLE(60, 2), ORANGE(25, 3);

    private int price;

    private int oneFreeFrequency;

    FruitEnum(int price, int oneFreeFrequency) {
        this.price = price;
        this.oneFreeFrequency = oneFreeFrequency;
    }

    public int getPrice() {
        return price;
    }

    public int getOneFreeFrequency() {
        return oneFreeFrequency;
    }

}
