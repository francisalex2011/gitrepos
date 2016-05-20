package com.rbc.shopping;

import java.util.ArrayList;
import java.util.List;

public class FruitBasket {

	private List<Fruit> fruits;

	public Double getTotalPrice(FruitBasket basket) {
		return fruits.stream().mapToDouble(Fruit::getPrice).sum();
	}

	public FruitBasket() {
		fruits = new ArrayList<>();
	}

	public void addItem(Fruit fruit) {
		fruits.add(fruit);
	}

	public void removeItem(Fruit fruit) {
		fruits.remove(fruit);
	}

	public void clear() {
		fruits.clear();

	}

}
