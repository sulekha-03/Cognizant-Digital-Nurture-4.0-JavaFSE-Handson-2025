
public class Product {
	 private int productId;
	    private String productName;
	    private String category;
	    private double price;

	    public Product(int productId, String productName, String category, double price) {
	        this.productId = productId;
	        this.productName = productName;
	        this.category = category;
	        this.price = price;
	    }

	    // Getters
	    public int getProductId() { return productId; }
	    public String getProductName() { return productName; }
	    public String getCategory() { return category; }
	    public double getPrice() { return price; }

	    @Override
	    public String toString() {
	        return "Product [ID: " + productId + 
	               ", Name: " + productName + 
	               ", Category: " + category + 
	               ", Price: $" + price + "]";
	    }

}
