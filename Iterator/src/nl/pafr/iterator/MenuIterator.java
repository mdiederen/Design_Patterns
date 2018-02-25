package nl.pafr.iterator;

import java.util.Iterator;
import java.util.List;

public class MenuIterator implements Iterator<Item> {
	
	private List<Item> menuItems;
	private int currentIndex = 0;
	
	public MenuIterator(List<Item> items) {
		super();
		this.menuItems = items;
	}

	@Override
	public boolean hasNext() {
		if (currentIndex >= menuItems.size()) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Item next() {
		return menuItems.get(currentIndex++);
	}
	
	@Override
	public void remove() {
		menuItems.remove(--currentIndex);
	}

}
