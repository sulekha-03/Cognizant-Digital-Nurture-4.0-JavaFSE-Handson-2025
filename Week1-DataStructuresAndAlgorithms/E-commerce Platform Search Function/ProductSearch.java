import java.util.*;
public class ProductSearch {
	
	    public static Product linearSearch(Product[] products, int targetId) {
	        for (Product product : products) {
	            if (product.getProductId() == targetId) {
	                return product;
	            }
	        }
	        return null;
	    }

	    public static Product binarySearch(Product[] sortedProducts, int targetId) {
	        int low = 0;
	        int high = sortedProducts.length - 1;

	        while (low <= high) {
	            int mid = low + (high - low) / 2;
	            int currentId = sortedProducts[mid].getProductId();

	            if (currentId == targetId) {
	                return sortedProducts[mid];
	            } else if (currentId < targetId) {
	                low = mid + 1;
	            } else {
	                high = mid - 1;
	            }
	        }
	        return null;
	    }

	    public static void main(String[] args) {
	        // Create sample products
	        Product[] products = {
	            new Product(101, "Wireless Mouse", "Electronics", 25.39),
	            new Product(123, "Bluetooth Headphones", "Electronics", 59.74),
	            new Product(33, "Mixer", "Home Appliances", 89.33),
	            new Product(56, "Yoga Mat", "Fitness", 19.03)
	        };

	        // Linear search 
	        System.out.println("Linear Search Results:");
	        Product found = linearSearch(products, 123);
	        System.out.println(found != null ? found : "Product not found");

	        // Binary search 
	        java.util.Arrays.sort(products, (a, b) -> Integer.compare(a.getProductId(), b.getProductId()));
	        
	        System.out.println("\nBinary Search Results:");
	        found = binarySearch(products, 33);
	        System.out.println(found != null ? found : "Product not found");
	    }

}
