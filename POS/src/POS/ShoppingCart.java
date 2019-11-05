package POS;

import java.util.ArrayList;

public class ShoppingCart {
	private ArrayList<Item> cart;
	
	public ShoppingCart() {
		cart = new ArrayList<Item>();
	}
	public void addItem(Item item) {
		cart.add(item);
	}
}
