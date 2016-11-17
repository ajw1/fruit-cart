package com.thewrides.fruitcart;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by andy on 17/11/2016.
 */
public class BasketTest {

    @Test
    public void getPrice1Apple() throws Exception {
        int price = Basket.getPrice(FruitEnum.APPLE);
        Assert.assertEquals("The expected price for 1 apple is 60p", 60, price);
    }

    @Test
    public void getPrice1Orange() throws Exception {
        int price = Basket.getPrice(FruitEnum.ORANGE);
        Assert.assertEquals("The expected price for 1 orange is 25p", 25, price);
    }

    @Test
    public void getPrice3Apples1Orange() throws Exception {
        int price = Basket.getPrice(FruitEnum.APPLE, FruitEnum.APPLE, FruitEnum.ORANGE, FruitEnum.APPLE);
        Assert.assertEquals("The expected price for 3 apples and 1 orange is 205p", 205, price);
    }

}