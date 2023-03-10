import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private String id;
    private List<Product> orderedProducts;
    private OrderStatus status;
    private LocalDateTime dateTime;

    public Order(String id, List<Product> orderedProducts, OrderStatus status, LocalDateTime dateTime) {
        this.id = id;
        this.orderedProducts = orderedProducts;
        this.status = status;
        this.dateTime = dateTime;
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

    public void setOrderedProducts(List<Product> orderedProducts) {
        this.orderedProducts = orderedProducts;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
