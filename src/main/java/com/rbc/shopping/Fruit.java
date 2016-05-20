package com.rbc.shopping;

import java.util.Objects;

public class Fruit {

	private String name;
	private Double price;

	public Fruit(String name, Double price) {
		this.name = name.toUpperCase();
		this.price = price;
	}

	public String getName() {
		return this.name;
	}

	public Double getPrice() {
		return this.price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruit other = (Fruit) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		return true;
	}

}
