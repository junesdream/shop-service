import java.util.Map;

public class Order {
    private String id;
    private Map<String, Product> orderedProducts;

    public Order(String id, Map<String, Product> orderedProducts) {
        this.id = id;
        this.orderedProducts = orderedProducts;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Map<String, Product> getOrderedProducts() {
        return orderedProducts;
    }

    public void setOrderedProducts(Map<String, Product> orderedProducts) {
        this.orderedProducts = orderedProducts;
    }
}
