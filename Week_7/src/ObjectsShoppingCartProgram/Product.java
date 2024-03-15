package ObjectsShoppingCartProgram;

public class Product {
	// Private fields
	private int productNumber;
	private String productName;
	private double productPrice;
	
	//Public API
	public Product(int number, String name, double price) {
		this.productNumber = number;
		this.productName = name;
		this.productPrice = price;
	}
	public int getProductNumber() {
		return this.productNumber;
	}
	public void setProductNumber(int productNumber) {
		this.productNumber = productNumber;
	}
	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return this. productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
}
