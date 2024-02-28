package ObjectsShoppingCartProgram;

public class Item {
	//private fields
	private Product product;
	private int quantity;
	
	//public API
	public Item(Product p, int q){
		this.product = p;
		this.quantity = q;
	}
	
	public Product getProduct() {
		return this.product;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public double getSubtotal() {
		return this.quantity * this.product.getProductPrice();
	}
}
