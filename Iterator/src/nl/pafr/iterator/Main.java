package nl.pafr.iterator;

public class Main {

	public static void main(String[] args) {
		Item i1 = new Item("spaghetti", 7.50f);
		Item i2 = new Item("hamburger", 6.00f);
		Item i3 = new Item("chicken sandwich", 6.50f);

		Menu menu = new Menu();
		menu.addItem(i1);
		menu.addItem(i2);
		menu.addItem(i3);

		System.out.println("Displaying Menu:\n");

		MenuIterator iterator = new MenuIterator(menu.getMenuItems());

		while (iterator.hasNext()) {
			Item item = iterator.next();
			System.out.println(item);
		}

		System.out.println("\nRemoving last item returned");
		iterator.remove();

		System.out.println("\nDisplaying Menu:");
		iterator = new MenuIterator(menu.getMenuItems());
		while (iterator.hasNext()) {
			Item item = iterator.next();
			System.out.println(item);
		}
	}

}
