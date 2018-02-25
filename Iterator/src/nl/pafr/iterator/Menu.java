package nl.pafr.iterator;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	
	private List<Item> menuItems;

	public Menu() {
		menuItems = new ArrayList<Item>();
	}

	public void addItem(Item item) {
		menuItems.add(item);
	}
	
	public List<Item> getMenuItems() {
		return menuItems;
	}

}
