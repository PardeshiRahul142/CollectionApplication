import java.util.ArrayList;
import java.util.Comparator;

// Product POJO class
class Product {
    private int productId;
    private String productName;
    private double price;

    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [ID=" + productId + ", Name=" + productName + ", Price=$" + price + "]";
    }
}

public class ProductInventory {
    private ArrayList<Product> products;

    public ProductInventory() {
        products = new ArrayList<>();
    }

    // Add product to inventory
    public void addProduct(Product product) {
        products.add(product);
    }

    // Generic method to count products above a given price
    public <T extends Number> int countProductsAbovePrice(T price) {
        double priceValue = price.doubleValue();
        int count = 0;
        for (Product product : products) {
            if (product.getPrice() > priceValue) {
                count++;
            }
        }
        return count;
    }

    // Update product price by ID
    public boolean updateProductPrice(int productId, double newPrice) {
        for (Product product : products) {
            if (product.getProductId() == productId) {
                product.setPrice(newPrice);
                return true;
            }
        }
        return false;
    }

    // Delete product by ID
    public boolean deleteProduct(int productId) {
        return products.removeIf(product -> product.getProductId() == productId);
    }

    // Display products sorted by price
    public void displaySortedProducts() {
        ArrayList<Product> sortedProducts = new ArrayList<>(products);
        sortedProducts.sort(Comparator.comparingDouble(Product::getPrice));
        System.out.println("Products sorted by price:");
        for (Product product : sortedProducts) {
            System.out.println(product);
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        ProductInventory inventory = new ProductInventory();

        // Adding sample products
        inventory.addProduct(new Product(1, "Laptop", 999.99));
        inventory.addProduct(new Product(2, "Phone", 499.99));
        inventory.addProduct(new Product(3, "Tablet", 299.99));
        inventory.addProduct(new Product(4, "Headphones", 89.99));

        // Test count products above price
        System.out.println("Products above $300: " + 
            inventory.countProductsAbovePrice(300.0));

        // Test update price
        System.out.println("\nUpdating price of product ID 2...");
        boolean updated = inventory.updateProductPrice(2, 599.99);
        System.out.println("Price update " + (updated ? "successful" : "failed"));

        // Test delete product
        System.out.println("\nDeleting product ID 3...");
        boolean deleted = inventory.deleteProduct(3);
        System.out.println("Deletion " + (deleted ? "successful" : "failed"));

        // Display sorted products
        System.out.println("\nSorted products:");
        inventory.displaySortedProducts();
    }
}