import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalCost() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return String.format("{\"name\": \"%s\", \"price\": %.2f, \"quantity\": %d}", name, price, quantity);
    }

    public int getQuantity() {
        return quantity;
    }
}

class Storage {
    private int capacity;
    private List<Product> products;

    public Storage(int capacity) {
        this.capacity = capacity;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        if (product.getQuantity() <= capacity) {
            products.add(product);
            capacity -= product.getQuantity();
        }
    }

    public double getTotalCost() {
        return products.stream().mapToDouble(Product::totalCost).sum();
    }

    public String getProducts() {
        StringBuilder sb = new StringBuilder();
        for (Product p : products) {
            sb.append(p.toString()).append("\n");
        }
        return sb.toString();
    }

    public int getCapacity() {
        return capacity;
    }
}

public class storage {
    public static void main(String[] args) {
        Product cucumber = new Product("cucumber", 1.50, 15);
        Product tomato = new Product("tomato", 0.90, 25);
        Product bread = new Product("bread", 1.10, 8);

        Storage storage = new Storage(50);
        storage.addProduct(cucumber);
        storage.addProduct(tomato);
        storage.addProduct(bread);

        System.out.print(storage.getProducts());
        System.out.println(storage.getCapacity());
        System.out.printf("%.2f%n", storage.getTotalCost());
    }
}
