package com.rbc.shopping;

import junit.framework.TestCase;

public class FruitBasketTest extends TestCase {
	FruitBasket basket;

	@Override
	public void setUp() {
		basket = new FruitBasket();
	}

	public void testPriceSingleItem() {
		basket.addItem(new Fruit("Banana", 0.10));
		assertEquals(0.1, basket.getTotalPrice(basket));
	}

	public void testPriceSingleDuplicateItem() {
		basket.addItem(new Fruit("Orange", 0.20));
		basket.addItem(new Fruit("Orange", 0.20));
		assertEquals(0.4, basket.getTotalPrice(basket));
	}

	public void testPriceWithDuplicateFruits() {
		// Bananas, Oranges, Apples;
		basket.addItem(new Fruit("Banana", 0.10));
		basket.addItem(new Fruit("Apple", 0.20));
		basket.addItem(new Fruit("Orange", 0.20));
		basket.addItem(new Fruit("Banana", 0.10));
		basket.addItem(new Fruit("Banana", 0.10));
		basket.addItem(new Fruit("Orange", 0.20));
		basket.addItem(new Fruit("Orange", 0.20));
		assertEquals(1.1, basket.getTotalPrice(basket));
	}

	public void testPriceWithDuplicateAllFruits() {
		// Bananas, Oranges, Apples, Lemons, Peaches;
		basket.addItem(new Fruit("Banana", 0.10));
		basket.addItem(new Fruit("Apple", 0.20));
		basket.addItem(new Fruit("Lemons", 0.10));
		basket.addItem(new Fruit("Lemons", 0.20));
		basket.addItem(new Fruit("Orange", 0.20));
		basket.addItem(new Fruit("Peaches", 0.20));
		basket.addItem(new Fruit("Peaches", 0.20));
		basket.addItem(new Fruit("Banana", 0.10));
		basket.addItem(new Fruit("Banana", 0.10));
		basket.addItem(new Fruit("Orange", 0.20));
		basket.addItem(new Fruit("Orange", 0.20));
		assertEquals(1.8, basket.getTotalPrice(basket));
	}

	public void testPriceSingleItemAddRemove() {
		basket.addItem(new Fruit("Orange", 0.20));
		basket.addItem(new Fruit("Orange", 0.20));
		basket.removeItem(new Fruit("Orange", 0.20));
		assertEquals(0.2, basket.getTotalPrice(basket));
	}

}
