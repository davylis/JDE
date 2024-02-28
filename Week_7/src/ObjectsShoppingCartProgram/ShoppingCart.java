package ObjectsShoppingCartProgram;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class ShoppingCart {
	//private fields
	private ArrayList<Item> itemList;
	
	//public API
	public ShoppingCart() {
		this.itemList = new ArrayList<Item>();
	}
	
	public void add(Product product, int quantity) {
		Item item = new Item(product, quantity);
		this.itemList.add(item);
	}
	
	public void remove(Product product) {
		for(Item item : itemList) {
			if(item.getProduct() == product) {
				itemList.remove(item);
			}
		}
	}
	
	public double getTotalPrice() {
		double totalPrice = 0.0;
		for(Item item : itemList) {
			totalPrice += item.getSubtotal();
		}
		return totalPrice;
	}
	
	public String toString() {
		if(itemList.isEmpty()) {
			return "There are no items in the shopping cart.\n";
		}
		DecimalFormat twoDecimal = new DecimalFormat("0.00");
		String string = "=== Shopping cart ===\n";
		for(Item item : itemList) {
			Product currentProduct = item.getProduct();
			string += currentProduct.getProductNumber() + ": ";
			string += currentProduct.getProductName();
			string += ", quantity: " + item.getQuantity();
			string += ", unit price: " + twoDecimal.format(currentProduct.getProductPrice());
			string += ", subtotal: " + twoDecimal.format(item.getSubtotal()) + "\n";
		}
		string += "TOTAL PRICE: " + twoDecimal.format(getTotalPrice()) + " euros\n";
		return string;
	}
}
