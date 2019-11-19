package POS;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class MenuItems implements Iterable<Item> {
	private ArrayList<Item> items;
	public MenuItems() {
		items = new ArrayList<Item>();
		/*
		** Read database
		*/
		try {
			BufferedReader br = new BufferedReader(new FileReader(".db"));
			String st;
			
			while ((st = br.readLine()) != null) {
				String split[] = st.split(" ");
				Item newItem = new Item(split[0], Double.parseDouble(split[1]));
				items.add(newItem);
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void addItem(Item newItem) {
		items.add(newItem);
	}
	
	public void deleteItem(Item item) {
		items.remove(item);
	}
	
	public void modifyItem(Item item, double price) {

	}
	
	public void updateDB() {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(".db"));
			
			Iterator<Item> it = items.iterator();
			while (it.hasNext()) {
				Item tmp = it.next();
				writer.write(tmp.getName() + " " + tmp.getPrice() + "\n");
				System.out.println(tmp.getName() + " " + tmp.getPrice());
			}
			writer.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	
	@Override
	public Iterator<Item> iterator() {
		return items.iterator();
	}
	

}
