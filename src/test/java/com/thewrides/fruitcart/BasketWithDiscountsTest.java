package com.thewrides.fruitcart;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by andy on 17/11/2016.
 */
public class BasketWithDiscountsTest {

    @Test
    public void getPrice1Apple() throws Exception {
        int price = BasketWithDiscounts.getPrice(FruitEnum.APPLE);
        Assert.assertEquals("The expected price for 1 apple is 60p", 60, price);
    }

    @Test
    public void getPrice1Orange() throws Exception {
        int price = BasketWithDiscounts.getPrice(FruitEnum.ORANGE);
        Assert.assertEquals("The expected price for 1 orange is 25p", 25, price);
    }

    @Test
    public void getPrice3Apples1Orange() throws Exception {
        int price = BasketWithDiscounts.getPrice(FruitEnum.APPLE, FruitEnum.APPLE, FruitEnum.ORANGE, FruitEnum.APPLE);
        Assert.assertEquals("The expected price for 3 apples and 1 orange is 145", 145, price);
    }

    @Test
    public void getPriceApplesOrangeIncrementing() throws Exception {
        List<FruitEnum> fruitList = new ArrayList<FruitEnum>();

        int price = 0;
        for (int i = 1; i < 10; i++) {
            // Add one apple and one orange to the basket each time and calculate the price
            fruitList.add(FruitEnum.APPLE);
            fruitList.add(FruitEnum.ORANGE);
            if ((i % 2) > 0) price += 60; // Add 60p for each apple unless it is the 2,4,6,... apple
            if ((i % 3) > 0) price += 25; // Add 25p for each orange unless it is the 3,6,9,.. orange
            int actualPrice = BasketWithDiscounts.getPrice(fruitList.toArray(new FruitEnum[0]));
            System.out.println(i + " apple(s) and " + i + " orange(s) calculated at: " + actualPrice);
            Assert.assertEquals("The expected price for " + i + " apple(s) and " + i + " orange(s)", price, actualPrice);
        }
    }

}