import java.util.Map;

public class OrderRepo {
    private Map<String, Order> orderMap;

    public OrderRepo(Map<String, Order> orderMap) {
        this.orderMap = orderMap;
    }

    public Map<String, Order> list() {
        return orderMap;
    }
    public Order get(String id) {
        return orderMap.get(id);
    }

    // Methode, welche ein Element in die Map hinzufügt
    public void add(Order order){
        orderMap.put(order.getId(), order);
    }

}
