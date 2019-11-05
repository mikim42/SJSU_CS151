package POS;

import java.util.ArrayList;
import java.util.Iterator;

public class MenuItems implements Iterable<Item>{
	private ArrayList<Item> items;
	public MenuItems() {
		items = new ArrayList<Item>();
	}
	public void addItem(Item newItem) {
		items.add(newItem);
	}
	public void deleteItem(Item item) {
		items.remove(item);
	}
	public void modifyItem(Item item, double price) {
		
	}
	@Override
	public Iterator<Item> iterator() {
		return items.iterator();
	}
	

}
