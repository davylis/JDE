/*
 * Suppose that we want to create a simple shopping cart.
* Products can be added to a shopping cart and removed from the shopping cart.
* Each product has product number, name and price.
INSTRUCTION
* Create classes Product, Item, and ShoppingCart.
* The Product class has three fields, a parametric constructor, and getters and setters for all fields.
 */

import java.util.ArrayList;

class ShoppingCart() {
	private ArrayList<Item> itemList;
	
	public ShoppingCart(){
		itemList = new ArrayList<Item>();
	}
	
	public ShoppingCart() {
		
	}
	
	public void add() {
		
	}
}

class Item() {
	
}

public class ObjectsSortwordPairsLambda {

	public static void main(String[] args) {
		public class ObjectsShoppingCartProgram {
			public static void main(String[] args) {
			ShoppingCart cart = new ShoppingCart();
			Product product_1 = new Product(10, "Bicycle", 500.00);
			Product product_2 = new Product(11, "Energy bar", 1.50);
			Product product_3 = new Product(12, "Water bottle", 6.00);
			System.out.println(cart);
			cart.add(product_1, 1);
			cart.add(product_2, 5);
			cart.add(product_3, 2);
			System.out.println(cart);
			cart.remove(product_2);
			System.out.println(cart);
			}
			}

	}

}
