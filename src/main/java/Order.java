import java.util.List;
import java.util.Map;

public class Order {
    private String id;
    private List<Product> orderedProducts;

    public Order(String id, List<Product> orderedProducts) {
        this.id = id;
        this.orderedProducts = orderedProducts;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Product> getOrderedProducts() {
        return orderedProducts;
    }

    public void setOrderedProducts(List< Product> orderedProducts) {
        this.orderedProducts = orderedProducts;
    }
}
